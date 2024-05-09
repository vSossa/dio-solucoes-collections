package produtos;

import produtos.comparators.ComparatorPorPreco;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoDeProdutos {
	private Set<Produto> produtos;

	public ConjuntoDeProdutos() {
		this.produtos = new HashSet<>();
	}

	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		if (quantidade <= 0 || preco <= 0 || codigo <= 0) {
			System.out.println("ERRO: cadastro inválido.");
		}

		this.produtos.add( new Produto(codigo, nome, preco, quantidade) );
	}

	public void exibirProdutosPorNome() {
		TreeSet<Produto> psOrdenadoPorPreco = new TreeSet<>();
		if (this.produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return ;
		}

		psOrdenadoPorPreco.addAll(this.produtos);

		for (Produto p : psOrdenadoPorPreco) {
			System.out.println(p);
		}
		
	}

	public void exibirProdutosPorPreco() {
		TreeSet<Produto> psOrdenadoPorPreco = new TreeSet<>( new ComparatorPorPreco() );
		if (this.produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return ;
		}

		psOrdenadoPorPreco.addAll(this.produtos);

		for (Produto p : psOrdenadoPorPreco) {
			System.out.println(p);
		}
	}

	public void exibirProdutos() {
		if (this.produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return ;
		}
	
		for (Produto produto : this.produtos) {
			System.out.println(produto);	
		}	
	}
}
