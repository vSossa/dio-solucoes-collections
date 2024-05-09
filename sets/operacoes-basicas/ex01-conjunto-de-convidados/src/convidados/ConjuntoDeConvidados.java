package convidados;

import java.util.HashSet;

public class ConjuntoDeConvidados {
	private HashSet<Convidado> conjuntoDeConvidados;

	public ConjuntoDeConvidados() {
		this.conjuntoDeConvidados = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoDoConvite) {
		if ( !this.conjuntoDeConvidados.add( new Convidado(nome, codigoDoConvite) ) ) {
			System.out.printf("%s tentou ser espertinho.%n", 
							  nome);
		}
	}

	public void contarConvidados() {
		int quantidadeDeConvidados = this.conjuntoDeConvidados.size();

		if (quantidadeDeConvidados == 0) {
			System.out.println("O conjunto de convidados está vazio.");
			return ;
		}

		if (quantidadeDeConvidados == 1) {
			System.out.printf("Temos apenas %d convidado.%n", 
							  quantidadeDeConvidados);
			return ;
		}

		System.out.printf("Temos %d convidados.%n", 
						  quantidadeDeConvidados);
	}

	public void removerConvidadoPeloCodigo(int codigoDoConvite) {
		if (this.conjuntoDeConvidados.isEmpty()) {
			System.out.println("ERRO: o conjunto de convidados está vazio.");
			return ;
		}

		for (Convidado convidado : this.conjuntoDeConvidados) {
			if (convidado.getCodigoDoConvite() == codigoDoConvite) {
				this.conjuntoDeConvidados.remove(convidado);
				return ;
			}
		}

		System.out.printf("ERRO: não há ninguém com o código %d no conjunto.%n",
						  codigoDoConvite);
	}

	public void exibirConvidados() {
		if (this.conjuntoDeConvidados.isEmpty()) {
			System.out.println("O conjunto de convidados está vazio.");
			return ;
		}
		
		System.out.println("---------------------------------");
		System.out.println("----------| Convidados |---------");
		for (Convidado convidado : this.conjuntoDeConvidados) {
			System.out.printf("- %s.%n", convidado);	
		}	
		System.out.println("---------------------------------");
	}
}
