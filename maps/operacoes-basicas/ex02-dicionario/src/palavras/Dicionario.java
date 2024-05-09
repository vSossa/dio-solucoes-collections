package palavras;

import java.util.HashMap;

public class Dicionario {
	private HashMap<String, String> dic;

	public Dicionario() {
		this.dic = new HashMap<>();
	}

	public void adicionarPalavra(String p, String definicao) {
		this.dic.put(p, definicao);
	}

	public void removerPalavra(String p) {
		if (this.dic.isEmpty()) {
			System.out.println("O dicionário já está vazio.");
			return ;
		}

		for (String palavra : this.dic.keySet()) {
			if (palavra.equalsIgnoreCase(p)) {
				this.dic.remove(p); 
				return ;
			}
		}

		System.out.printf("Nenhuma palavra '%s' encontrada no dicionário.%n",
						  p);
	}

	public void mostrarPalavras() {
		if (this.dic.isEmpty()) {
			System.out.println("O dicionário está vazio.");
			return ;
		}

		for (String palavra : this.dic.keySet()) {
			System.out.printf("%s: %s.%n",
							  palavra, this.dic.get(palavra));
		}
	}

	public void pesquisarPalavra(String p) {
		if (this.dic.isEmpty()) {
			System.out.println("O dicionário está vazio.");
			return ;
		}

		for (String palavra : this.dic.keySet()) {
			if (palavra.equalsIgnoreCase(p)) {
				System.out.printf("%s: %s.%n",
								  palavra, this.dic.get(palavra));
				return ;
			}
		}
		
		System.out.printf("'%s' não foi encontrada.%n",
						  p);		
	}

	public void pesquisarPorDefinicao(String def) {
		if (this.dic.isEmpty()) {
			System.out.println("O dicionário está vazio.");
			return ;
		}

		for (String palavra : this.dic.keySet()) {
			if (this.dic.get(palavra).equalsIgnoreCase(def)) {
				System.out.printf("%s: %s.%n",
								  palavra, this.dic.get(palavra));
				return ;
			}
		}
		
		System.out.printf("Nenhum palavra com a definição '%s' foi encontrada.%n",
						  def);		
	}
}
