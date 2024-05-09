package compras;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Item> carrinho;

	public CarrinhoDeCompras() {
		this.carrinho = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		int idx = -1;

		if ( preco <= 0 || quantidade <= 0 ) {
			System.out.println("ERRO: produto inválido.");
		}
		
		idx = contemItem(nome);	

		if (idx >= 0) {
			this.carrinho.get(idx).adicionarMais(quantidade);
		} else {		
			this.carrinho.add( new Item(nome, preco, quantidade) );
		}

		System.out.println("Item adicionado.");
	}

	public void removerItem(String nome) {
		int idx = 0;
		int tamanho = this.carrinho.size();

		if (this.carrinho.isEmpty()) {
			System.out.println("O carrinho já está vazio.");
			return ;
		}	
		
		while (idx < tamanho) {
			if ( this.carrinho.get(idx).getNome().equalsIgnoreCase(nome) ) {
				if (this.carrinho.get(idx).getQuantidade() == 1) {
					this.carrinho.remove(idx);
				} else {
					this.carrinho.get(idx).menosUm();
				}	

				System.out.println("Item removido.");
				return ;
			}

			idx++;
		}

		System.out.printf("ERRO: o seu carrinho não possui nenhum item '%s'.%n");
	}

	public void mostrarValorTotal() {
		double valorTotal = 0;
		for (Item item : carrinho) {
			valorTotal += item.getPreco() * item.getQuantidade();
		}

		System.out.printf("Valor total: %.2f.%n", valorTotal);
	}

	public void exibirItens() {
		System.out.println("------------------------------------");
		System.out.println("-----------| Carrinho |-------------");

		for (Item item : carrinho) {
			System.out.printf("- %02d x %s | %.2f |%n", 
							  item.getQuantidade(),
							  item.getNome(),
							  item.getPreco());
		}

		System.out.println("------------------------------------");
	}


	private int contemItem(String nome) {
		for (Item item : carrinho) {
			if ( item.getNome().equalsIgnoreCase(nome) ) {
				return carrinho.indexOf(item);	
			}
		}

		return -1;
	}
}
