package exec3CateIdade;

import java.util.Scanner;

public class exec3CateIdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		// criando a var

		int idade;
		int verifica = 0;

		// Mensagem e lendo o que usuario ler
		System.out.println("-- Ola de acordo com sua categoria, vamos verificar qual sua Categoria ");
		System.out.println(" Digite sua idade ");
		idade = leia.nextInt();

		// verificando qual idade foi digitada
		if (idade <= 0) {
			System.out.println("Idade invalida");
		}
		// se for maior que zero, vou armazenar na variavel Verifica.
		// quero usar case por isso estou fazendo assim
		if (idade >= 10 && idade <= 14) {
			verifica = 1;
		}
		if (idade >= 15 && idade <= 17) {
			verifica = 2;
		}
		if (idade >= 18 && idade <= 25) {
			verifica = 3;
		}
		if (idade >= 26 && idade <= 50) {
			verifica = 4;
		}
		if (idade >= 51) {
			verifica = 5;
		}

		// pegando a indormacao da variavel verifica e usando case

		switch (verifica) {

		case 1:
			System.out.println("Sua categoria é infantil ");
			break;
		case 2:
			System.out.println("Sua categoria é juvenil ");
			break;
		case 3:
			System.out.println("Sua categoria é adulto ");
			break;
		case 4:
			System.out.println("Sua categoria flor da idade ");
			break;
		case 5:
			System.out.println("Sua categoria é senior ");
			break;
		default:
			System.out.println(" Voce digitou algo errado. ");

		}

	}

}
