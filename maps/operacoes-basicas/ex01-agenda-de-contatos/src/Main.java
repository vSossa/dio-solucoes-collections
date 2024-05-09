import contatos.MapaDeContatos;

public class Main {
	public static void main(String[] args) {
		MapaDeContatos contatos = new MapaDeContatos();

		contatos.adicionarContato("a", 1);
		contatos.adicionarContato("b", 2);

		contatos.mostrarContatos();
		System.out.println();

		contatos.removerContato("a");
		contatos.removerContato("a");

		contatos.mostrarNumero("a");

		contatos.mostrarContatos();
	}
}
