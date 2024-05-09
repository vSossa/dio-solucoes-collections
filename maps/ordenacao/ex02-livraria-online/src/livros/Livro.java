package livros;

import java.lang.Comparable;
import java.util.Objects;

public class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private double preco;

	public Livro(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public double getPreco() {
		return this.preco;
	}

	@Override
	public int compareTo(Livro l) {
		return Double.compare(getPreco(), l.getPreco());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getPreco());
	}
}
