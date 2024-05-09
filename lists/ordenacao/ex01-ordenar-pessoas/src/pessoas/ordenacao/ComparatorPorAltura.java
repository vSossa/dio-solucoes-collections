package pessoas.ordenacao;

import java.util.Comparator;

import pessoas.Pessoa;

public class ComparatorPorAltura implements Comparator<Pessoa> {
	@Override
	public int compare(Pessoa pessoa1, Pessoa pessoa2) {
		return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
	}
}
