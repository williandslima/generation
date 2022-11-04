package contaBancaria;

import java.util.Scanner;

import contaBancaria.model.conta;
import contaBancaria.model.contaCorrente;
import contaBancaria.util.cores;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int opcao;
		contaCorrente conta = new contaCorrente(1, 123, 1, "Willian Lima", 1000.0f, 2000f);
		
		conta.sacar(100000.0f);
		conta.visualizar();


		
		/*
		
		while (true) { // loop infinito enquanto eu nao der opcao 7

			System.out.println(cores.TEXT_YELLOW_BOLD+ "_____________________________________" +cores.TEXT_RESET);
			System.out.println("                                     ");
			System.out.println("              BANCO W                ");
			System.out.println("_____________________________________");
			System.out.println("                                     ");
			System.out.println("            1 - Criar conta          ");
			System.out.println("            2 - Ver saldo            ");
			System.out.println("            3 - Dados da conta       ");
			System.out.println("            4 - Sacar                ");
			System.out.println("            5 - Depositar            ");
			System.out.println("            6 - Trasnferir           ");
			System.out.println("            7 - Sair                 ");
			System.out.println("_____________________________________");
			System.out.println("                                     ");
			System.out.println("       Entre com a opcao desejada    ");
			System.out.println("_____________________________________");

			opcao = leia.nextInt();

			
			if (opcao == 7) {
				System.out.println("Seção finalizada");
				leia.close();
				System.exit(0);// sai totalmente
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar conta");
				// cadastra aluno// // / // /
				break;

			case 2:
				System.out.println("Ver saldo");
				break;

			case 3:
				System.out.println("Dados da Conta");
				break;

			case 4:
				System.out.println("Sacar");
				break;

			case 5:
				System.out.println("Depositar");
				break;

			case 6:
				System.out.println("Transferir");
				break;

			default:
				System.out.println("Opcao invalida");
				break;

			}

		}*/

	}

}
