import agenda.AgendaDeContatos;

public class Main {
	public static void main(String[] args) {
		AgendaDeContatos agenda = new AgendaDeContatos();

		agenda.adicionarContato("eu", 1);
		agenda.exibirContatos();

		agenda.adicionarContato("eu", 2);

		agenda.exibirContatos();
		
		agenda.adicionarContato("tu", 2);
		agenda.atualizarNumeroDeContato("eu", 3);
		agenda.adicionarContato("euTu", 4);	
		agenda.adicionarContato("TuEu", 4);	

		agenda.exibirContatos();

		agenda.pesquisarPorNome("eu");
		
		System.out.println();
		
		agenda.pesquisarPorNome("TU");
	}
}
