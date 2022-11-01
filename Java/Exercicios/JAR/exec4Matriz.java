import java.util.Scanner;

public class exec4Matriz {
    public static void main(String[] args) {
        int tamanhoI, tamanhoJ;
        Scanner leia = new Scanner(System.in); // objeto para pegar do usuario
        int [][]m = new int [3][3];

        tamanhoI = 3;
        tamanhoJ = 3;
        int indiceI, indiceJ;
        for ( indiceI = 0; indiceI < tamanhoI; indiceI++) {

            for ( indiceJ = 0; indiceJ < tamanhoJ; indiceJ++) {

                System.out.println("Digite um valor para a entrada na posicao [" + indiceI + "][" + indiceJ + "]: ");
                m[indiceI][indiceJ] = leia.nextInt();

            }
        }

        System.out.println("Os elementos da Diagonol principal: " + m[0][0] + m[1][1] + m[2][2]);
        System.out.println("Os elementos da Diagonol Secundaria: " + m[0][2] + m[1][1] + m[2][0]);
        int soma = m[0][0] + m[1][1] + m[2][2];
        System.out.println("Soma principal " + soma);
        int soma2 = m[0][2] + m[1][1] + m[2][0];
        System.out.println("Soma Secundaria " + soma2);


    }
}

