package br.ufrpe.exceptions;

public class RaceNotFoundException extends Exception{
	
	public RaceNotFoundException(){
		super("GP n�o encontrado!");
	}
}
