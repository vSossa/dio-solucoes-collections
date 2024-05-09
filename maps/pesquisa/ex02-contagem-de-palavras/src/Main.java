import palavras.Contador;

public class Main {
	public static void main(String[] args) {
		Contador c = new Contador();

		c.adicionarPalavra("a", 20);
		c.adicionarPalavra("b", 5);
		c.adicionarPalavra("c", 15);

		c.mostrarPalavras();
		System.out.println();

		c.removerPalavra("a");
		System.out.println();
		
		c.mostrarPalavras();
		System.out.println();

		c.mostrarPalavraMaisFrequente();
	}
}
