import livros.LivrariaOnline;

public class Main {
	public static void main(String[] args) {
		LivrariaOnline catalogo = new LivrariaOnline();

		catalogo.adicionarLivro("iiiii", "a", "A", 12.00);
		catalogo.adicionarLivro("jliii", "b", "B", 13.00);
		catalogo.adicionarLivro("iikii", "c", "B", 9.00);
		catalogo.adicionarLivro("ijili", "d", "c", 15.00);

		catalogo.exibirLivrosOrdenadosPorPreco();
		System.out.println();

		catalogo.exibirLivrosDeAutoriaDe("B");
		System.out.println();
		
		catalogo.exibirLivroMaisCaro();
		catalogo.exibirLivroMaisBarato();	
	}
}
