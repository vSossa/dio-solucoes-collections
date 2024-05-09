package alunos;

import java.lang.Comparable;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private long matricula;
	private double media;

	public Aluno(String nome, long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	public String getNome() {
		return this.nome;
	}

	public double getMedia() {
		return this.media;
	}

	@Override
	public int compareTo(Aluno a) {
		return this.nome.compareToIgnoreCase(a.getNome());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if ( !(o instanceof Aluno a) ) return false;
		return a.getMedia() == getMedia();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMedia());
	}	

	@Override
	public String toString() {
		return this.matricula + ", " + 
			   this.nome      + ", " +
			   this.media     + ".";
	}
}
