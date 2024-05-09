package produtos;

import java.lang.Comparable;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private long codigo;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(long codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return this.nome;
	}	

	public long getCodigo() {
		return this.codigo;
	}

	public double getPreco() {
		return this.preco;
	}

	@Override
	public int compareTo(Produto p) {
		return this.nome.compareToIgnoreCase(p.getNome());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if ( !(o instanceof Produto p) ) return false;
		return getCodigo() == p.getCodigo();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCodigo());
	}

	@Override
	public String toString() {
		return this.quantidade + " x " +
			   this.preco + " x " + 
			   this.nome + ".";
	}
}
