package escola.module;



public interface Repository {

    public void cadastrarAluno (Aluno aluno);
    public void lancarNotas (notas notas);
    public void pesquisarAluno (Aluno aluno);
    public void editarCadastro (Aluno aluno);
    public void excluirCadastro (Aluno aluno);
    public void relatorio ();

}
