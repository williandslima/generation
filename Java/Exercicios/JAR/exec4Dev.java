package exec4Dev;

import java.util.Scanner;

public class exec4Dev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		
		int idade, sexo, categoria, catBackend = 0, catFrontend = 0, catMobile = 0, catFullSatack = 0;
		String continua = "S";

		while (continua.equals("S")) {

			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

			do {
				System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
				sexo = leia.nextInt();

				if (sexo < 1 || sexo > 3)
					System.out.println("Digite um número entre 1 e 3");

			} while (sexo < 1 || sexo > 3);
//
			
			
			do {
				System.out.println("Digite a Categoria (1-Backend / 2-Frontend / 3-Mobile / 4-FullStack): ");
				categoria = leia.nextInt();

				if (categoria < 1 || categoria > 4)
					System.out.println("Digite um número entre 1 e 4");

			} while (categoria < 1 || categoria > 4);

			if (categoria == 1)
				catBackend++;

			if (categoria == 2 && sexo == 2)
				catFrontend++;

			if (categoria == 3 && sexo == 1 && idade > 40)
				catMobile++;

			if ((categoria == 1 || categoria == 2) && idade < 30)
				catFullSatack++;

			System.out.println("Deseja continuar(S/N)? ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();

		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend " + catBackend);
		System.out.println("\nTotal de pessoas do sexo Feminino Dev. Frontend: " + catFrontend);
		System.out.println("\nTotal de pessoas do sexo Masculino, Dev. Mobile maiores de 40 anos: " + catMobile);
		System.out.println("\nTotal de pessoas Dev. FullStack menores de 30 anos " + catFullSatack);

	}

}
