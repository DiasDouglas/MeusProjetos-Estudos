package br.ufrpe.negocio;

import java.util.List;
import java.util.ArrayList;
import br.ufrpe.dados.*;
import br.ufrpe.negocio.beans.*;

public class GerenciadorPessoalCorridas {
	private IRepositorioCorridas repositorio;
	
	public GerenciadorPessoalCorridas(IRepositorioCorridas instanciaInterface){
		this.repositorio = instanciaInterface;
	}
	
	public void comecarACorrer(Corrida c){
		c.setCorridaIniciada(true);
	}
	
	public void pararDeCorrer(Corrida c){
		repositorio.UpdateCorrida(c);
	}
	
	public List<Corrida> listaCorridasExecutadas(){
		ArrayList<Corrida> toPrint = new ArrayList<Corrida>();
		ArrayList<Corrida> toCheck = this.repositorio.getListaCorridas();
		for(int i = 0; i < toCheck.size(); i++){
			if(toCheck.get(i).isCorridaFinalizada()){
				toPrint.add(toCheck.get(i));
			}
		}
		return toPrint;
	}
}
