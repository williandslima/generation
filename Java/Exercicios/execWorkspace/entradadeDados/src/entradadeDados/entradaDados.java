package entradadeDados;

import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero, soma = 0 ;
		String continua = "S";

		while (continua.equals("S")) {

			System.out.println("Digite a sua idade: ");
			numero = leia.nextInt();
			
			soma = (numero + soma);

			//fim do loop
			System.out.println("Deseja continuar(S/N)? ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();

		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend " + soma);

	}

}
