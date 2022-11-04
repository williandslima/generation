package escola;

import java.util.Scanner;

import escola.module.aluno;
import escola.module.notas;

public class menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // objeto aluno com ... Matricula, Nome, Idade e mostrando dos dados do aluno
        aluno aluno = new aluno(1, "Willian Lima", 2);
        aluno.visualizar();

        // ojeto notas com as notas 1,2,3,4// Mostando as notas com a media ( falta
        // float )
        notas notas = new notas(10, 10, 9, 5);
        notas.visualizar();

        //Loop do menu
        int opcao;

        while (true) { // loop infinito enquanto eu nao der opcao 7

            System.out.println("_____________________________________");
            System.out.println("                                     ");
            System.out.println("              ESCOLA                 ");
            System.out.println("_____________________________________");
            System.out.println("                                     ");
            System.out.println("         1 - Cadastrar Aluno	     "); //cadastrar o aluno
            System.out.println("         2 - Lançar Notas            "); // lancar notas
            System.out.println("         3 - Calcular média          "); // calcular media do aluno
            System.out.println("         4 - Editar cadastro         "); // editar cadastro do aluno
            System.out.println("         5 - Editar notas            "); // editar notas
            System.out.println("         6 - Relatorio geral         "); // relatorio geral de notas e escolas
            System.out.println("         7 - Sair                    "); // sair do sistema
            System.out.println("_____________________________________");
            System.out.println("                                     ");
            System.out.println("     Entre com a opcao desejada      ");
            System.out.println("_____________________________________");

            opcao = leia.nextInt();

            if (opcao == 7) {
                System.out.println("Seção finalizada");
                leia.close();
                System.exit(0);// sai totalmente
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar aluno");
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

        }

    }
}
