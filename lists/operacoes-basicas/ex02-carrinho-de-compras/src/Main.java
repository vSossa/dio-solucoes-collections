import compras.*;

public class Main {
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Pão", 0.50, 6);
		carrinho.adicionarItem("Queijo mossarela", 12.00, 1);
		carrinho.exibirItens();

		carrinho.mostrarValorTotal();
		
		carrinho.removerItem("Pão");
		carrinho.exibirItens();
		carrinho.mostrarValorTotal();

		carrinho.adicionarItem("Pão", 0.50, 10);

		carrinho.removerItem("Queijo mossarela");
		carrinho.exibirItens();
		carrinho.mostrarValorTotal();
	}
}
