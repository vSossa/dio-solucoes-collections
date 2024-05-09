package numeros;

import java.util.ArrayList;
import java.util.Collections;

public class Numeros {
	private ArrayList<Integer>  numeros;

	public Numeros() {
		this.numeros = new ArrayList<>();
	}

	public void addNumero(Integer n) {
		this.numeros.add(n);
	}

	public void ordenarCrescente() {
		if (this.numeros.size() == 0) {
			System.out.println("A lista está vazia.");
			return ;
		}

		Collections.sort(this.numeros);
	}

	public void ordenarDecrescente() {
		if (this.numeros.size() == 0) {
			System.out.println("A lista está vazia.");
			return ;
		}

		Collections.sort(this.numeros, Collections.reverseOrder());
	}

	public void mostrarLista() {
		if (this.numeros.size() == 0) {
			System.out.println("A lista está vazia.");
			return ;
		}
		
		for (Integer numero : numeros) { 
			System.out.printf("- %2d.%n", 
							  numero.intValue());
		}	
	}

}
