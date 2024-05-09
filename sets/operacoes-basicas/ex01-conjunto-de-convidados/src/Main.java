import convidados.ConjuntoDeConvidados;

public class Main {
	public static void main(String[] args) {
		ConjuntoDeConvidados convidados = new ConjuntoDeConvidados();

		convidados.adicionarConvidado("Pedro", 1);

		convidados.exibirConvidados();

		System.out.println();

		convidados.adicionarConvidado("João", 2);
		convidados.adicionarConvidado("Alberto", 4);
		convidados.adicionarConvidado("Fernando", 3);
		convidados.adicionarConvidado("Carlos", 3);

		System.out.println();

		convidados.exibirConvidados();
	}
}
