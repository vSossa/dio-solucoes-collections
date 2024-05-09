package livros;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class LivrariaOnline {
	private Map<String, Livro> catalogo;

	public LivrariaOnline() {
		this.catalogo = new HashMap<>();
	}

	public void adicionarLivro(String isbn, String titulo, String autor, double preco) {
		if (preco <= 0) {
			System.out.println("Livro inválido");
			return ;
		}

		this.catalogo.put(isbn, new Livro(titulo, autor, preco));
	}

	public void removerLivro(String titulo) {
		if (this.catalogo.isEmpty()) {
			System.out.println("O catálogo já está vazio.");
			return ; 
		}

		for (Map.Entry<String, Livro> entrada : this.catalogo.entrySet()) {
			if (entrada.getValue().getTitulo().equalsIgnoreCase(titulo)) {
				this.catalogo.remove(entrada.getKey());
				System.out.printf("Livro '%s' removido com sucesso.%n",
								  titulo);
				return ;
			}
		}

		System.out.printf("Nenhum livro com título '%s' foi encontrado no catálogo.%n",
						  titulo);
	}

	public void exibirLivrosOrdenadosPorPreco() {
		TreeMap<String, Livro> livrosOrdenados = new TreeMap<>(this.catalogo);			

		if (this.catalogo.isEmpty()) {
			System.out.println("O catálogo já está vazio.");
			return ; 
		}

		for (Map.Entry<String, Livro> entrada : livrosOrdenados.entrySet()) {
			System.out.printf("%s | %s, %s: %.2f.%n",
							  entrada.getKey(),
							  entrada.getValue().getTitulo(),
							  entrada.getValue().getAutor(),
							  entrada.getValue().getPreco());
		}
	}

	public void exibirLivrosDeAutoriaDe(String autor) {
		if (this.catalogo.isEmpty()) {
			System.out.println("O catálogo já está vazio.");
			return ; 
		}

		for (Map.Entry<String, Livro> entrada : this.catalogo.entrySet()) {
			if (entrada.getValue().getAutor().equalsIgnoreCase(autor)) { 
				System.out.printf("%s | %s, %s: %.2f.%n",
								  entrada.getKey(),
								  entrada.getValue().getTitulo(),
								  entrada.getValue().getAutor(),
								  entrada.getValue().getPreco());
			}
		}
	}

	public void exibirLivroMaisCaro() {
		double maiorPreco = 0;
		String isbnDoLivroMaisCaro = null;
		Livro livroMaisCaro = null;

		if (this.catalogo.isEmpty()) {
			System.out.println("O catálogo já está vazio.");
			return ; 
		}

		for (Map.Entry<String, Livro> entrada : this.catalogo.entrySet()) {
			if (entrada.getValue().getPreco() > maiorPreco) {
				isbnDoLivroMaisCaro = entrada.getKey();
				livroMaisCaro = entrada.getValue();
				maiorPreco = livroMaisCaro.getPreco();	
			}
		}

		System.out.printf("%s | %s, %s, %.2f.%n",
						  isbnDoLivroMaisCaro,
						  livroMaisCaro.getTitulo(),
						  livroMaisCaro.getAutor(),
					      maiorPreco);
	}

	public void exibirLivroMaisBarato() {
		double menorPreco = 0;
		String isbnDoLivroMaisBarato = null;
		Livro livroMaisBarato = null;

		if (this.catalogo.isEmpty()) {
			System.out.println("O catálogo já está vazio.");
			return ; 
		}

		for (Map.Entry<String, Livro> entrada : this.catalogo.entrySet()) {
			if (livroMaisBarato == null) {
				menorPreco = entrada.getValue().getPreco() + 1;
			}

			if (entrada.getValue().getPreco() < menorPreco) {
				isbnDoLivroMaisBarato = entrada.getKey();
				livroMaisBarato = entrada.getValue();
				menorPreco = livroMaisBarato.getPreco();	
			}
		}

		System.out.printf("%s | %s, %s, %.2f.%n",
						  isbnDoLivroMaisBarato,
						  livroMaisBarato.getTitulo(),
						  livroMaisBarato.getAutor(),
					      menorPreco);
	}
}
