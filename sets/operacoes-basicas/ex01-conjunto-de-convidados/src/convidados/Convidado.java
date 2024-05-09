package convidados;

import java.util.Objects;

public class Convidado {
	private String nome;
	private int codigoDoConvite;

	public Convidado(String nome, int codigoDoConvite) {
		this.nome = nome;
		this.codigoDoConvite = codigoDoConvite;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getCodigoDoConvite() {
		return this.codigoDoConvite;
	}

	@Override
	public String toString() {
		return "Convidado(" +
			   this.nome + ", " +
			   this.codigoDoConvite + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Convidado convidado)) return false;
		return getCodigoDoConvite() == convidado.getCodigoDoConvite();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCodigoDoConvite());
	}
	
}
