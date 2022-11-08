package escola;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import escola.module.Aluno;
import escola.module.Diretor;
import escola.module.Pessoa;
import escola.module.notas;

public class Menu {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {

        int matricula = 0;
        /// colection
        Collection < Pessoa > pes = new ArrayList<Pessoa>();

        //____________Testando os Objetos
        Aluno aluno = new Aluno(1, "Willian Lima", 5);
        aluno.visualizar();

        Diretor diretor = new Diretor(1, "Pedro ", "Creche");
        diretor.visualizar();

        //____________________________________
        boolean loop = true; // verificacao

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
            System.out.println("         3 - Pesquisar Aluno         "); // calcular media do aluno
            System.out.println("         4 - Editar cadastro         "); // editar cadastro do aluno
            System.out.println("         5 - Excluir cadastro        "); // editar notas
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
                    System.out.println("Nome do aluno");
                    String nome = leia.nextLine();
                    System.out.println("Cadastrar Matricula");
                    int matricula = leia.nextInt();
                    keyPress();
                    break;

                case 2:
                    System.out.println("Lançar notas");
                    keyPress();
                    break;

                case 3:
                    System.out.println("Pesquisa Aluno");
                    keyPress();
                    break;

                case 4:
                    System.out.println("Editar cadastro");
                    keyPress();
                    break;

                case 5:
                    System.out.println("Excluir cadastro");
                    keyPress();
                    break;

                case 6:
                    System.out.println("Relatório geral");
                    keyPress();
                    break;

                default:
                    System.out.println("Opcao invalida");
                    keyPress();
                    break;
            }
        }
    }

    //  Continuar ----
    public static void keyPress() {

        try {

            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}