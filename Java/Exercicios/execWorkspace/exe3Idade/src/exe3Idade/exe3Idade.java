package exe3Idade;

import java.util.Scanner;

public class exe3Idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, menor21 = 0, maior50 = 0, outros = 0;

		// Mensagem e lendo o que usuario ler
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		// verificar quantas pessoas sao menor de 21 anos e quantas maior de 50 anos
		String continua = "S";
		while (continua.equals("S")){

			// verificando (filtro de dados), salvando quantidade

			if (idade < 21)
				menor21++;

			if (idade > 50)
				maior50++;

			if (idade >= 21 && idade <= 50)
				outros++;
			

			
		}

		System.out.println("\nTotal de pessoas que gostam de IDADE 21: " + menor21);
		System.out.println("\nTotal de pessoas que gostam de IDADE 21 e 50: " + outros);
		System.out.println("\nTotal de pessoas que gostam de IDADE maior 50: " + maior50);

	}
}