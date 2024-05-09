import tarefas.ListaDeTarefas;

public class Main {
	public static void main(String[] args) {
		ListaDeTarefas tarefas = new ListaDeTarefas();

		tarefas.adicionarTarefa("tomar remedio para garganta");
		
		System.out.println();
		tarefas.exibirTarefas();
		System.out.println();

		tarefas.adicionarTarefa("fazer exercicios de java");
		tarefas.concluirTarefa("fazer exercicios de java");
		tarefas.exibirTarefas();

		System.out.println();

		tarefas.desconcluirTarefa("fazer exercicios de java");
		tarefas.exibirTarefas();

		System.out.println();
		tarefas.atualizarTarefa("tomar remedio para garganta", "remedio para garganta 9h");
		
		System.out.println();
		tarefas.exibirTarefas();

		System.out.println();
		tarefas.mostrarTarefasConcluidas();
		System.out.println();
		tarefas.mostrarTarefasPendentes();
		
		System.out.println();
		tarefas.limparLista();
		tarefas.exibirTarefas();
	}
}
