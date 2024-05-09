import palavras.ConjuntoDePalavras;

public class Main {
	public static void main(String[] args) {
		ConjuntoDePalavras palavras = new ConjuntoDePalavras();
		
		palavras.adicionarPalavra("oi");

		System.out.println();
		palavras.exibirPalavras();
		System.out.println();

		palavras.adicionarPalavra("Oi");
		palavras.adicionarPalavra("Tchau");

		System.out.println();
		palavras.exibirPalavras();
		System.out.println();

		palavras.adicionarPalavra("Adeus");	
		palavras.removerPalavra("tchau");	
		
		System.out.println();
		palavras.exibirPalavras();
	}
}
