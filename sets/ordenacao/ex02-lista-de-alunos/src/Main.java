import alunos.ConjuntoDeAlunos;

public class Main {
	public static void main(String[] args) {
		ConjuntoDeAlunos alunos = new ConjuntoDeAlunos();

		alunos.adicionarAluno("a", 1L, 1.0);
		alunos.adicionarAluno("z", 30L, 7.5);
		alunos.adicionarAluno("h", 4L, 9.0);
		alunos.adicionarAluno("e", 5L, 5.0);

		System.out.println();

		alunos.exibirAlunos();

		System.out.println();

		alunos.exibirAlunosPorMedia();

		System.out.println();

		alunos.exibirAlunosPorNome();
	}
} 
