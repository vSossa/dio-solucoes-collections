package agenda;

import java.util.Objects;

public class Contato {
	private String nome;
	private int numero;

	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}	

	public String getNome() {
		return this.nome;
	}

	public int getInt() {
		return this.numero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome +
			   " | " + 
			   "Número: " + this.numero;
	}	

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if ( !(o instanceof Contato contato) ) return false;
		return getNome() == contato.getNome();	
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNome());
	}
}
