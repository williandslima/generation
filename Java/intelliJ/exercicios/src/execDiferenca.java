import java.util.Scanner;

public class execDiferenca {

    public static void main(String[] args) {
        // criando "methodos" para ler o que usuario escreve
        Scanner leia = new Scanner(System.in);

        // Variaveis

        int numero1, numero2, numero3, numero4, diferenca;

        System.out.println("Vamos calcular a diferença entre os numeros : ");
        System.out.println("Digite o primeiro numero: "); // mensagem na tela
        numero1 = leia.nextInt(); // Armazenar o que usuario escreveu
        System.out.println("Digite o segundo numero: "); // mensagem na tela
        numero2 = leia.nextInt(); // Armazenar o que usuario escreveu
        System.out.println("Digite o terceiro numero: "); // mensagem na tela
        numero3 = leia.nextInt(); // Armazenar o que usuario escreveu
        System.out.println("Digite o quarto numero: "); // mensagem na tela
        numero4 = leia.nextInt(); // Armazenar o que usuario escreveu

        diferenca = (numero1 * numero2) - (numero3 * numero4);
        System.out.println("A diferenca entre os numeros é: " + diferenca); // mensagem na tela

    }
}
