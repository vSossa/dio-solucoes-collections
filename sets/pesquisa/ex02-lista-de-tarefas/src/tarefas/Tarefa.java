package tarefas;

public class Tarefa {
	private String descricao;
	private boolean concluido;

	public Tarefa(String descricao, boolean concluido) {
		this.descricao = descricao;
		this.concluido = concluido;	
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public boolean getConcluido() {
		return this.concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	
	@Override
	public String toString() {
		String stringBonita;
		if (this.concluido) {
			stringBonita = "[x] " + this.descricao + ".";
		} else {
		 	stringBonita = "[ ] " + this.descricao + ".";
		}

		return stringBonita;
	}	
}
