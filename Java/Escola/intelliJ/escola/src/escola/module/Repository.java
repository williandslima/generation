package escola.module;


import escola.module.Pessoa;

import escola.module.Aluno;

import escola.module.Diretor;

import escola.module.notas;

public interface Repository {

    public void pesquisarAluno (int matricula);

    public void cadastrarAluno (Aluno nome);


    public void editarCadastro (Aluno nome);


    public void lancarNotas (notas notas);


    public void excluirCadastro (int matricula);


    public void relatorio ();

}
