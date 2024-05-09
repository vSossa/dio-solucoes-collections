package pessoas;

import java.lang.Comparable;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	private double altura;

	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return Integer.compare(this.idade, pessoa.getIdade());
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public double getAltura() {
		return this.altura;
	}
}
