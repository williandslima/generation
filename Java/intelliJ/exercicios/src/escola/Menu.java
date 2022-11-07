package escola;

import java.util.Scanner;

import escola.module.Aluno;
import escola.module.Diretor;
import escola.module.notas;

public class Menu {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        //____________Testando os Objetos
        // objeto aluno com ... Matricula, Nome, Idade e mostrando dos dados do aluno
        Aluno aluno = new Aluno(1, "Willian Lima", 5);
        // ojeto notas com as notas 1,2,3,4// Mostando as notas com a media ( falta
        // float )
        aluno.visualizar();
        Diretor diretor = new Diretor(1, "Pedro ", "Creche");
        diretor.visualizar();

        //____________________________________

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
                    System.out.println("Lançar notas");
                    break;

                case 3:
                    System.out.println("Calcular média");
                    break;

                case 4:
                    System.out.println("Editar cadastro");
                    break;

                case 5:
                    System.out.println("Editar notas");
                    break;

                case 6:
                    System.out.println("Relatório geral");
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;

            }

        }

    }
}