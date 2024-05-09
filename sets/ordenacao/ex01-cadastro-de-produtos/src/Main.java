import produtos.ConjuntoDeProdutos;

public class Main {
	public static void main(String[] args) {
		ConjuntoDeProdutos produtos = new ConjuntoDeProdutos();		

		produtos.adicionarProduto(1L, "a", 1.0, 1);
		produtos.adicionarProduto(5L, "c", 4.0, 3);
		produtos.adicionarProduto(4L, "d", 2.0, 1);
		produtos.adicionarProduto(3L, "z", 7.0, 3);
		produtos.adicionarProduto(6L, "b", 9.0, 1);

		produtos.exibirProdutos();

		System.out.println();

		produtos.exibirProdutosPorPreco();

		System.out.println();

		produtos.exibirProdutosPorNome();
	}
}
