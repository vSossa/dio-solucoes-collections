package palavras;

import java.util.Map;
import java.util.HashMap;

public class Contador {
	private HashMap<String, Integer> c; 

	public Contador() {
		this.c = new HashMap<>();
	}

	public void adicionarPalavra(String p, Integer contagem) {
		if (contagem.intValue() <= 0) {
			System.out.println("Palavra inválida.");
			return ;
		}

		this.c.put(p, contagem);	
	}

	public void removerPalavra(String p) {
		if (this.c.isEmpty()) {
			System.out.println("Nenhuma palavra registrada.");
			return ;
		}

		for (String palavra : this.c.keySet()) {
			if (palavra.equalsIgnoreCase(p)) {
				this.c.remove( palavra, this.c.get(palavra) );
				System.out.printf("'%s' removida com sucesso.%n",
								   p);
				return ;
			}
		}

		System.out.printf("Nenhum palavra '%s' foi registrada no contador.%n",
						  p);
	}

	public void mostrarPalavras() {
		if (this.c.isEmpty()) {
			System.out.println("Nenhuma palavra registrada.");
			return ;
		}

		for (Map.Entry<String, Integer> entrada : this.c.entrySet()) {
			System.out.printf("%s: %d.%n", 
							  entrada.getKey(),
							  entrada.getValue().intValue());
		}
	}

	public void mostrarPalavraMaisFrequente() {
		int maiorFrequencia = 0;
		String palavraMaisFrequente = null;
		if (this.c.isEmpty()) {
			System.out.println("Nenhuma palavra registrada.");
			return ;
		}
		
		for (Map.Entry<String, Integer> entrada : this.c.entrySet()) {
			if (maiorFrequencia < entrada.getValue().intValue()) {
				maiorFrequencia = entrada.getValue().intValue();
				palavraMaisFrequente = entrada.getKey();	
			}
		}

		System.out.printf("'%s' é a palavra mais frequente.%n",
						  palavraMaisFrequente); 
	}
}
