package br.ufrpe.exceptions;

import br.ufrpe.negocio.beans.*;

public class PreviousRaceUnfinalizedException extends Exception{
	
	public PreviousRaceUnfinalizedException(Corrida ant, Corrida prox){
		super("Corrida anterior ainda em andamento!");
	}
	
}
