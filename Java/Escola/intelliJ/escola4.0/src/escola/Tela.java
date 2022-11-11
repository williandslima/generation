package escola;

import static escola.Menu.leia;

public class Tela {

    public void MenuPrincipal (){
        System.out.println("=====================================");
        System.out.println("              ESCOLA                 ");
        System.out.println("=====================================");
        System.out.println("         1 - Cadastrar aluno	     ");
        System.out.println("         2 - Lançar notas            ");
        System.out.println("         3 - Listar alunos           ");
        System.out.println("         4 - Atualizar cadastro      ");
        System.out.println("         5 - Excluir cadastro        ");
        System.out.println("         6 - Relatório geral         ");
        System.out.println("         7 - Sair                    ");
        System.out.println("=====================================");
        System.out.println("     Entre com a opção desejada      ");
        System.out.println("=====================================");
    }
    public void msgSecaoFinalizada(){
        System.out.println("--------   Seção finalizada -------- ");
        System.out.println("=====================================");
        leia.close();
        System.exit(0);
    }

    public void msgDigiteNomeAluno() {
        System.out.println("------  Digite o nome do aluno  -----");
        leia.skip("\\R?"); // tudo que for string ignorar a sujeira de cima
    }

    public void msgDigiteIdadeAluno() {
        System.out.println("-----  Digite a idade do Aluno  -----");
    }

    public void msgListarLancarNotas () {

       // System.out.println("Lançar notas do aluno ") + nomeAluno);
        System.out.println("=====================================");
        System.out.println("-------  Inserindo Notas para  ------");

    }

    public void msgAtualizarCadastro () {

        // System.out.println("Lançar notas do aluno ") + nomeAluno);
        System.out.println("=====================================");
        System.out.println("----  Atualizando cadastro para  ----");

    }


    public void msgDigiteMatricula() {
        System.out.println("---  Digite a matricula do aluno  ---");
        System.out.println("=====================================");
    }
    public void msgLacamentoNotas() {
        System.out.println("=====================================");
        System.out.println("-------  Lançamento de Notas  -------");
    }

    public void msgAlunoCadSucesso() {
        System.out.println("--  Aluno cadastrado com sucesso!  --");
        System.out.println("=====================================");
    }
    public void msgDigiteNota1() {
        System.out.println("--------  Digite a Nota 1:  ---------");
    }
    public void msgDigiteNota2() {
        System.out.println("--------  Digite a Nota 2:  ---------");
    }

    public void msgDigiteNota3() {
        System.out.println("--------  Digite a Nota 3:  ---------");
    }
    public void msgDigiteNota4() {
        System.out.println("--------  Digite a Nota 4:  ---------");
    }

    public void msgAtencao() {
        System.out.println("======================================");
        System.out.println("-------------  ATENÇÃO  --------------");
        System.out.println("------ Digite nota entre 0 e 10 ------");
        System.out.println("======================================");

    }

    public void msgNotasCadastradas() {
        System.out.println("=====================================");
        System.out.println("--------  Notas cadastradas, --------");
        System.out.println("-----  para visualizar a média  -----");
        System.out.println("-----  acesse o Relatorio Geral -----");
        System.out.println("=====================================");

    }
    public void msgAlunoNaoEncontrado() {
        System.out.println("------  Aluno não encontrado!  ------");
        System.out.println("=====================================");
    }
    public void msgEnterContinuar() {
        System.out.println("\n--Pressione Enter para Continuar --");
        System.out.println("=====================================");
    }

    public void msgAlunoAtualizado() {
        System.out.println("--------  Dados atualizados  --------");
        System.out.println("=====================================");
    }

    public void msgEnterDiferente() {
        System.out.println("=============================================");
        System.out.println("Você pressionou uma tecla diferente de enter!");
        System.out.println("=============================================");


    }
    public void msgListarTodosAlunos() {
        System.out.println("-------  Listar todos Alunos  -------");
        System.out.println("=====================================");
    }

    public void msgListaAlunosExcluir() {
        System.out.println("--------  Alunos cadastrados  -------");
        System.out.println("=====================================");
    }


    public void msgNovoNomeAluno() {
        System.out.println("Digite o novo Nome do Aluno: ");
    }

    public void msgExluirAlunos() {
        System.out.println("=====================================");
        System.out.println("--  Digite a matricula para exluir --");
    }

}
