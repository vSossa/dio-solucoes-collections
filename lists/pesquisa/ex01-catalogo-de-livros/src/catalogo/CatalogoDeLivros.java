package catalogo;

import java.util.ArrayList;

public class CatalogoDeLivros {
	private ArrayList<Livro> catalogo;

	public CatalogoDeLivros() {
		this.catalogo = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
		if (anoDePublicacao < 0) {
			System.out.println("ERRO: ano de publicação inválido.");
			return ;
		}

		catalogo.add( new Livro(titulo, autor, anoDePublicacao) );
	}

	public void pesquisarPorAutor(String autor) {
		int idx = 0;
		int tamanho = this.catalogo.size();

		if (tamanho == 0) {
			System.out.println("O catálogo está vazio.");
			return ;
		}

		while (idx < tamanho) {
			Livro livro = this.catalogo.get(idx);	
			if ( livro.getAutor().equalsIgnoreCase(autor) ) {
				System.out.printf("%s, %s, %04d%n",
								  livro.getAutor(),
								  livro.getTitulo(),
								  livro.getAnoDePublicacao());
			}

			idx++;
		}
	}

	public void pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
		int idx = 0;
		int tamanho = this.catalogo.size();

		if ( anoFinal - anoInicial < 0 ) {
			System.out.println("Entrada inválida.");
			return ;
		}

		if (tamanho == 0) {
			System.out.println("O catálogo está vazio.");
			return ;
		}

		while (idx < tamanho) {
			Livro livro = this.catalogo.get(idx);
			if ( anoInicial <= livro.getAnoDePublicacao() && livro.getAnoDePublicacao() <= anoFinal ) {
				System.out.printf("%s, %s, %04d%n",
								  livro.getAutor(),
								  livro.getTitulo(),
								  livro.getAnoDePublicacao());
			}	
			
			idx++;
		}
	}

	public void pesquisarPorTitulo(String titulo) {
		int idx = 0;
		int tamanho = this.catalogo.size();

		if (tamanho == 0) {
			System.out.println("O catálogo está vazio.");
			return ;
		}

		while (idx < tamanho) {
			Livro livro = this.catalogo.get(idx);
			if ( livro.getTitulo().equalsIgnoreCase(titulo) ) {
				System.out.printf("%s, %s, %04d%n",
								  livro.getAutor(),
								  livro.getTitulo(),
								  livro.getAnoDePublicacao());
				return ;
			}	
			
			idx++;
		}
	}
}
