package tarefa;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {
	private ArrayList<Tarefa> tarefas;

	public ListaTarefas() {
		this.tarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		if (this.tarefas.isEmpty()) {
			System.out.println("A sua lista de tarefas está vazia.");
			return ;
		} 
		
		//if ( !this.tarefas.remove( new Tarefa(descricao) ) ) {
		//	System.out.printf("ERRO: Não existe nenhuma tarefa %s em sua lista.%n", 
		//				      descricao);	
		//	return;
		// }

		for (Tarefa tarefa : this.tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				this.tarefas.remove(tarefa);
				System.out.println("Tarefa removida!");
				
				return ;
			}
		}	

		System.out.printf("ERRO: A sua lista não possui nenhuma tarefa '%s'.%n",
						   descricao);
	}	

	public void mostrarQuantidadeDeTarefas() {
		int quantidadeDeTarefas = this.tarefas.size();

		if (quantidadeDeTarefas == 0) {
			System.out.println("Sua lista está vazia!");
		} else if (quantidadeDeTarefas == 1) {
			System.out.printf("Você possui %d tarefa em sua lista.%n",
							  quantidadeDeTarefas);
		} else {
			System.out.printf("Você possui %d tarefas em sua lista.%n",
						      quantidadeDeTarefas);
		}
	}

	public void mostrarTarefas() {
		System.out.println("---------------------------------------");
		for (Tarefa tarefa : tarefas) {
			System.out.printf("- %s.%n", tarefa.getDescricao());
		}
		System.out.println("---------------------------------------");
	}	
}
