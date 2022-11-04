package escola.module;

public class aluno {

    // ATRIBUTOS

    private int matricula;
    private String nome;
    private int idade;

    // referenciando

    public aluno(int matricula, String nome, int idade) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }


    //

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void visualizar() {
        System.out.println("\n *********************");
        System.out.println("\n Dados do aluno ");
        System.out.println("\n *********************");
        System.out.println("\n N. Matricula " + this.matricula);
        System.out.println("\n Nome " + this.nome);
        System.out.println("\n idade  " + this.idade);

        if (+this.idade > 0 && +this.idade <= 3) {
            System.out.println("\n Creche  ");
        }
        if (+this.idade >= 4 && +this.idade <= 6) {
            System.out.println("\n Pré-Escola  ");
        }
        if (+this.idade >= 7 && +this.idade <= 14) {
            System.out.println("\n Ensino fundamental  ");
        }
        if (+this.idade >= 15 && +this.idade <= 17) {
            System.out.println("\n Ensino média  ");
        }
        if (+this.idade >= 18) {
            System.out.println("\n Ensino superior  ");
        }


    }

    //

}

