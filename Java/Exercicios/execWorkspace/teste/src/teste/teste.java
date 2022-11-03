package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// criei um objeto ,onde recebe o que usuario digitou
		
		Scanner leia = new Scanner(System.in);

		//mensagem na tela
		System.out.println("Bem vindo ao calculo de Media ");

		float nota1, nota2, nota3, media; // variavel

		// mensagem na tela e pega o que usuario digitou e armazena na varialve
		System.out.println("Insita a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Insita a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Insita a terceira nota: ");
		nota3 = leia.nextFloat();
		//----
		
		// calculo da media
		
		
		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("A media das notas e " +media );

		
		
		
		
		
		
		
		/* if (nota1 > nota2) {
			System.out.println("A primeira Nota digitada que é " + nota1 + " é MAIOR");

		} else{
			System.out.println("A segunda Nota digitada que é " + nota2 + " é MAIOR");
		}

		*/
		
		
		
		
		
	}

}
