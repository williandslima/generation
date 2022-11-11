package escola;


import controller.Controller;
import model.Aluno;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int matricula = 0, idade;
        String nome;
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0; // as notas sempre iniciam zeradas
        Controller aluno = new Controller(); //objeto com a lista para armazenar info do aluno
        Tela tela = new Tela(); //objeto onde fica todas mensagens da tela
        aluno.cadastrarAuto(); // cadastrando 5 alunos automaticos

        //____________________________________
        boolean loop = true; // verificacao
        //Loop do menu
        int opcao;

        while (true) { // loop infinito enquanto eu nao der opcao 7

            tela.MenuPrincipal();
            try {
                opcao = leia.nextInt();
                if (opcao == 7) {
                    tela.msgSecaoFinalizada(); // opcao 7 se usuario digitar 7 encerra secao
                }
                switch (opcao) {
                    case 1: // cadastrar aluno
                        tela.msgDigiteNomeAluno();
                        nome = leia.nextLine();
                        tela.msgDigiteIdadeAluno();
                        idade = leia.nextInt();

                        // coloando informacoes na lista aluno, com nota 0
                        aluno.cadastrar(new Aluno(0, nome, idade, nota1, nota2, nota3, nota4));
                        tela.msgAlunoCadSucesso();
                        keyPress();
                        break;

                    case 2: // calcular media
                        tela.msgLacamentoNotas();
                        tela.msgDigiteMatricula();
                        int pesquisaMatricula = leia.nextInt();
                        leia.skip("\\R?");
                        //QUANDO A MATRICULA E PESQUISADA ELE ARMAZENA ESSAS INFO
                        Aluno aluno1 = aluno.buscarNaCollection(pesquisaMatricula);
                        String nomeAluno = aluno1.getNome();
                        Aluno idade1 = aluno.buscarNaCollection(pesquisaMatricula);
                        int idadeAluno = idade1.getIdade();
                        tela.msgListarLancarNotas();
                        System.out.println("Nome: " + nomeAluno);
                        System.out.println("Idade: " + idadeAluno);

                        if (aluno.buscarNaCollection(pesquisaMatricula) != null) {
                            do {
                                tela.msgDigiteNota1();
                                leia.skip("\\R?");
                                nota1 = leia.nextFloat();
                                if (nota1 < 0 || nota1 > 10) {
                                    tela.msgAtencao();
                                }
                            } while (nota1 < 0 || nota1 > 10);

                            do {
                                tela.msgDigiteNota2();
                                leia.skip("\\R?");
                                nota2 = leia.nextFloat();
                                if (nota2 < 0 || nota2 > 10) {
                                    tela.msgAtencao();
                                }
                            } while (nota2 < 0 || nota2 > 10);

                            do {
                                tela.msgDigiteNota3();
                                leia.skip("\\R?");
                                nota3 = leia.nextFloat();
                                if (nota3 < 0 || nota3 > 10) {
                                    tela.msgAtencao();
                                }
                            } while (nota3 < 0 || nota3 > 10);

                            do {
                                tela.msgDigiteNota4();
                                leia.skip("\\R?");
                                nota4 = leia.nextFloat();

                                if (nota4 < 0 || nota4 > 10) {
                                    tela.msgAtencao();
                                }
                            } while (nota4 < 0 || nota4 > 10);

                            aluno.atualizar(new Aluno(pesquisaMatricula, nomeAluno, idadeAluno, nota1, nota2, nota3, nota4));
                            tela.msgNotasCadastradas();

                        } else
                            tela.msgAlunoNaoEncontrado();

                    {
                        keyPress();
                    }
                    break;

                    case 3: //listar alunost
                        tela.msgListarTodosAlunos();
                        // aluno.listarTodas();
                        aluno.listarAlinhado();
                        keyPress();
                        break;

                    case 4: // editar cadastro
                        System.out.println("Atualizar cadastro");
                        //procurar aluno
                        aluno.listarAlinhado();
                        tela.msgDigiteMatricula();
                        pesquisaMatricula = leia.nextInt();
                        leia.skip("\\R?");
                        Aluno aluno2 = aluno.buscarNaCollection(pesquisaMatricula);
                        String nomeAluno2 = aluno2.getNome();
                        Aluno idade2 = aluno.buscarNaCollection(pesquisaMatricula);
                        int idadeAluno2 = idade2.getIdade();
                        tela.msgAtualizarCadastro();
                        System.out.println("Nome: " + nomeAluno2);
                        System.out.println("Idade: " + idadeAluno2);

                        if (aluno.buscarNaCollection(pesquisaMatricula) != null) {

                            tela.msgNovoNomeAluno();
                            leia.skip("\\R?");
                            nome = leia.nextLine();
                            tela.msgDigiteIdadeAluno();
                            idade = leia.nextInt();
                            aluno.atualizar(new Aluno(pesquisaMatricula, nome, idade, 0, 0, 0, 0));
                            tela.msgAlunoAtualizado();
                            System.out.println("Para matricula: " + pesquisaMatricula);
                            System.out.println("O Nome foi atualizado para: " + nome);
                            System.out.println("A idade foi atualizada para: " + idade);


                        } else
                            tela.msgAlunoNaoEncontrado();

                        keyPress();
                        break;

                    case 5: // excluir cadastro

                        tela.msgListaAlunosExcluir();
                        aluno.listarAlinhado();
                        tela.msgExluirAlunos();
                        int numero = leia.nextInt();
                        aluno.deletar(numero);
                        keyPress();
                        break;
                    case 6: // relatorio geral de alunos
                        System.out.println("Relatório geral");
                        aluno.listarRelatorio();
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
            Tela tela = new Tela(); //objeto onde fica todas mensagens da tela
            tela.msgEnterContinuar();
            System.in.read();
        } catch (IOException e) {
            Tela tela = new Tela(); //objeto onde fica todas mensagens da tela
            tela.msgEnterDiferente();
        }
    }
}