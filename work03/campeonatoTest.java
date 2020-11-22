package work03;

import java.util.Scanner;

public class campeonatoTest {

	static Scanner reading = new Scanner(System.in);
	static int numeroTimes = 50;
	static Cadastro[] times = new Cadastro[numeroTimes];
	static Cadastro time1 = new Cadastro();
	static Cadastro nomeTime = new Cadastro();
	static Cadastro estado = new Cadastro();
	
	public static void main(String[] args) {
		
		System.out.println("    BEM VINDO AO MENU DO CAMPEONATO   ");
		System.out.println();
		
		readMenu();
		System.out.println("Digite a opção desejada:");
			time1.menu = reading.nextInt();   reading.nextLine();
			optionMenu();
		
		reading.close();

	}
	
	public static void readMenu() {
		
		System.out.println("Digite 1 – Cadastrar Time");
		System.out.println("Digite 2 – Editar Time");
		System.out.println("Digite 3 – Excluir Time");
		System.out.println("Digite 4 – Cadastrar Jogo");
		System.out.println("Digite 5 – Editar Jogo");
		System.out.println("Digite 6 – Excluir Jogo");
		System.out.println("Digite 7 – Listar Classificação do Campeonato");
		System.out.println("Digite 9 - Sair");
		System.out.println();
	}
	public static void readMenu1() {
		
		System.out.println("   ESCOLHA UMA OPÇÃO   ");
		System.out.println("CADASTRAR TIMES");
        System.out.println();
		System.out.println("Digite 1 – Nome do time e Estado de Origem");
		System.out.println("Digite 2 – Mostrar times cadastrados");
		System.out.println("Digite qualquer outra opção para retornar");
		System.out.println();
	    
		System.out.println("Digite sua opção:");
		    time1.cadastroTime = reading.nextInt();    reading.nextLine();
		    
		    if (time1.cadastroTime == 1) {
		    	
		    	for (int i = 0; i < 1; i++) {
		    		
		    		System.out.println("Insira o nome do seu time");
	    	            time1.nomeTime = reading.nextLine();

	    	        System.out.println("Digite o Estado (em siglas) de origem do seu clube");
			    	System.out.println("Ex: Bahia = BA, São Paulo = SP");
			    	        time1.estado = reading.nextLine();
			    	        
	    	            times[i] = time1;
	    	            readMenu1();
	    	            
		    	}
		    	
		    } else if (time1.cadastroTime == 2) {
		    	System.out.println("Times cadastrados");
 	            System.out.println();
 	            
 	                for (int i = 0; i < numeroTimes; i++) {
 	                	
 	                    System.out.println(times[i].nomeTime + "-" + times[i].estado);
 	                    
 	                }
 	               readMenu1();
 	            
		    } else {
 	            System.out.println();
		    	readMenu();
		    }
	}
	public static void readMenu2() {
		
		System.out.println("   ESCOLHA UMA OPÇÃO   ");
		System.out.println("EDITAR TIMES");
		System.out.println("Digite 1 – Renomear");
		System.out.println("Digite 2 – Alterar o estado de origem");
		System.out.println("Digite qualquer outra opção para retornar");
		System.out.println();
		
		System.out.println("Digite sua opção:");
		    time1.editarTime = reading.nextInt();    reading.nextLine();
		    
		    if (time1.editarTime == 1) {
		    	System.out.println("Digite o novo nome do seu time");
	    	        time1.renomearTime = reading.nextLine();
	    	        time1.nomeTime = time1.renomearTime;
	    	        readMenu2();
		    	
		    } else if (time1.editarTime == 2) {
		    	System.out.println("Digite o novo Estado de origem do seu clube");
	    	        time1.renomearEstado = reading.nextLine();
	    	        time1.estado = time1.renomearEstado;
		    	    readMenu2();
		    } else {
		    	readMenu();
		    	
		    }
	}
	public static void readMenu3() {
		
		System.out.println("   ESCOLHA UMA OPÇÃO   ");
		System.out.println("EXCLUIR TIME");
		System.out.println();
		
	}
	public static void readMenu4() {
		
		System.out.println("   ESCOLHA UMA OPÇÃO   ");
		System.out.println("CADASTRAR JOGO");
		System.out.println();
		System.out.println("Digite 1 – Time mandante");
		System.out.println("Digite 2 – Time visitante");
		System.out.println("Digite 3 – Gols time mandante");
		System.out.println("Digite 4 – Gols time visitante");
		System.out.println("Digite qualquer outra opção para retornar");
		
		System.out.println("Digite sua opção:");
		    time1.cadastroJogo = reading.nextInt();   reading.nextLine();
		    
		    if (time1.cadastroJogo == 1) {
		    	System.out.println("Digite o nome do time mandante:");
		    	    time1.timeMand = reading.nextLine();
		    	    readMenu4();
		    	    
		    } else if (time1.cadastroJogo == 2) {
		    	System.out.println("Digite o nome do time visitante:");
		    	    time1.timeVisit = reading.nextLine();
		    	    readMenu4();
		    	
		    } else if (time1.cadastroJogo == 3) {
		    	System.out.println("Quantos gols " + time1.timeMand + " fez:");
		    	    time1.golsMand = reading.nextInt();   reading.nextLine();
		    	    readMenu4();
		    	    verificarVitoria();
		    	
		    } else if (time1.cadastroJogo == 4) {
		    	System.out.println("Quantos gols " + time1.timeVisit + " fez:");
		    	    time1.golsVisit = reading.nextInt();   reading.nextLine();
		    	    readMenu4();
		    	    verificarVitoria();
		    	
		    } else {
		    	readMenu4();
		    }
	}
    public static void verificarVitoria() {
		
		time1.saldoMandante = time1.golsMand - time1.golsVisit;
		time1.saldoVisitante = time1.golsVisit - time1.golsMand;
		
		time1.timeMandante = 0;
		time1.timeVisitante = 0;
		
		if (time1.golsMand > time1.golsVisit) {
			time1.timeMandante = +3;
			
		} else if (time1.golsMand < time1.golsVisit) {
			time1.timeVisitante = +3;
			
		} else if (time1.golsMand == time1.golsVisit) {
			time1.timeMandante = +1;
			time1.timeVisitante = +1;
			
		}
		System.out.println(time1.timeMand + "-" + time1.estado + " " + time1.timeMandante + " Pontos " 
		    + "Saldo de gols " + time1.saldoMandante);
		System.out.println(time1.timeVisit + "-" + time1.estado + " " + time1.timeVisitante + " Pontos "
		    + "Saldo de gols " + time1.saldoVisitante);
	}
	public static void readMenu5() {
		
		System.out.println("   ESCOLHA UMA OPÇÃO   ");
		System.out.println("EDITAR JOGO");
		System.out.println();
		
	}
	public static void readMenu6() {
		
		System.out.println("   ESCOLHA UMA OPÇÃO   ");
		System.out.println("EXCLUIR JOGO");
		System.out.println();
	}
	public static void readMenu7() {
		
		System.out.println("   ESCOLHA UMA OPÇÃO   ");
		System.out.println("CLASSIFICAÇÃO DO CAMPEONATO");
		System.out.println();
		
		for (int i = 0; i < numeroTimes; i++) {
			
			System.out.println(times[i].nomeTime+ "-" + times[i].estado + " | " + " pontos " + " | " + " saldo de gols ");
			
			
			times[i] = nomeTime;
			times[i] = estado;
		}
	}
	public static void optionMenu() {
		
		if (time1.menu == 1) {
			readMenu1();
			
		} else if (time1.menu == 2) {
			readMenu2();
			
		} else if (time1.menu == 3) {
			readMenu3();
			
		} else if (time1.menu == 4) {
			readMenu4();
			
		} else if (time1.menu == 5) {
			readMenu5();
			
		} else if (time1.menu == 6) {
			readMenu6();
			
		} else if (time1.menu == 7) {
			readMenu7();
			
		} else if (time1.menu == 9) {
			System.out.println("Você está saindo do app!");
			System.out.println("FIM");	
			
		} else {
			System.out.println("Desculpe, opção invalida, escolha outra opção!");
			System.out.println();
			readMenu();
			
		}
	}
  
}
