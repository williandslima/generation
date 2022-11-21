package controller;

import escola.Tela;
import model.Aluno;
import model.Diretor;
import model.Pessoa;
import repository.Repository;

import java.io.IOException;
import java.util.ArrayList;

public class Controller implements Repository {
    Tela tela = new Tela(); //objeto onde fica todas mensagens da tela
    private ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();

    @Override
    public void pesquisarMatricula(int numero) {
        var pesquisa = buscarNaCollection(numero);

        if (pesquisa != null)
            pesquisa.visualizar();
        else
            tela.msgAlunoNaoEncontrado();
    }

    @Override
    public void cadastrar(Pessoa nome) {

    }

    @Override
    public void atualizar(Pessoa nome) {

    }

    public Aluno buscarNaCollection(int numero) { // retornar pessoa
        for (var aluno : listaAluno) {
            if (aluno.getMatricula() == numero)
                return aluno;
        }

        return null;
    }


    public void cadastrar(Aluno nome) {// riando numeros automaticmos
        nome.setMatricula(gerarNumero());
        // criar conta
        listaAluno.add(nome);
    }

    private int gerarNumero() {
        return listaAluno.size() + 1; /// metodo vai retornar numero de lista etcs
    }


    public void atualizar(Aluno nome) {

        var buscaAluno = buscarNaCollection(nome.getMatricula());

        if (buscaAluno != null) {
            listaAluno.set(listaAluno.indexOf(buscaAluno), nome);
        } else
            System.out.println("\nA matricula: " + nome.getMatricula() + " não foi encontrado!");

    }

    @Override
    public void deletar(int numero) {

        var pesquisa = buscarNaCollection(numero);
        if (pesquisa != null) {
            if (listaAluno.remove(pesquisa))
                System.out.println("----------  Aluno apagado  ----------");
            System.out.println("----------  " + pesquisa.getNome() + "  ----------");
            System.out.println("_____________________________________");

        } else
            System.out.println("------  Aluno não encontrado!  ------");
        System.out.println("_____________________________________");


    }


    @Override
    public void listarTodas() {
        for (var aluno : listaAluno) {
            aluno.visualizar();
        }
    }

    public void listarRelatorio() {
        for (var aluno : listaAluno) {
            aluno.visualizar();
            aluno.visualizarNotas();
            aluno.visualizarDiretor();
        }
    }

    public void listarAlinhado() {
        for (var aluno : listaAluno) {
            System.out.println("Matricula: "+aluno.getMatricula() +" | Nome: " +aluno.getNome() );
        }
    }

    public void cadastrarAuto() {
        cadastrar(new Aluno(1, "Enzo", 2, 0, 0, 0, 0));
        cadastrar(new Aluno(2, "Ricardo", 6, 10, 9, 8, 7));
        cadastrar(new Aluno(3, "Augusto", 10, 9, 7, 7, 9));
        cadastrar(new Aluno(4, "Pedro", 17, 5, 9, 8, 7));
        cadastrar(new Aluno(5, "Antonio", 35, 1, 2, 3, 4));
    }


    public static void continuarSet() {

        try {
            Tela tela = new Tela(); //objeto onde fica todas mensagens da tela
            tela.msgEnterContinuar();
            System.in.read();
        } catch (IOException e) {
            Tela tela = new Tela(); //objeto onde fica todas mensagens da tela
            tela.msgEnterDiferente();
        }
    }

    /// diretoria atualizar e visualizar


}
