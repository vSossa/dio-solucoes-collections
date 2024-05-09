import palavras.Dicionario; 
public class Main {
	public static void main(String[] args) {
		Dicionario d = new Dicionario();

		d.adicionarPalavra("a", "aa");
		d.mostrarPalavras();

		System.out.println();

		d.adicionarPalavra("b", "bb");
		d.adicionarPalavra("c", "cc");
		d.mostrarPalavras();	

		System.out.println();
		
		d.pesquisarPalavra("a");
		d.pesquisarPorDefinicao("cc");
	}
}
