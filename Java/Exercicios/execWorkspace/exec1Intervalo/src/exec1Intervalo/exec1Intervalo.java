package exec1Intervalo;

import java.util.Scanner;

public class exec1Intervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		// variaveis

		int numero1, numero2;

		// algoritomo que leia 2 numeros int.. primeiro deve ser menor que o segundo

		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt();

		// caso nao seja deve dar mensagem na tela e sair do programa

		if (numero1 > numero2) {
			System.out.println("Intervalo invalido");
			System.out.println("Programa finalizado ");
		}
		if ((numero1 % 3 == 0 && numero2 % 3 == 0)) {
			System.out.println("Digite o primeiro numero: ");

		}

		// o intervalo informado mostre o que sao multiplos de 3 e 5

	}

}
