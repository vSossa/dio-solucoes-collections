package palavras;

import java.util.HashSet;

public class ConjuntoDePalavras {
	HashSet<String> conjuntoDePalavras;

	public ConjuntoDePalavras() {
		this.conjuntoDePalavras = new HashSet<>();
	}


	public void adicionarPalavra(String p) {
		if ( verificarPalavra(p) ) {
			System.out.printf("'%s' é válida.%n", p);
			this.conjuntoDePalavras.add(p);
		} else {
			System.out.printf("'%s' é inválida.%n", p);
		}
	}

	public void removerPalavra(String p) {
		if (this.conjuntoDePalavras.isEmpty()) {
			System.out.println("ERRO: o conjunto está vazio.");
			return ;
		}

		for (String palavra : this.conjuntoDePalavras) { 
			if (palavra.equalsIgnoreCase(p)) {
				this.conjuntoDePalavras.remove(palavra);
				System.out.printf("'%s' foi removida do conjunto.%n",
								  p);
				return ;
			}
		}

		System.out.printf("'%s' não está no conjunto.%n",
						  p);
	}

	private boolean verificarPalavra(String p) {
		if ( this.conjuntoDePalavras.isEmpty() ) {
			return true;
		}

		for (String palavra : this.conjuntoDePalavras) { 
			if (palavra.equalsIgnoreCase(p)) {
				return false;
			}
		}

		return true;
	}

	public void exibirPalavras() {
		if (this.conjuntoDePalavras.isEmpty()) {
			System.out.println("O conjunto está vazio.");
			return ;
		}

		System.out.println("-----------------------------");
		System.out.println("---------| Palavras |--------");
		for (String palavra : this.conjuntoDePalavras) { 
			System.out.printf("- %s.%n",
							  palavra);
		}
		System.out.println("-----------------------------");
	}	
}
