package escola.module;

import java.util.ArrayList;

public class alunoController implements Repository {

    // criar colection antes dos methodos

    private ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();


    @Override
    public void pesquisarAluno(int matricula) {
        var nomeAluno = buscarNaCollection(matricula);

        if (listaPessoa != null)
            Pessoa.visualizar();
        else
            System.out.println("Matricula nao encontrada");


    }

    private void buscarNaCollection(int matricula) {

        for (var aluno : listaAluno) {
            if (aluno.getNumero() == matricula)
                return aluno;
        }

        return null;
    }

    @Override
    public void cadastrarAluno(Aluno aluno) {
      //  aluno.setNumero(gerarNumero()); // criando numeros automaticmos

        listaAluno.add(aluno);
        System.out.println("Conta foi criada!");


    }

    public int gerarNumero() {
        return listaAluno.size() + 1; /// metodo vai retornar numero de lista etcs
    }

    @Override
    public void editarCadastro(Aluno aluno) {

    }

    @Override
    public void lancarNotas(notas notas) {

    }

    @Override
    public void excluirCadastro(int matricula) {

        var aluno = buscarNaCollection(matricula);

        if (matricula != null) {
            if (listaAluno.remove(matricula) == true)
                System.out.println("Aluno apagada");

        } else
            System.out.println("Aluno nao encontrada");

    }

    public int getNumero() {

        return listaAluno.size() + 1; /// metodo vai retornar numero de lista etcs

    }

    @Override
    public void relatorio() {

    }
}
/*
    @Override
    public void cadastrarAluno(Aluno aluno) {
        // gerar numero automaticamente
        aluno.setMatricula(gerarNumero());// criando numeros automaticmos

        // criar conta
        listaAluno.add(aluno);
        System.out.println("Aluno cadastrado");

    }

    private int gerarNumero() {
        return listaAluno.size() + 1; /// metodo vai retornar numero de lista etcs

    }

    @Override
    public void lancarNotas(notas notas) {

    }

    @Override
    public void pesquisarAluno(Aluno aluno) {

    }

    @Override
    public void editarCadastro(Aluno aluno) {


    }

    @Override
    public void excluirCadastro(int matricula) {

        var aluno = buscarNaCollection(matricula);

        if (matricula != null) {
            if (listaAluno.remove(matricula) == true)
                System.out.println("Aluno apagado");

        } else
            System.out.println("Aluno nao encontrada");


    }

    public void buscarNaCollection(int matricula) {
        for (var Aluno : listaAluno) {
            if (matricula.getNumero() == matricula)
                return Aluno;
        }

        return null;
    }

    @Override
    public void relatorio() {

    }
    //--


}