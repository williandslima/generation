import java.util.InputMismatchException;
import java.util.Scanner;


public class divisaoException {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {


        int dividendo = 0;
        int divisor = 0;

        // Verificando erro antes do momento do primeiro valor

        boolean loop = true;

        do {

            try {

                System.out.println("Digite o Dividendo: ");
                dividendo = ler.nextInt();

                System.out.println("Digite o Divisor: ");
                divisor = ler.nextInt();
                divide(dividendo, divisor);
                loop = false;

            } catch (InputMismatchException erro) {
                System.out.println("Exceção: " + erro);
                ler.nextLine(); // ler a proxima linha o valor inteiro
                System.out.println("Digite valores inteiros");
            } catch (ArithmeticException erro) {
                System.out.println("Exceção: " + erro);
                ler.nextLine(); // ler a proxima linha o valor inteiro
                System.out.println("Digite valores inteiros positivos");
            }
        } while (loop);


        // _________


    }

    public static void divide(int dividendo, int divisor) {
        System.out.println("Divisão = " + (dividendo / divisor));
    }

}

