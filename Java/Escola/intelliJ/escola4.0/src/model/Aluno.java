package model;

public class Aluno extends Pessoa {

    private int idade;
    private float nota1, nota2, nota3, nota4;

    public Aluno(int matricula, String nome, int idade, float nota1, float nota2, float nota3, float nota4) {
        super(matricula, nome);

        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        // TODO Auto-generated constructor stub
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void visualizar() {
        super.visualizar();
    }

    public void visualizarNotas() {

        float media = ((nota1 + nota2 + nota3 + nota4) / 4);

        if (idade > 3) {
           // System.out.println("\n Aluno da Creche aprovado!");
            if (media != 0) {
                if (media >= 7 && media <= 10) {
                    System.out.println("A media é: " + media + " Aluno aprovado!");
                } else {
                    System.out.println("A media é: " + media + " Aluno reprovado!");
                }
            }
        } else
            System.out.println("----  Aluno da Creche aprovado!  ----");

    }

    public void visualizarDiretor() {

        if (+this.idade > 0 && +this.idade <= 3) {
            System.out.println("\n---  Aluno matriculado na Creche  ---");
            System.out.println("-----------------  Diretor: Ruan  ---");
            System.out.println("=====================================");


        }
        if (+this.idade >= 4 && +this.idade <= 6) {
            System.out.println("\n-  Aluno matriculado na Pré-Escola  -");
            System.out.println("----------------  Diretor: Ederson  -");
            System.out.println("=====================================");


        }
        if (+this.idade >= 7 && +this.idade <= 14) {
            System.out.println("\n- Matriculado no Ensino fundamental -");
            System.out.println("-----------------  Diretor: Willian -");
            System.out.println("=====================================");


        }
        if (+this.idade >= 15 && +this.idade <= 17) {
            System.out.println("\n---  Matriculado no Ensino média ---");
            System.out.println("------------------ Diretor: Douglas -");
            System.out.println("=====================================");


        }
        if (+this.idade >= 18) {
            System.out.println("\n-  Matriculado no Ensino superior   -");
            System.out.println("-------------------  Diretor: Ralph -");
            System.out.println("=====================================");
        }

    }
}
