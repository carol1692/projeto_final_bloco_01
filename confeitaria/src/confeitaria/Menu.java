package confeitaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import confeitaria.controller.confeitariaController;
import confeitaria.model.Bolo;
import confeitaria.model.Doce;
import confeitaria.model.Produtos;
import confeitaria.util.Cores;

public class Menu {

	private static final Scanner input = new Scanner(System.in);
	private static final confeitariaController confeitariaController = new confeitariaController();

	public static void main(String[] args) {
		
		int opcao;
		
		criarProdutosTeste();
		
		while(true){
			
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"    		CONFEITARIA GUDI D+    		");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"****************************************	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"                                        	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   1 - Criar Produto                    	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   2 - Listar todos os produtos         	");
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"   3 - Buscar produto por Id (EM BREVE)	    	");
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
					criarProduto();
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os produtos");
					listarProdutos();
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar produto por Id\n\n");
//					procurarContaPorNumero();
					keyPress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados do produto \n\n");
					atualizarProduto();
					keyPress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta \n\n");
					deletarProduto();
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
	
	private static void criarProdutosTeste() {
		confeitariaController.criarProduto(new Bolo(confeitariaController.gerarId(), "Bolo chocolatudo", 1 , 17.00f, 0.5f, 1, "Ameixa"));
		confeitariaController.criarProduto(new Bolo(confeitariaController.gerarId(), "Bolo limão", 1 , 17.00f, 0.500f, 1, "Brigadeiro"));
		confeitariaController.criarProduto(new Doce(confeitariaController.gerarId(), "Torta", 2 , 10.00f, 0.2f, 1, "Jujuba"));
		confeitariaController.criarProduto(new Doce(confeitariaController.gerarId(), "Cookie", 1 , 37.00f, 0.5f, 2, "Brigadeiro"));
		
	}
	
	private static void listarProdutos() {
		confeitariaController.listarProdutos();
	}
	
	private static void criarProduto() {
			
			System.out.println("Digite o nome do produto: ");
			String nome = input.nextLine();
			
			System.out.println("Digite a categoria do produto (1 - Bolos ou 2 - Doces): ");
			int categoria = input.nextInt();
			
			System.out.println("Digite o preço do produto: ");
			float preco = input.nextFloat();
			
			System.out.println("Digite o peso do produto: ");
			float peso = input.nextFloat();
			
			switch(categoria) {
			case 1 ->{
				System.out.println("Digite a subcategoria do Bolo (1 - Aniversário ou 2 - Caseiro da Vovó): ");
				int subcategoria = input.nextInt();
				
				System.out.println("Digite o sabor do Bolo: ");
				input.skip("\\R");
				String sabor = input.nextLine();
				
				confeitariaController.criarProduto(new Bolo(confeitariaController.gerarId(), nome, categoria, preco, peso, subcategoria, sabor));
			}
			case 2 -> {
				System.out.println("Digite a subcategoria do Doce (1 - Torta ou 2 - Cookie): ");
				
				int subcategoria = input.nextInt();
				System.out.println("Digite o sabor do Doce: ");
				input.skip("\\R");
				String sabor = input.nextLine();
				
				
				
				confeitariaController.criarProduto(new Doce(confeitariaController.gerarId(), nome, categoria, preco, peso, subcategoria, sabor));
			}
			default -> System.out.println(Cores.TEXT_RED + "Tipo de categoria inválida!" + Cores.TEXT_RESET);
			}
	}
	
	private static void atualizarProduto() {
			
			System.out.print("Digite o id do produto: ");
			int id = input.nextInt();
			input.nextLine();
			
			Produtos produto = confeitariaController.buscarNaCollection(id);
			
			if(produto != null) {
				
				
				String nome = produto.getNome();
				int categoria = produto.getcategoria();
				float preco = produto.getPreco();
				float peso = produto.getPeso();
								
				System.out.printf("O nome atual do produto: %s\nNovo nome (Pressione ENTER para manter o nome atual): ", nome);
				String entrada = input.nextLine();
				nome = entrada.isEmpty() ? nome : entrada;
				
				System.out.printf("O preço atual: %s\nNovo preço (Pressione ENTER para manter o valor atual): ", preco);
				entrada = input.nextLine();
				preco = entrada.isEmpty() ? preco : Integer.parseInt(entrada);
				
				System.out.printf("O peso atual: %s\nNovo peso (Pressione ENTER para manter o valor atual): ", peso);
				entrada = input.nextLine();
				peso = entrada.isEmpty() ? peso : Integer.parseInt(entrada);
				
				switch(categoria) {
				case 1 ->{
					int subcategoria = ((Bolo) produto).getSubcategoria();
					
					String sabor = ((Bolo) produto).getSabor();
					System.out.printf("O sabor atual: %s\nNovo sabor(Pressione ENTER para manter o valor atual): ", sabor);
					entrada = input.nextLine();
					sabor = entrada.isEmpty() ? sabor : entrada;
					
					confeitariaController.atualizar(new Bolo(id, nome, categoria, preco, peso, subcategoria, sabor));
				}
				case 2 -> {
					
					int subcategoria = ((Doce) produto).getSubcategoria();
					
					String sabor = ((Doce) produto).getSabor();
					System.out.printf("O sabor atual: %s\nNovo sabor(Pressione ENTER para manter o valor atual): ", sabor);
					entrada = input.nextLine();
					sabor = entrada.isEmpty() ? sabor : entrada;
					
					confeitariaController.atualizar(new Doce(id, nome, categoria, preco, peso, subcategoria, sabor));
				}
				default -> System.out.println(Cores.TEXT_RED + "Tipo de produto inválido!" + Cores.TEXT_RESET);
				}
				
			}else {
				System.out.printf("\nA produto com id %d não foi encontrada!", id);
			}
	}
	
	private static void deletarProduto() {
		
		System.out.print("Digite o id do produto: ");
		int id = input.nextInt();
		input.nextLine();
		
		Produtos produto = confeitariaController.buscarNaCollection(id);
		
		if(produto != null) {
		
			System.out.print("\nTem certeza que deseja excluir este produto? (S/N): ");
			String confirmacao = input.nextLine();
			
			
			if(confirmacao.equalsIgnoreCase("S")) {
				confeitariaController.deletarProduto(id);
			}else {
				System.out.println("\nOperação cancelada!");
			}
			
		}else {
			System.out.printf("\nO produto %d não foi encontrado!", id);
		}
	}
		
	
	

}
