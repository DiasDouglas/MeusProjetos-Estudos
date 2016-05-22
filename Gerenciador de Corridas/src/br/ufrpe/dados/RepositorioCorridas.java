package br.ufrpe.dados;

import java.util.Random;
import java.time.LocalDateTime;
import java.util.ArrayList;
import br.ufrpe.exceptions.*;
import br.ufrpe.negocio.beans.Corrida;

public class RepositorioCorridas implements IRepositorioCorridas {
	private ArrayList<Corrida> listaCorridas;
	private static RepositorioCorridas instance;
	private static int qtdCorridas = 0;
	
	private RepositorioCorridas(){
		listaCorridas = new ArrayList<Corrida>();
	}
	
	public static RepositorioCorridas getInstance(){
		if(instance == null){
			instance = new RepositorioCorridas();
		}
		return instance;
	}
	
	public static int getQtdCorridas(){
		return qtdCorridas;
	}
	
	public ArrayList<Corrida> getListaCorridas() {
		return listaCorridas;
	}

	/* (non-Javadoc)
	 * @see br.ufrpe.dados.IRepositorioCorridas#cadastrarCorrida(br.ufrpe.negocio.beans.Corrida)
	 */
	@Override
	public void cadastrarCorrida(Corrida c) throws PreviousRaceUnfinalizedException, SameIdentifierException{
		if(qtdCorridas == 0){
			listaCorridas.add(c);
			qtdCorridas++;
		}
		else{
			if(this.listaCorridas.get(qtdCorridas - 1).isCorridaFinalizada()){
				int cont = 0;
				for(int i = 0; i < this.listaCorridas.size(); i++){
					if(this.listaCorridas.get(i).getGranPrix().equals(c.getGranPrix())){
						cont++;
					}
				}
				if(cont == 0){
					listaCorridas.add(c);
					qtdCorridas++;
				}
				else{
					SameIdentifierException ex1 = 
							new SameIdentifierException();
					throw ex1;
				}
			}
			else{
				PreviousRaceUnfinalizedException ex2 = 
						new PreviousRaceUnfinalizedException(c, this.listaCorridas.get(qtdCorridas - 1));
				throw ex2;
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.dados.IRepositorioCorridas#procurarCorrida(java.lang.String)
	 */
	@Override
	public Corrida procurarCorrida(String granPrix) throws RaceNotFoundException{
		Corrida retorno = null;
		for(int i = 0; i < this.qtdCorridas; i++){
			if(this.listaCorridas.get(i).getGranPrix().equals(granPrix)){
				retorno = listaCorridas.get(i);
			}
		}
		if(retorno == null){
			RaceNotFoundException rnfe = 
					new RaceNotFoundException();
			throw rnfe;
		}
		
		return retorno;
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.dados.IRepositorioCorridas#UpdateCorrida(java.lang.String)
	 */
	@Override
	public void UpdateCorrida(Corrida c){
		Corrida Update;
		
		try{
			Update = procurarCorrida(c.getGranPrix());
		
		if(Update != null && Update.isCorridaIniciada() == false){
			Update.setCorridaIniciada(true);
		}
		else if(Update != null && Update.isCorridaFinalizada() == false){
			Update.setCorridaFinalizada(true);
			Random r = new Random();
			double distancia = (double)r.nextInt((500 - 300)) + 300;
			c.setDistanciaPercorrida(distancia);
			c.definirIntervaloTempo();
			c.setVelocidadeMedia(distancia/c.getIntervaloTempo());
			c.definirRitmo(c.getVelocidadeMedia());
		}
		}
		catch(RaceNotFoundException ex3){
			System.out.println(ex3.getMessage());
		}
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.dados.IRepositorioCorridas#DeletarCorrida(java.lang.String)
	 */
	@Override
	public void DeletarCorrida(Corrida c){
		Corrida delete;
		try{
			delete = procurarCorrida(c.getGranPrix());
		if(delete != null && this.listaCorridas.contains(delete)){
			 this.listaCorridas.remove(delete);
			 qtdCorridas--;
		}
		}
		catch(RaceNotFoundException ex3){
			System.out.println(ex3.getMessage());
		}
	}
}
