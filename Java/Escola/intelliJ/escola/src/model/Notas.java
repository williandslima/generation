package model;

public class Notas {// atributos notas do Aluno
    private float nota1, nota2, nota3, nota4;
    // metodo construtor, referenciando um espaco na memoria para cada nota
    public Notas(float nota1, float nota2, float nota3, float nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    // metodo get(para retornar o valor) e metodo set (setar, enviar o valor para o atributo)

    /// float
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

    // int - metodo em Sobrecarga
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    // metodo para visualizar a "resposta" dos itens
    public void visualizar() {
        System.out.println("\n nota1 " + this.nota1);
        System.out.println("\n nota2 " + this.nota2);
        System.out.println("\n nota3 " + this.nota3);
        System.out.println("\n nota4 " + this.nota4);
        float media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
        System.out.println("\n Media " +media);
    }
}