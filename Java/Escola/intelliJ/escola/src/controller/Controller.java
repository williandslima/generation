package controller;

import model.Pessoa;
import repository.Repository;

import java.util.ArrayList;

public class Controller implements Repository {

    private ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

    @Override
    public void pesquisarMatricula(int numero) {
        var pesquisa = buscarNaCollection(numero);

        if (pesquisa != null)
            pesquisa.visualizar();
        else
            System.out.println("Conta nao encontrada");
    }

    public Pessoa buscarNaCollection(int numero) { // retornar pessoa
        for (var pesquisa : listaPessoa) {
            if (pesquisa.getMatricula() == numero)
                return pesquisa;
        }

        return null;
    }

    @Override
    public void cadastrar(Pessoa nome) {// riando numeros automaticmos
        nome.setMatricula(gerarNumero());

        // criar conta
        listaPessoa.add(nome);
        System.out.println("Aluno foi criada!");
    }

    private int gerarNumero() {
        return listaPessoa.size() + 1; /// metodo vai retornar numero de lista etcs
    }

    @Override
    public void atualizar(Pessoa nome) {

    }

    @Override
    public void deletar(int numero) {

        var pesquisa = buscarNaCollection(numero);
        if (pesquisa != null) {
            if (listaPessoa.remove(pesquisa))
                System.out.println("Aluno apagado");
        } else
            System.out.println("Aluno nao encontrado");


    }

    @Override
    public void listarTodas() {
        for (var pessoa : listaPessoa) {
            pessoa.visualizar();
        }

    }
}
