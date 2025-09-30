package confeitaria.controller;

import java.util.ArrayList;
import java.util.List;

import confeitaria.model.Produtos;
import confeitaria.repository.confeitariaRepository;

public class confeitariaController implements confeitariaRepository {
	
	private List<Produtos> listaProdutos = new ArrayList<Produtos>();
	int id = 0;
	
	@Override
	public void listarProdutos() {
		for(var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void criarProduto(Produtos produto) {
		listaProdutos.add(produto);
		System.out.println("Produto Cadastrado com sucesso!");
	}

	@Override
	public void consultarProdutoId(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Produtos produto) {
		var buscarProduto = buscarNaCollection(produto.getId());
		
		if(buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.printf("\nA O produto: %d foi atualizado com sucesso!%n", produto.getId());
		}else {
			System.out.printf("\nA Conta número: %d não foi encontrada!%n", produto.getId());
		}
	}

	@Override
	public void deletarProduto(int id) {
		var conta = buscarNaCollection(id);
				
				if(conta != null) {
					if(listaProdutos.remove(conta) == true) {
						System.out.printf("\nO produto com id %d foi deletada com sucesso!%n", id);
					}
				}else {
					System.out.printf("\nO produto com id: %d não foi encontrado!%n", id);
				}

	}
	
//	Métodos Auxiliares
	public int gerarId() {
		return ++ id;
	}
	
	public Produtos buscarNaCollection(int id) {
		for( var produto : listaProdutos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
}
