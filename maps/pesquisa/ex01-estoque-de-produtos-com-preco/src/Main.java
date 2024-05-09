import produtos.Estoque;
import produtos.Produto;

public class Main {
	public static void main(String[] args) {
		Estoque e = new Estoque();
		
		e.adicionarProduto(1L, "a", 10.00, 1);
		e.adicionarProduto(2L, "b", 5.00, 4);
		e.adicionarProduto(3L, "c", 3.00, 100);
	
		e.mostrarProdutos();
		System.out.println();

		e.mostrarProdutoMaisCaro();
		e.mostrarProdutoMaisBarato();
		System.out.println();

		e.mostrarProdutoComMaiorValorTotal();
		e.mostrarProdutoComMenorValorTotal();	
		System.out.println();

		e.mostrarValorTotalNoEstoque();
	}
}
