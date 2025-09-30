package confeitaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import confeitaria.util.Cores;

public class Menu {

	private static final Scanner input = new Scanner(System.in);
//	private static final ContaController contaController = new ContaController();

	public static void main(String[] args) {
		
		int opcao;
		
//		criarProdutosTeste();
		
		while(true){
			
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"    		CONFEITARIA GUDI D+    		");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   1 - Criar Produto                    	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   2 - Listar todos os produtos         	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   3 - Buscar produto por Id      	    	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   4 - Atualizar Dados do produto       	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   5 - Apagar produto                   	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   0 - Sair                             	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"Entre com a opção desejada:             	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	" + Cores.TEXT_RESET);
			
			try {
				opcao = input.nextInt();
				input.nextLine();
			}catch(InputMismatchException e){
				opcao = -1;
				System.out.println("\nDigite um número inteiro entre 0 e 8");
				input.nextLine();
			}
			
			if(opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nCONFEITARIA GUDI D+ - AI Q VONTADE DE UM DOCINHO...");
				sobre();
				input.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Produto \n\n");
//					cadastrarConta();
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os produtos");
//					listarContas();
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar produto por Id\n\n");
//					procurarContaPorNumero();
					keyPress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados do produto \n\n");
//					atualizarConta();
					keyPress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta \n\n");
//					deletarConta();
					keyPress();
					break;
				default:
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção Inválida!\n");
					keyPress();
					break;
					
			}
		}		
		
	}
	
	public static void sobre() {
		System.out.println("\n********************************************************");
		System.out.println("		Projeto Desenvolvido por:		");
		System.out.println("		Ana Lemos - acsomel@outlook.com		");
		System.out.println("https://github.com/carol1692/projeto_final_bloco_01	");
		System.out.println("********************************************************");
	}
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		input.nextLine();
	}

}
