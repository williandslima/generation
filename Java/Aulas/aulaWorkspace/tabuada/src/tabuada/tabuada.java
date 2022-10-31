package tabuada;

import java.util.Scanner;

public class tabuada {

	// objeto(merthodo) para pegar o que usiario usar
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		// criando a var
		int numero, cont;

		// verificando a entrada do usuario, validar dados

		boolean ok = false;
		do {
			// Mensagem e lendo o que usuario ler
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if (numero < 1 || numero > 10)
				System.out.println("\n Digite um numero entre 1 e 10: ");
			else
				ok = true;

		} while (ok == false);
		
		
		//-----
		cont = 1;
		while (cont <= 10) {
			System.out.println("\n" + numero + " X " + cont + " = " + (numero * cont));

			cont++;
		}
		
		
		

		// _______

		/*int contador = 1;
		for (contador = 1; contador <= 10; contador++) { // for tem que iniciar a variavel,

			System.out.println("\n" + numero + " X " + contador + " = " + (numero * contador));

		}*/
		
		

	}

}
