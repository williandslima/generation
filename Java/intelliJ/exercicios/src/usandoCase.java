import java.util.Scanner;

public class usandoCase {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String sigla;

        System.out.println(" Insira a sigla do seu Estado: ");
        sigla = leia.nextLine();

        switch (sigla.toUpperCase()) {

            case "SP":
                System.out.println(" Voce e de Sao Paulo ");
                System.out.println("Digite o nome do Aluno");
                String recebe = leia.nextLine();
                break;

            case "BA":
                System.out.println(" Voce e da Bahia ");
                break;

            case "RS":
                System.out.println(" Voce e do Rio Grande do Sul ");
                break;

            default:
                System.out.println(" Insira a sigla do seu Estado: ");


        }
    }
}