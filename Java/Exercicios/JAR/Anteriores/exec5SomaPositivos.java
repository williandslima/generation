package exec5SomaPositivos;

import java.util.Scanner;

public class exec5SomaPositivos {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numero, soma = 0;
		int continua = 1;

		while (continua == 1) {

			System.out.println("Para sair digite (0): ");
			System.out.println("Digite um Número : ");
			numero = leia.nextInt();

			if (numero > 0) {
				soma = (numero + soma);
			}
			continua = 1;	// LOOP INFINITO ATE
			if (numero == 0) {
				continua = numero;
			}

		}

		System.out.println("\nA soma dos numeros positivos e " + soma);

	}

}
