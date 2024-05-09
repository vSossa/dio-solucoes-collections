package eventos;

public class Evento {
	private String atividade;
	private String descricao;

	public Evento(String atividade, String descricao) {
		this.atividade = atividade;
		this.descricao = descricao;
	}

	public String getAtividade() {
		return this.atividade;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
