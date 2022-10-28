import java.util.Scanner;

public class boletim {
    public static void main(String[] args) {

        //criando a var
        float nota1, nota2, media;
        //instanciando o
        Scanner leia = new Scanner(System.in);

        //Mensagem e lendo o que usuario ler
        System.out.println("Insita a primeira nota: ");
        nota1 = leia.nextFloat();
        System.out.println("Insita a primeira nota: ");
        nota2 = leia.nextFloat();
        // media da nota
        media = (nota1 + nota2) / 2;



    }
}
