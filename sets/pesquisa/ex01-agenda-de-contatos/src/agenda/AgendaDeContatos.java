package agenda;

import java.util.HashSet;

public class AgendaDeContatos {
	private HashSet<Contato> agenda;

	public AgendaDeContatos() {
		this.agenda = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		if ( !this.agenda.add( new Contato(nome, numero) ) ) {
			System.out.printf("Já existe um contato com o nome '%s'.%n",
							  nome);
		}
	}

	public void exibirContatos() {
		if (this.agenda.isEmpty()) {
			System.out.println("A sua agenda está vazia.");
			return ;
		}

		System.out.println("------------------------");
		System.out.println("------| Contatos |------");
		for (Contato contato : this.agenda) {
			System.out.println("- " + contato);
		}
		System.out.printf("------------------------%n%n");
	}
	
	public void pesquisarPorNome(String nome) {
		if (this.agenda.isEmpty()) {
			System.out.println("A sua agenda está vazia.");
			return ;
		}

		for (Contato contato : this.agenda) { 
			if (contato.getNome()
				.toLowerCase().startsWith( nome.toLowerCase() ) ) {
				System.out.println("- " + contato);
			}	
		}
	}

	public void atualizarNumeroDeContato(String nome, int numero) {
		if (this.agenda.isEmpty()) {
			System.out.println("A sua agenda está vazia.");
			return ;
		}

		for (Contato contato : this.agenda) { 
			if (contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumero(numero);	
				System.out.println("Número de contato atualizado!");
				return ;
			}	
		}
			
		System.out.printf("ERRO: nenhum contato com o nome `%s` " + 
					      "foi encontrado na agenda.%n", nome);	
	}
}
