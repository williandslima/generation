package contaBancaria;

import java.io.IOException;
import java.util.Scanner;

import contaBancaria.controller.ContaController;
import contaBancaria.model.conta;
import contaBancaria.model.contaCorrente;
import contaBancaria.util.cores;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario;
		float saldo, limite;
		String titular;

		// istanciar da conta controle

		ContaController contas = new ContaController();
		// criar conta
		contaCorrente cc1 = new contaCorrente(contas.gerarNumero(), 123, 1, "Willian", 1000f, 100f); // criando objeto
		contas.cadastrar(cc1); // adicionando o objeto na collection

		// listar contas
		contas.listarTodas();

		// editar conta

		// ----

		while (true) { // loop infinito enquanto eu nao der opcao 7

			System.out.println(cores.TEXT_YELLOW_BOLD + "_____________________________________" + cores.TEXT_RESET);
			System.out.println("                                     ");
			System.out.println("              BANCO W                ");
			System.out.println("_____________________________________");
			System.out.println("                                     ");
			System.out.println("            1 - Criar conta          ");
			System.out.println("            2 - Listar todas         ");
			System.out.println("            3 - Buscar por numero    ");
			System.out.println("            4 - Sacar                ");
			System.out.println("            5 - Apagar conta         ");
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

				// Formulario criar conta
				System.out.println("Digite o numero da Agencia");
				agencia = leia.nextInt();
				System.out.println("Digite o nome do Titular");
				leia.skip("\\R?"); // tudo que for string ignorar a sujeira de cima
				titular = leia.nextLine();
				System.out.println("Digite o tipo da Conta( 1-CC  ou 2-CP ");
				tipo = leia.nextInt();
				System.out.println("Digite o Saldo");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite");
					limite = leia.nextFloat();
					contas.cadastrar(new contaCorrente(0, agencia, tipo, titular, saldo, limite ));
				}
				case 2 -> {
					System.out.println("Digite o dia do aniversario");
					aniversario = leia.nextInt();
					contas.cadastrar(new contaPoupanca(0, agencia, tipo, titular, saldo, aniversario ));
				
				}

				}
				// ----

				keyPress();
				// cadastra aluno// // / // /
				break;

			case 2:
				System.out.println("Listar Todas");
				contas.listarTodas();

				keyPress();

				break;

			case 3:
				System.out.println("Buscar por numero");
				
				System.out.println("Digite o numero da conta");
				numero = leia.nextInt();
				contas.procurarPorNumero(numero);

				
				keyPress();

				break;

			case 4:
				System.out.println("Sacar");
				keyPress();

				break;

			case 5:
				System.out.println("Apagar conta");

				System.out.println("Digite o numero da conta");
				numero = leia.nextInt();
				contas.deletar(numero);

				
				
				keyPress();

				break;

			case 6:
				System.out.println("Transferir");
				keyPress();

				break;

			default:
				System.out.println("Opcao invalida");
				break;

			}

		}

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
