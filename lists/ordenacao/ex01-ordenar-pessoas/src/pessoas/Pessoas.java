package pessoas;

import java.util.ArrayList;
import java.util.Collections;

import pessoas.ordenacao.ComparatorPorAltura;

public class Pessoas {
	private ArrayList<Pessoa> pessoas;

	public Pessoas() {
		this.pessoas = new ArrayList<>();
	}

	public void mostrarLista() {
		if (this.pessoas.size() == 0) {
			System.out.println("A lista está vazia.");	
			return ;
		}

		for (Pessoa pessoa : this.pessoas) {
			System.out.printf("- %s, %d, %.2f.%n",
							  pessoa.getNome(),
						      pessoa.getIdade(),
							  pessoa.getAltura());
		}
	}
	
	public void addPessoa(String nome, int idade, double altura) {
		this.pessoas.add( new Pessoa(nome, idade, altura) );
	}

	public void ordenarPorIdade() {
		if (this.pessoas.size() == 0) {
			System.out.println("A lista está vazia.");
			return ;
		}

		Collections.sort(this.pessoas, new ComparatorPorAltura());
	}

	public void ordenarPorAltura() {
		if (this.pessoas.size() == 0) {
			System.out.println("A lista está vazia.");
			return ;
		}

		Collections.sort(this.pessoas);
	}	
}
	
