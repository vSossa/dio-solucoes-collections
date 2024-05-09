import java.time.Month;
import java.time.LocalDate;
import eventos.Agenda;

public class Main {
	public static void main(String[] args) {
		Agenda a = new Agenda();

		a.adicionarEvento(LocalDate.of(2023, Month.JULY, 4), "a", "b");
		a.adicionarEvento(LocalDate.of(2024, Month.JULY, 4), "b", "c");
		a.adicionarEvento(LocalDate.of(2025, Month.JULY, 4), "d", "e");
		a.adicionarEvento(LocalDate.of(2022, Month.JULY, 4), "f", "g");
		
		a.mostrarAgenda();
		System.out.println();

		a.mostrarProximoEvento();
	}
}
