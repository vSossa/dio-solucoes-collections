package produtos;

import java.util.HashMap;

public class Estoque {
	private HashMap<Long, Produto> e;

	public Estoque() {
		this.e = new HashMap<>();
	}

	public void adicionarProduto(
		Long codigo, String nome, double preco, int quantidade) {
		if (codigo <= 0 || preco <= 0 || quantidade < 0) {
			System.out.println("Produto inválido.");
			return ;
		}

		this.e.put(codigo, new Produto(nome, preco, quantidade) );
	}

	public void mostrarProdutos() {
		if (this.e.isEmpty()) {
			System.out.println("Estoque vazio.");
			return ;
		}

		for (Long codigo : this.e.keySet()) {
			System.out.printf("%d: %s, %d x %.2f.%n",
							  codigo.longValue(), 
							  this.e.get(codigo).getNome(),
							  this.e.get(codigo).getQuantidade(),
							  this.e.get(codigo).getPreco());
		}
	}

	public void mostrarValorTotalNoEstoque() {
		double valorTotal = 0;
		if (this.e.isEmpty()) {
			System.out.println("Estoque vazio.");
			return ;
		}

		for (Produto p : this.e.values()) {
			valorTotal += p.getQuantidade() * p.getPreco();
		}

		System.out.printf("Valor total: %.2f.%n", 
						  valorTotal);
	}

	public void mostrarProdutoMaisCaro() {
		double precoMaximo = -1;
		Produto produtoComPrecoMaximo = null;
		Long codigoDoProdutoComPrecoMaximo = null;
		if (this.e.isEmpty()) {
			System.out.println("Estoque vazio.");
			return ;
		}

		for (Long codigo : this.e.keySet()) {
			Produto p = this.e.get(codigo);
			if (p.getPreco() >= precoMaximo) {
				precoMaximo = p.getPreco();
				codigoDoProdutoComPrecoMaximo = codigo;
				produtoComPrecoMaximo = p;	
			} 
		}

		System.out.printf("%d: %s, %d x %.2f.%n",
						  codigoDoProdutoComPrecoMaximo.longValue(), 
						  produtoComPrecoMaximo.getNome(),
						  produtoComPrecoMaximo.getQuantidade(),
						  precoMaximo);
	}

	public void mostrarProdutoMaisBarato() {
		double precoMinimo = -1;
		Produto produtoComPrecoMinimo = null;
		Long codigoDoProdutoComPrecoMinimo = null;
		if (this.e.isEmpty()) {
			System.out.println("Estoque vazio.");
			return ;
		}

		for (Long codigo : this.e.keySet()) {
			Produto p = this.e.get(codigo);
			if (codigoDoProdutoComPrecoMinimo == null) {
				precoMinimo = p.getPreco();
			}

			if (p.getPreco() <= precoMinimo) {
				precoMinimo = p.getPreco();
				codigoDoProdutoComPrecoMinimo = codigo;
				produtoComPrecoMinimo = p;	
			} 
		}

		System.out.printf("%d: %s, %d x %.2f.%n",
						  codigoDoProdutoComPrecoMinimo.longValue(), 
						  produtoComPrecoMinimo.getNome(),
						  produtoComPrecoMinimo.getQuantidade(),
						  precoMinimo);
	}

	public void mostrarProdutoComMaiorValorTotal() {
		double maiorValorTotal = -1;
		Produto produtoComMaiorValorTotal = null;
		Long codigoDoProdutoComMaiorValorTotal = null;
		if (this.e.isEmpty()) {
			System.out.println("Estoque vazio.");
			return ;
		}

		for (Long codigo : this.e.keySet()) {
			Produto p = this.e.get(codigo);
			if (p.getPreco() * p.getQuantidade() > maiorValorTotal) {
				maiorValorTotal = p.getPreco() * p.getQuantidade();
				codigoDoProdutoComMaiorValorTotal = codigo;
				produtoComMaiorValorTotal = p;	
			} 
		}

		System.out.printf("%d: %s, %.2f.%n",
						  codigoDoProdutoComMaiorValorTotal.longValue(), 
						  produtoComMaiorValorTotal.getNome(),
						  maiorValorTotal);
	}

	public void mostrarProdutoComMenorValorTotal() {
		double menorValorTotal = -1;
		Produto produtoComMenorValorTotal = null;
		Long codigoDoProdutoComMenorValorTotal = null;
		if (this.e.isEmpty()) {
			System.out.println("Estoque vazio.");
			return ;
		}

		for (Long codigo : this.e.keySet()) {
			Produto p = this.e.get(codigo);
			if (codigoDoProdutoComMenorValorTotal == null) {
				menorValorTotal = p.getPreco() * p.getQuantidade();
			}

			if (p.getPreco() * p.getQuantidade() <= menorValorTotal) {
				menorValorTotal = p.getPreco() * p.getQuantidade();
				codigoDoProdutoComMenorValorTotal = codigo;
				produtoComMenorValorTotal = p;	
			} 
		}

		System.out.printf("%d: %s, %.2f.%n",
						  codigoDoProdutoComMenorValorTotal.longValue(), 
						  produtoComMenorValorTotal.getNome(),
						  menorValorTotal);
	}
}
