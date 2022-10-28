package exec1MaiorMenor;

import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		// criando variavel

		int numero1, numero2, numero3, maior;
		// Mensagem na tela e Pengando o que o usuario digita
		System.out.println(" ---- Vamos verificar qual numero é maior ---- ");

		System.out.println("Digite o primeiro número inteiro: ");
		numero1 = leia.nextInt();
		System.out.println("Insita o Segundo número inteiro : ");
		numero2 = leia.nextInt();
		System.out.println("Insita o Segundo número inteiro : ");
		numero3 = leia.nextInt();

		// verificando qual dos 3 e maior
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O Numero digitado " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O Numero digitado " + numero2);
		} else {
			System.out.println("O Numero digitado " + numero3);
		}
		
		//verificando ma
		
		if (numero1 >= numero2) {
			maior = numero1;
			
		}else {
			maior = numero2;
		}
		
		if (maior <= numero3) {
			maior = numero3;
		}
		
		
		System.out.println("teste " + maior);

		
		
		/*
		 * if (numero1 > numero2) { maior = numero1; } else maior = numero2;
		 * 
		 * if (maior <= numero3) { maior = numero3; }
		 * 
		 * System.out.println(maior);
		 */
	}

}
