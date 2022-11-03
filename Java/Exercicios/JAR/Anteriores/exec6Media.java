package exec6Media;

import java.util.Scanner;

public class exec6Media {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, quant = 0;
		float soma = 0 , media;
		int continua = 1;

		while (continua == 1) {

			System.out.println("Para sair digite (0): ");
			System.out.println("Digite um Número : ");
			numero = leia.nextInt();

			if (numero % 3 == 0) {
				if (numero > 3) {
					soma = (numero + soma);
					quant++;
				}

			}
			continua = 1; // LOOP INFINITO ATE
			if (numero == 0) {
				continua = numero;
			}

		}

		media = (soma / quant);
		
		System.out.println("\nA media dos multiplos de 3 é " + media);

	}

}
