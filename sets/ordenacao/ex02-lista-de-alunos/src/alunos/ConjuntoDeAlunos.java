package alunos;

import alunos.comparators.ComparatorPorMedia;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoDeAlunos {
	private Set<Aluno> alunos;
	
	public ConjuntoDeAlunos() {
		this.alunos = new HashSet<>();
	}

	public void adicionarAluno(String nome, long matricula, double media) {
		if (matricula < 0 || media < 0) {
			System.out.println("Matrícula inválida");
			return ;
		}

		this.alunos.add( new Aluno(nome, matricula, media) );	
	}

	public void exibirAlunosPorNome() {
		TreeSet<Aluno> alPorNome = new TreeSet<>();

		if (this.alunos.isEmpty()) {
			System.out.println("Nenhum aluno matriculado.");
			return ;
		}	

		alPorNome.addAll(this.alunos);
		for (Aluno a : alPorNome) {
			System.out.println(a);
		}
	}

	public void exibirAlunosPorMedia() {
		TreeSet<Aluno> alPorNome = new TreeSet<>( new ComparatorPorMedia() );

		if (this.alunos.isEmpty()) {
			System.out.println("Nenhum aluno matriculado.");
			return ;
		}	

		alPorNome.addAll(this.alunos);
		for (Aluno a : alPorNome) {
			System.out.println(a);
		}
	}
	
	public void exibirAlunos() {
		if (this.alunos.isEmpty()) {
			System.out.println("Nenhum aluno matriculado.");
			return ;
		}	

		for (Aluno a : this.alunos) {
			System.out.println(a);
		}
	}
}
