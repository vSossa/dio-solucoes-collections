import numeros.Numeros;

public class Main { 
	public static void main(String[] args) {
		Numeros numeros = new Numeros();

		numeros.addNumero(1);
		numeros.addNumero(3);
		numeros.addNumero(2);
		numeros.addNumero(7);
		numeros.addNumero(5);
		numeros.addNumero(4);

		numeros.mostrarLista();
		System.out.println();

		numeros.ordenarCrescente();
		numeros.mostrarLista();

		System.out.println();

		numeros.ordenarDecrescente();
		numeros.mostrarLista();
	}
}
