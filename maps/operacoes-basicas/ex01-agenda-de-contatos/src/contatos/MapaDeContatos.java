package contatos;

import java.util.HashMap;

public class MapaDeContatos {
	private HashMap<String, Integer> contatos;

	public MapaDeContatos() {
		this.contatos = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		if (telefone < 0) {
			System.out.println("Contato inválido.");	
			return ;
		}

		this.contatos.put(nome, telefone);
	}

	public void mostrarContatos() {
		if (this.contatos.isEmpty()) {
			System.out.println("A sua lista de contatos está vazia.");
			return ;
		}

		for (String nome : this.contatos.keySet()) {
			System.out.printf("%s, %d.%n", 
							  nome, 
							  this.contatos.get(nome).intValue());
		}
		
	}
	public void removerContato(String nome) {
		if (this.contatos.isEmpty()) {
			System.out.println("A sua lista de contatos está vazia.");
			return ;
		}

		this.contatos.remove(nome);
	}

	public void mostrarNumero(String nome) {
		final Integer numero;
		
		if (this.contatos.isEmpty()) {
			System.out.println("A sua lista de contatos está vazia.");
			return ;
		}

		if ( (numero = this.contatos.get(nome)) == null ) {
			System.out.printf("Nenhum contato com nome '%s' foi encontrado.%n",
							  nome);
			return ;
		}

		System.out.printf("%s, %d.%n", 
							nome, numero.intValue());
	}
}
