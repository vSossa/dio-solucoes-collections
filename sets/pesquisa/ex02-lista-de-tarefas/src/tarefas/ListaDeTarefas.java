package tarefas;

import java.util.HashSet;

public class ListaDeTarefas {
	private HashSet<Tarefa> tarefas;

	public ListaDeTarefas() {
		this.tarefas = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		// TODO: adicionar suporte para a adicao de tarefas
		// ja concluidas
		this.tarefas.add( new Tarefa(descricao, false) );
	}

	public void exibirTarefas() {
		if (this.tarefas.isEmpty()) {
			System.out.println("A sua lista está vazia.");
			return ;
		}

		// TODO: adicionar ui bonitinha
		for (Tarefa tarefa : this.tarefas) {
			System.out.println(tarefa);
		}
	}

	public void mostrarQuantidadeDeTarefas() {
		System.out.printf("Você possui %d para fazer.", 
						  this.tarefas.size());	
	}

	public void mostrarTarefasConcluidas() {
		final int tamanho = this.tarefas.size();
		boolean existeTarefaConcluida = false;

		if (tamanho == 0) {
			System.out.println("A sua lista está vazia.");
			return ;
		}

		for (Tarefa tarefa : this.tarefas) {
			if (tarefa.getConcluido()) {
				existeTarefaConcluida = true;
				System.out.println(tarefa);
			}
		}

		if ( !existeTarefaConcluida ) {
			System.out.println("Nenhuma tarefa concluída.");
		}
	}
	
	public void mostrarTarefasPendentes() {
		final int tamanho = this.tarefas.size();
		boolean existeTarefaPendente = false;

		if (tamanho == 0) {
			System.out.println("A sua lista está vazia.");
			return ;
		}

		for (Tarefa tarefa : this.tarefas) {
			if ( !tarefa.getConcluido() ) {
				existeTarefaPendente = true;
				System.out.println(tarefa);
			}
		}

		if ( !existeTarefaPendente ) {
			System.out.println("Nenhuma tarefa pendente.");
		}
	}

	public void concluirTarefa(String descricao) {
		if (this.tarefas.isEmpty()) {
			System.out.println("A sua lista está vazia.");
			return ;
		}

		for (Tarefa tarefa : this.tarefas) {
			if (tarefa.getDescricao().equals(descricao)) {
				tarefa.setConcluido(true);
				return ;
			}
		}

		System.out.printf("Nenhuma tarefa '%s' foi encontrada na lista.%n",
						  descricao);
	}

	public void desconcluirTarefa(String descricao) {
		if (this.tarefas.isEmpty()) {
			System.out.println("A sua lista está vazia.");
			return ;
		}

		for (Tarefa tarefa : this.tarefas) {
			if (tarefa.getDescricao().equals(descricao)) {
				tarefa.setConcluido(false);
				return ;
			}
		}

		System.out.printf("Nenhuma tarefa '%s' foi encontrada na lista.%n",
						  descricao);
	}

	public void atualizarTarefa(String descricao, String descricaoAtualizada) {
		if (this.tarefas.isEmpty()) {
			System.out.println("A sua lista está vazia.");
			return ;
		}

		for (Tarefa tarefa : this.tarefas) {
			if (tarefa.getDescricao().equals(descricao)) {
				tarefa.setDescricao(descricaoAtualizada);
				return ;
			}
		}

		System.out.printf("Nenhuma tarefa '%s' foi encontrada na lista.%n",
						  descricao);
	}

	public void limparLista() {
		if (this.tarefas.isEmpty()) {
			System.out.println("A sua lista já está vazia.");
			return ;
		}

		System.out.println("Limpando a lista...");
		this.tarefas.clear();
		System.out.println("Lista limpa.");
	}

}
