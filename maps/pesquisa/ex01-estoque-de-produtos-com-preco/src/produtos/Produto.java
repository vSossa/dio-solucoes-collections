package produtos;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public String getNome() {
		return this.nome;
	}
}
