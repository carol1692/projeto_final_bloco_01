package confeitaria.repository;

import confeitaria.model.Produtos;

public interface confeitariaRepository {

	//	Métodos CRUD
	public void listarProdutos();
	public void criarProduto(Produtos produto);
	public void consultarProdutoId(int id);
	public void atualizar(Produtos produto);
	public void deletarProduto(int id);
}
