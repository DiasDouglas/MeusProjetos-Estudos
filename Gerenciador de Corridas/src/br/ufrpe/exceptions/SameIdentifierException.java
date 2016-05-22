package br.ufrpe.exceptions;

import br.ufrpe.negocio.beans.*;

public class SameIdentifierException extends Exception{
	
	public SameIdentifierException(){
		super("Corrida com mesmo identificador de um Gran Prix anterior!");
	}

	
}
