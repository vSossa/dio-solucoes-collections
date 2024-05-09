package eventos;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.time.LocalDate;

public class Agenda {
	private Map<LocalDate, Evento> a;

	public Agenda() {
		this.a = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String atividade, String descricao) {
		this.a.put(data, new Evento(atividade, descricao) );			
	}

	public void mostrarAgenda() {
		Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(this.a);

		if (this.a.isEmpty()) {
			System.out.println("Nenhum evento salvo na agenda.");
			return ;
		}

		for (Map.Entry<LocalDate, Evento> entrada : agendaOrdenada.entrySet()) {
			System.out.printf("|%s, %s, %s|%n", 
						      entrada.getKey(),
							  entrada.getValue().getDescricao(),
							  entrada.getValue().getAtividade());
		}
	}

	public void mostrarProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Evento evento = null;
		if (this.a.isEmpty()) {
			System.out.println("Nenhum evento salvo na agenda.");
			return ;
		}

		for (Map.Entry<LocalDate, Evento> entrada : this.a.entrySet()) {
			if (entrada.getKey().equals(dataAtual) || 
				entrada.getKey().isAfter(dataAtual)) {
				evento = entrada.getValue();
				System.out.printf("Próximo evento: |%s, %s, %s|.%n", 
						          entrada.getKey(),
								  evento.getDescricao(),
								  evento.getAtividade());
				break;
			}
		}

		if (evento == null) {
			System.out.printf("Não há eventos futuros à %s.%n",
						      dataAtual); 
		}	
	}
}

