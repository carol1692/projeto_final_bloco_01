package confeitaria.model;

public abstract class Produtos {
	
	private int id;
	private String nome;
	private int categoria;
	private float preco;
	private float peso;
	
	public Produtos(int id, String nome, int categoria, float preco, float peso) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getcategoria() {
		return categoria;
	}

	public void setcategoria(int categoria) {
		this.categoria = categoria;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void visualizar() {
			
			String categoria = " ";
			
			switch(this.categoria) {
				case 1 -> categoria = "Bolo";
				case 2 -> categoria = "Doce";
				default -> categoria = "Desconhecido";
		}
			System.out.println("\n******************************************************");
			System.out.println("Dados do Produto");
			System.out.println("******************************************************");
			System.out.printf("Id do produto %d%n", this.id);
			System.out.printf("Nome do produto: %s%n", this.nome);
			System.out.printf("categoria do produto: %s%n", categoria);
			System.out.printf("Peso do produto: %.3f%n", this.peso);
			System.out.printf("Preço do produto: %.2f%n", this.preco);
		}
	

}
