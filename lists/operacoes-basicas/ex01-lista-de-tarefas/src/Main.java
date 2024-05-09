import tarefa.ListaTarefas;

public class Main {
	public static void main(String[] args) {
		ListaTarefas tarefas = new ListaTarefas();

		tarefas.adicionarTarefa("oi");
		tarefas.mostrarTarefas();	

		tarefas.mostrarQuantidadeDeTarefas();
		tarefas.removerTarefa("não");
		tarefas.mostrarQuantidadeDeTarefas();

		tarefas.adicionarTarefa("Concluido!");
		tarefas.removerTarefa("oi");
		
		tarefas.mostrarTarefas();
		tarefas.removerTarefa("Concluido!");
		tarefas.mostrarQuantidadeDeTarefas();
		tarefas.mostrarTarefas();
	}
}
