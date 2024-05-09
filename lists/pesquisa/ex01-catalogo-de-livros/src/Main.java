import catalogo.CatalogoDeLivros;

public class Main {
	public static void main(String[] args) {
		CatalogoDeLivros catalogo = new CatalogoDeLivros();
		
		catalogo.adicionarLivro("a", "b", 1);
		catalogo.adicionarLivro("c", "d", 2);
		catalogo.adicionarLivro("e", "f", 4);
		catalogo.adicionarLivro("g", "b", 4);
		catalogo.adicionarLivro("h", "b", 9);
		catalogo.adicionarLivro("a", "f", 9);

		catalogo.pesquisarPorIntervaloDeAnos(0, 2);

		System.out.println();

		catalogo.pesquisarPorTitulo("a");

		System.out.println();
		
		catalogo.pesquisarPorAutor("b");
	}
}

