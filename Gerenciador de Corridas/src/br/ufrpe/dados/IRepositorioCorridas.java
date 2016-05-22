package br.ufrpe.dados;

import java.util.ArrayList;

import br.ufrpe.exceptions.*;
import br.ufrpe.negocio.beans.Corrida;

public interface IRepositorioCorridas {
	
	public ArrayList<Corrida> getListaCorridas();

	void cadastrarCorrida(Corrida c) throws PreviousRaceUnfinalizedException, SameIdentifierException;

	Corrida procurarCorrida(String granPrix) throws RaceNotFoundException;

	void UpdateCorrida(Corrida c);

	void DeletarCorrida(Corrida c);

}