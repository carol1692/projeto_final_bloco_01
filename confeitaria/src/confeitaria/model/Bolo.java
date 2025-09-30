package confeitaria.model;

public class Bolo extends Produtos{
	private int subcategoria;
	private String sabor;
	
	public Bolo(int id, String nome, int categoria, float preco, float peso, int subcategoria, String sabor ) {
		super(id, nome, categoria, preco, peso);
		this.subcategoria = subcategoria;
		this.sabor = sabor;
	}

	public int getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(int subcategoria) {
		this.subcategoria = subcategoria;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Subcategoria: %s\n", this.subcategoria);
		System.out.printf("Sabor: %s\n", this.sabor);
	}
	
	
	
	
	
	
	

}
