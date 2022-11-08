package escola;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;
import model.Aluno;
import model.Diretor;
import model.Notas;
import model.Pessoa;

public class Menu {
    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {


        int matricula = 0, idade;
        String nome;
        float nota1, nota2, nota3, nota4;
        Controller pessoa = new Controller();

        /// colection
        //____________Testando os Objetos
        Aluno aluno = new Aluno(1, "Willian Lima", 5);
        // aluno.visualizar();


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
            System.out.println("         3 - Listar Alunos           "); // calcular media do aluno
            System.out.println("         4 - Atualizar cadastro      "); // editar cadastro do aluno
            System.out.println("         5 - Excluir cadastro        "); // editar notas
            System.out.println("         6 - Relatorio geral         "); // relatorio geral de notas e escolas
            System.out.println("         7 - Sair                    "); // sair do sistema
            System.out.println("_____________________________________");
            System.out.println("                                     ");
            System.out.println("     Entre com a opcao desejada      ");
            System.out.println("_____________________________________");

// exception
            try {
                opcao = leia.nextInt();

                if (opcao == 7) {
                    System.out.println("Seção finalizada");
                    leia.close();
                    System.exit(0);// sai totalmente
                }

                switch (opcao) {
                    case 1:
                        System.out.println("Digite nome do aluno");
                        leia.skip("\\R?"); // tudo que for string ignorar a sujeira de cima
                        nome = leia.nextLine();
                        //   System.out.println("Matricula cadastrada" + new);
                        System.out.println("Digite a idade do Aluno");
                        idade = leia.nextInt();
                        pessoa.cadastrar(new Aluno(0, nome, idade)); // instaciar o objeto.... variaveis do leia
                        /// gera matricula -----
                        keyPress();
                        break;

                    case 2:
                        System.out.println("Digite as notas do aluno");
                        System.out.println("Nota 1: ");
                        leia.skip("\\R?"); // tudo que for string ignorar a sujeira de cima
                        nota1 = leia.nextInt();
                        System.out.println("Nota 2: ");
                        leia.skip("\\R?"); // tudo que for string ignorar a sujeira de cima
                        nota2 = leia.nextInt();
                        System.out.println("Nota 3: ");
                        leia.skip("\\R?"); // tudo que for string ignorar a sujeira de cima
                        nota3 = leia.nextInt();
                        System.out.println("Nota 4: ");
                        leia.skip("\\R?"); // tudo que for string ignorar a sujeira de cima
                        nota4 = leia.nextInt();
                      // simplificar pessoa.cadastrar(new Notas(nota1, nota2,nota3,nota4)); // instaciar o objeto.... variaveis do leia


                        keyPress();
                        break;

                    case 3:
                        System.out.println("Listar Todas");
                        pessoa.listarTodas();
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
            } catch (InputMismatchException e) {
                System.out.println("Digite um numero inteiro");
                leia.nextLine();// tratamento mensagem
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