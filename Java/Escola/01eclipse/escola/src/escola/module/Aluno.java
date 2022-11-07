package escola.module;

public class Aluno extends Pessoa {

    private int idade;

    public Aluno(int matricula, String nome, int idade) {
        super(matricula, nome);
        this.idade = idade;
        // TODO Auto-generated constructor stub
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("\n Idade " + this.idade);

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
}