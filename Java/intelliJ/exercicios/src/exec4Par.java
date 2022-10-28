import java.util.Scanner;
import java.text.DecimalFormat;
public class exec4Par {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        //criando variavel

        int numero, x;


        //mensagem, lendo numero do usuario e armazenando em numero
        System.out.println("Digite o primeiro número inteiro: ");
        numero = leia.nextInt();

        x = numero % 2;
        if (x == 0 ){
            System.out.println("O Numero: " +numero+ " é PAR, e a raiz quadrada dele é: " + df.format(Math.sqrt(numero))) ;

        }else {
            System.out.println("O Numero: " +numero+ " é IMPAR, e a potencia  é: " + df.format(numero * numero)) ;
        }

    }


}
