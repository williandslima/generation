import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //criando variavel

        int numero1, numero2, numero3 ;
        // Mensagem na tela e Pengando o que o usuario digita
        System.out.println(" ---- Vamos verificar qual numero é maior ---- ");

        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = leia.nextInt();
        System.out.println("Insita o Segundo número inteiro : ");
        numero2 = leia.nextInt();
        System.out.println("Insita o Segundo número inteiro : ");
        numero3 = leia.nextInt();

        //verificando qual dos 3 e maior
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O Numero digitado "+numero1+ " " +
                    "é maior que os numeros digitados " +numero2+ " e " +numero3 );
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O Numero digitado "+numero2+ " " +
                    "é maior que os numeros digitados " +numero1+ " e " +numero3 );
        } else {
            System.out.println("O Numero digitado "+numero3+ " " +
                    "é maior que os numeros digitados " +numero2+ " e " +numero1 );
        }

    }
}
