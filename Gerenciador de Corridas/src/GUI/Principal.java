package GUI;

import br.ufrpe.negocio.GerenciadorPessoalCorridas;
import br.ufrpe.negocio.beans.*;
import br.ufrpe.dados.RepositorioCorridas;
import br.ufrpe.exceptions.*;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		RepositorioCorridas repositorio = RepositorioCorridas.getInstance();
		GerenciadorPessoalCorridas gerenciador = new GerenciadorPessoalCorridas(repositorio);
		
		//Percursos
		Percurso p1 = new Percurso("Melbourne", "https://www.google.com.br/maps"
				+ "/place/Albert+Park+VIC+3206,+Austr%C3%A1lia/@-37.8455171,144."
				+ "9609444,4680m/data=!3m1!1e3!4m5!3m4!1s0x6ad667e1dead25bd:0x504"
				+ "5675218ce8a0!8m2!3d-37.8412071!4d144.9540662?hl=pt-BR");
		Percurso p2 = new Percurso("Sakhir", "https://www.google.com.br/maps/pl"
				+ "ace/Circuito+Internacional+de+Bahrein/@26.0303656,50.5125293"
				+ ",1883m/data=!3m1!1e3!4m5!3m4!1s0x3e484d66f7114f99:0xb08bbfbd"
				+ "c59c2dc!8m2!3d26.0316!4d50.5129?hl=pt-BR");
		Percurso p3 = new Percurso("Shanghai", "https://www.google.com.br/maps/"
				+ "place/Shanghai+International+Circuit/@31.3400783,121.2226128"
				+ ",2531m/data=!3m1!1e3!4m5!3m4!1s0x35b2424a308e7323:0x1bf72b82"
				+ "8b88b94d!8m2!3d31.339499!4d121.221638?hl=pt-BR");
		Percurso p4 = new Percurso("Sochi", "https://www.google.com.br/maps/plac"
				+ "e/Sochi+Autodrom/@43.4092355,39.9704493,5432m/data=!3m1!1e3!4"
				+ "m5!3m4!1s0x40f59514657440c9:0x876213fab509159a!8m2!3d43.41005"
				+ "93!4d39.9688089?hl=pt-BR");
		Percurso p5 = new Percurso("Catalunya", "https://www.google.com.br/maps/"
				+ "place/Circuit+de+Catalunya/@41.5692692,2.2585819,1870m/data=!"
				+ "3m1!1e3!4m5!3m4!1s0x12a4b88458c27ef7:0x25e78a0a096d6929!8m2!3"
				+ "d41.5725031!4d2.2557595?hl=pt-BR");
		Percurso p6 = new Percurso("Monte Carlo", "https://www.google.com.br/maps"
				+ "/place/Monte+Carlo,+Monaco-Ville,+M%C3%B4naco/@43.738887,7.424"
				+ "0771,1785m/data=!3m1!1e3!4m5!3m4!1s0x12cdc287dedfadcd:0xee1529"
				+ "6ed95b686c!8m2!3d43.7400718!4d7.4266436?hl=pt-BR");
		Percurso p7 = new Percurso("Montreal", "https://www.google.com.br/maps/pl"
				+ "ace/Circuit+Gilles+Villeneuve/@45.5042169,-73.5251267,2473m/da"
				+ "ta=!3m1!1e3!4m5!3m4!1s0x4cc91ae0e99de82f:0xe0144f3fc885389b!8m"
				+ "2!3d45.5032189!4d-73.5266876?hl=pt-BR");
		Percurso p8 = new Percurso("Baku", "https://www.google.com.br/maps/place/"
				+ "Baku,+Azerbaij%C3%A3o/@40.3929549,49.8849509,15175m/data=!3m1!"
				+ "1e3!4m5!3m4!1s0x40307d6bd6211cf9:0x343f6b5e7ae56c6b!8m2!3d40.4"
				+ "092617!4d49.8670924?hl=pt-BR");
		Percurso p9 = new Percurso("Spielberg", "https://www.google.com.br/maps/p"
				+ "lace/Red+Bull+Ring/@47.2227919,14.7623929,1222m/data=!3m1!1e3!"
				+ "4m5!3m4!1s0x4771ceca98571cb9:0xc879add4ea5c7884!8m2!3d47.22296"
				+ "38!4d14.7587157?hl=pt-BR");
		Percurso p10 = new Percurso("Silverstone", "https://www.google.com.br/map"
				+ "s/place/Silverstone/@52.0709882,-1.0166066,1988m/data=!3m1!1e3"
				+ "!4m5!3m4!1s0x48771c5823926c25:0x1142afb591c324a6!8m2!3d52.0733"
				+ "006!4d-1.0146634?hl=pt-BR");
		Percurso p11 = new Percurso("Budapest", "https://www.google.com.br/maps/p"
				+ "lace/Hungaroring/@47.5828777,19.2500975,1416m/data=!3m1!1e3!4m"
				+ "5!3m4!1s0x4741cf9b8251d89f:0x37bb8697bf01f56f!8m2!3d47.5817111"
				+ "!4d19.2506106?hl=pt-BR");
		Percurso p12 = new Percurso("Hockenheim", "https://www.google.com.br/maps"
				+ "/place/Hockenheimring/@49.3300771,8.5743792,1625m/data=!3m1!1e"
				+ "3!4m5!3m4!1s0x4797b9ae72985095:0xc660e6bc36df407!8m2!3d49.3298"
				+ "956!4d8.5709249?hl=pt-BR");
		Percurso p13 = new Percurso("Spa", "https://www.google.com.br/maps/place/"
				+ "Circuit+de+Spa-Francorchamps/@50.4366254,5.9698317,2380m/data="
				+ "!3m1!1e3!4m5!3m4!1s0x47c07b5c0460f737:0x78105e8819c35c0e!8m2!3"
				+ "d50.4369118!4d5.97205?hl=pt-BR");
		Percurso p14 = new Percurso("Monza", "https://www.google.com.br/maps/plac"
				+ "e/Circuito+de+Monza/@45.6206985,9.2854064,2749m/data=!3m1!1e3!"
				+ "4m5!3m4!1s0x4786ba360e48bd7d:0x645e7ef5a9d3a632!8m2!3d45.62179"
				+ "9!4d9.2848?hl=pt-BR");
		Percurso p15 = new Percurso("Cingapura", "https://www.google.com.br/maps/"
				+ "place/Circuit+Rd,+Cingapura/@1.2908835,103.8638901,5918m/data="
				+ "!3m1!1e3!4m5!3m4!1s0x31da18209905ad23:0xbef06b7889dbb35c!8m2!3"
				+ "d1.3265763!4d103.8852908?hl=pt-BR");
		Percurso p16 = new Percurso("Kuala Lumpur", "https://www.google.com.br/ma"
				+ "ps/place/Circuito+Internacional+de+Sepang/@2.7603208,101.73738"
				+ "16,1242m/data=!3m1!1e3!4m5!3m4!1s0x31cdbf398d4aded7:0xb8bc177e"
				+ "144ada57!8m2!3d2.7594144!4d101.7317775?hl=pt-BR");
		Percurso p17 = new Percurso("Suzuka", "https://www.google.com.br/maps/pla"
				+ "ce/Circuito+de+Suzuka/@34.8440186,136.5324426,2038m/data=!3m1!"
				+ "1e3!4m5!3m4!1s0x60038a958a96b7cd:0x86c145fa360123dc!8m2!3d34.8"
				+ "455935!4d136.5389522?hl=pt-BR");
		Percurso p18 = new Percurso("Austin", "https://www.google.com.br/maps/pla"
				+ "ce/Circuit+of+the+Americas/@30.1354231,-97.6340863,2030m/data="
				+ "!3m1!1e3!4m5!3m4!1s0x8644b03ad152eaf9:0x8ae827dd1ff5e0ed!8m2!3"
				+ "d30.1345808!4d-97.6358511?hl=pt-BR");
		Percurso p19 = new Percurso("Mexico City", "https://www.google.com.br/map"
				+ "s/place/Aut%C3%B3dromo+Hermanos+Rodriguez/@19.4016805,-99.0898"
				+ "091,1397m/data=!3m1!1e3!4m5!3m4!1s0x85d1fc2157a79377:0x33ff658"
				+ "1b240a2dd!8m2!3d19.4034591!4d-99.0887832?hl=pt-BR");
		Percurso p20 = new Percurso("São Paulo", "https://www.google.com.br/maps/"
				+ "place/Aut%C3%B3dromo+Jos%C3%A9+Carlos+Pace/@-23.7015503,-46.69"
				+ "65936,1355m/data=!3m1!1e3!4m5!3m4!1s0x94ce4fc83e9584af:0x2ffcd"
				+ "c07da2ca5c0!8m2!3d-23.701185!4d-46.6979544?hl=pt-BR");
		Percurso p21 = new Percurso("Abu Dhabi", "https://www.google.com.br/maps/"
				+ "place/Yas+Marina+Cuircuit/@24.4701834,54.605247,2267m/data=!3m"
				+ "1!1e3!4m5!3m4!1s0x3e5e4586b7fd939d:0x78e0da7333197e9e!8m2!3d24"
				+ ".4722508!4d54.6048804?hl=pt-BR");
		
		//Testar corridas e repositórios
		
		Corrida c1 = new Corrida("2016 Australian F1 Gran Prix", p1, "Alberta Park Road Circuit");
		try{
			repositorio.cadastrarCorrida(c1);
		}
		catch(PreviousRaceUnfinalizedException ex1){
			System.out.println(ex1.getMessage());
			System.out.println("Para adicionar uma nova corrida, a anterior"
					+ " precisa ser finalizada.");
		}
		catch(SameIdentifierException ex2){
			System.out.println(ex2.getMessage());
			System.out.println("Verifique novamente o nome do Gran Prix que você deseja adicionar");
		}
		
		Corrida c2 = new Corrida("2016 Bahrein F1 Gran Prix", p2, "Bahrein International Circuit");
		try{
			repositorio.cadastrarCorrida(c2);
		}
		catch(PreviousRaceUnfinalizedException ex1){
			System.out.println(ex1.getMessage());
			System.out.println("Para adicionar uma nova corrida, a anterior"
					+ " precisa ser finalizada.");
		}
		catch(SameIdentifierException ex2){
			System.out.println(ex2.getMessage());
			System.out.println("Verifique novamente o nome do Gran Prix que você deseja adicionar");
		}
		
		gerenciador.comecarACorrer(c1);
		System.out.println("O "+ c1.getGranPrix()+ " começou!");
		entrada.nextLine();
		gerenciador.pararDeCorrer(c1);
		System.out.println("O "+ c1.getGranPrix()+ " terminou!");
		
		
		try{
			repositorio.cadastrarCorrida(c2);
		}
		catch(PreviousRaceUnfinalizedException exc){
			System.out.println(exc.getMessage());
			System.out.println("Para adicionar uma nova corrida, a anterior"
					+ " precisa ser finalizada.");
		}
		catch(SameIdentifierException ex2){
			System.out.println(ex2.getMessage());
			System.out.println("Verifique novamente o nome do Gran Prix que você deseja adicionar");
		}
		gerenciador.comecarACorrer(c2);
		entrada.nextLine();
		gerenciador.pararDeCorrer(c2);
		
		Corrida c3 = new Corrida("2016 Australian F1 Gran Prix", p1, " Park Road Circuit"); //2016 de novo
		
		try{
			repositorio.cadastrarCorrida(c3);
		}
		catch(PreviousRaceUnfinalizedException exc){
			System.out.println(exc.getMessage());
			System.out.println("Para adicionar uma nova corrida, a anterior"
					+ " precisa ser finalizada.");
		}
		catch(SameIdentifierException ex2){
			System.out.println(ex2.getMessage());
			System.out.println("Verifique novamente o nome do Gran Prix que você deseja adicionar");
		}
		
		
		Corrida c4 = new Corrida("2017 Australian F1 Gran Prix", p1, " Park Road Circuit"); //2017
		
		try{
			repositorio.cadastrarCorrida(c4);
		}
		catch(PreviousRaceUnfinalizedException exc){
			System.out.println(exc.getMessage());
			System.out.println("Para adicionar uma nova corrida, a anterior"
					+ " precisa ser finalizada.");
		}
		catch(SameIdentifierException ex2){
			System.out.println(ex2.getMessage());
			System.out.println("Verifique novamente o nome do Gran Prix que você deseja adicionar");
		}
		
		
		System.out.println(gerenciador.listaCorridasExecutadas());
	}
	
	

}
