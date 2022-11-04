package estruturas;

import java.util.Scanner;

public class whileInfinito {

	public static void main(String[] args) {
		
		//
		Scanner leia = new Scanner(System.in);
		int opcao;

		System.out.println("Numero");
		opcao = leia.nextInt();

		while (true) { // loop infinito enquanto eu nao der opcao 7

			opcao = leia.nextInt();

			if (opcao == 3) {
				System.out.println("Seção finalizada");
				leia.close();
				System.exit(0);// sai totalmente
			}
		}
	}
}
