package boletin;

import java.util.Scanner;

public class Boletim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		// criando a var
		float nota1, nota2, media;
		boolean resposta;
		media = 0;

		// Mensagem e lendo o que usuario ler
		System.out.println("Insita a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Insita a primeira nota: ");
		nota2 = leia.nextFloat();

		// verificando se a nota e maior ai da sequencia
		if (nota1 > 0 && nota2 > 0 && nota1 <= 10 && nota2 <= 10) { // verificando se uma das duas, estruturas dentro da
																	// outra
			media = (nota1 + nota2) / 2;

			if (media >= 7) {
				System.out.println(" Parabens voce esta aprovado" + media);
			} else if (media < 7 && media <= 4) {
				System.out.println(" Voce esta de recuperacao " + media);
			} else {
				System.out.println(" Voce esta Reprocado " + media);
			}

		} else {
			System.out.println("As notas devem ser diferences de 0");
		}

	}

}
