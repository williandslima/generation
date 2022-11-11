package pesquisa;

import java.util.Scanner;

public class pesquisa {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, sexo, esporte, futebol = 0, voleibol = 0, basquete = 0, outros = 0;
		String continua = "S"; // para verificar se usuario quer continuar

		// Mensagem e lendo o que usuario ler
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();

		// verificando o que o usuario digitou
		do {

			System.out.println("Digite o sexto (1-M / 2-F / 3-Outros ");
			sexo = leia.nextInt();

			if (sexo < 1 || sexo > 3)
				System.out.println("Digite um numero entre 1 e 3 ");

		} while (sexo < 1 || sexo > 3);

		//

		System.out.println("Digite o seu esporte favorito (1 - Fut/ 2 - Volei / 3 - Basq / 4 - Outros )");
		esporte = leia.nextInt();

		// ---

		// pp verificando

		while (continua.equals("S")) {

			// verificando (filtro de dados)

			if (esporte == 1)
				futebol++;

			if (esporte == 2 && sexo == 2)
				voleibol++;

			if (esporte == 3 && sexo == 1 && idade > 50)
				basquete++;

			if ((esporte == 1 || esporte == 2) && idade > 18)
				outros++;

			System.out.println("DESEJA CONTINUAR (S/N)? ");
			//leia.skip("\\R");
			continua = leia.nextLine().toUpperCase(); // convertendo o que digitou par
			// maisucolo

		}

		// mostrnado resultados

		System.out.println("Total de pessoas que gostam de Futebol" + futebol);
		System.out.println("Total de pessoas que gostam de Volei" + voleibol);
		System.out.println("Total de pessoas que gostam de Basquete" + basquete);
		System.out.println("Total de pessoas que gostam de Outros" + outros);

	}

}
