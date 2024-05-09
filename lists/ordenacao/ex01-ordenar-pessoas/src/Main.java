import pessoas.Pessoas;

public class Main {
	public static void main(String[] args) {
		Pessoas lista = new Pessoas();

		lista.addPessoa("a", 1, 1.20);
		lista.addPessoa("b", 1, 1.50);
		lista.addPessoa("c", 3, 1.80);
		lista.addPessoa("d", 4, 1.20);

		lista.mostrarLista();		
		
		System.out.println();
		
		lista.ordenarPorIdade();
		lista.mostrarLista();

		System.out.println();

		lista.ordenarPorAltura();
		lista.mostrarLista();
	}
}
