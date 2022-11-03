import java.util.Scanner;

public class exec1Vetor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); // objeto para pegar do usuario
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; /// cria com dados

        System.out.println("\n Digite um numero para verificacao ");
        int recebe = leia.nextInt();
        int indice = 0;

        if (recebe >= 10 ){
            System.out.println("\n O numero nao foi encontrado " +recebe);
        }
        for (indice = 0; indice < vetor.length; indice++) {
            if (recebe == vetor[indice]) {
                System.out.println("\n O numero " + recebe + " Localizado na posicao " + indice);
            }
        }
    }
}
