import java.text.DecimalFormat;
import java.util.Scanner;

public class execMedia {
    public static void main(String[] args) {

        // criando "methodos" para ler o que usuario escreve
        Scanner leia = new Scanner(System.in);

        // formatando as casas decimais
        DecimalFormat df = new DecimalFormat("###.#");

        // variaveis

        float nota1, nota2, nota3, nota4, media;

        // digite as notas e leia as notas
        System.out.println("Vamos calcular a média: ");
        System.out.println("Digite a nota 1: "); // mensagem para digitar
        nota1 = leia.nextFloat(); // nota armazenar o que usuario escreveu
        System.out.println("Digite a nota 1: "); // mensagem para digitar
        nota2 = leia.nextFloat(); // nota1 armazenar o que usuario escreveu
        System.out.println("Digite a nota 1: "); // mensagem para digitar
        nota3 = leia.nextFloat(); // nota1 armazenar o que usuario escreveu
        System.out.println("Digite a nota 1: "); // mensagem para digitar
        nota4 = leia.nextFloat(); // nota1 armazenar o que usuario escreveu

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\n A media das notas é: " + df.format(media)); // mostrando o valor da media e formantando
        // casas decimais

        // calcular media dos participantes
    }
}
