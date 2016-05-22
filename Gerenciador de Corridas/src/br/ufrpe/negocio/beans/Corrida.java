package br.ufrpe.negocio.beans;

import java.time.*;
import java.util.Random;
import java.time.temporal.ChronoUnit;

public class Corrida {
	private String granPrix;
	private Percurso percurso;
	private String descricao;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private double intervaloTempo;
	private double distanciaPercorrida;
	private double velocidadeMedia;
	private double ritmo;
	private boolean corridaIniciada;
	private boolean corridaFinalizada;
	
	public Corrida(String granPrix, Percurso percurso, String descricao){
		this.granPrix = granPrix;
		this.percurso = percurso;
		this.descricao = descricao;
		this.corridaIniciada = false;
		this.corridaFinalizada = false;
	}

	public String getGranPrix() {
		return granPrix;
	}

	public void setGranPrix(String granPrix) {
		this.granPrix = granPrix;
	}

	public Percurso getPercurso() {
		return percurso;
	}

	public void setPercurso(Percurso percurso) {
		this.percurso = percurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
		
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public double getRitmo() {
		return ritmo;
	}

	public void setRitmo(double ritmo) {
		this.ritmo = ritmo;
	}

	public boolean isCorridaIniciada() {
		return corridaIniciada;
	}

	public void setCorridaIniciada(boolean corridaIniciada) {
		this.corridaIniciada = corridaIniciada;
		setDataHoraInicio(LocalDateTime.now());
	}

	public boolean isCorridaFinalizada() {
		return corridaFinalizada;
	}

	public void setCorridaFinalizada(boolean corridaFinalizada) {
		this.corridaFinalizada = corridaFinalizada;
		setDataHoraFim(LocalDateTime.now());		
		
	}
	
	public void definirIntervaloTempo(){
		this.intervaloTempo = (double)dataHoraInicio.until(dataHoraFim, ChronoUnit.SECONDS);
	}
	
	public double getIntervaloTempo() {
		return intervaloTempo;
	}

	
	public void definirRitmo(double VelocidadeMedia){
		double x = 60/this.velocidadeMedia;
		setRitmo(x);
	}
	
	public boolean equals(Corrida b){
		boolean retorno = false;
		if(b != null){
			retorno = (this.corridaFinalizada == b.corridaFinalizada &&
					this.corridaIniciada == b.corridaIniciada &&
					this.dataHoraFim == b.dataHoraFim &&
					this.dataHoraInicio == b.dataHoraInicio &&
					this.descricao.equals(b.descricao) &&
					this.granPrix.equals(b.granPrix) &&
					this.distanciaPercorrida == b.distanciaPercorrida &&
					this.intervaloTempo == b.intervaloTempo &&
					this.ritmo == b.ritmo &&
					this.velocidadeMedia == b.velocidadeMedia &&
					this.percurso.equals(b.percurso));
		}
		return retorno;
	}

	public String toString(){
		return "\n\n**********\n"
				+ "Gran Prix: " + getGranPrix() + "\n"
				+ "Autódromo: " + percurso.getLocation() + "\n"
				+ "Início: " + getDataHoraInicio() + "\n"
				+ "Término: " + getDataHoraFim() + "\n"
				+ "Distância Total: " + getDistanciaPercorrida() + " Km\n"
				+ "Tempo de Prova: " + getIntervaloTempo() + " horas\n"
				+ "Velocidade Média: " + getVelocidadeMedia() + " Km/h\n"
				+ "Pace: " + getRitmo() + " min/Km\n";
	}
	
}
