import java.util.Scanner;

public class pesquisa {

    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {

        int idade, sexo, esporte, futebol = 0, voleibol = 0, basquete = 0, outros = 0;
        Character continua = 'S'; // para verificar se usuario quer continuar

        // Mensagem e lendo o que usuario ler
        System.out.println("Digite a sua idade: ");
        idade = leia.nextInt();

        System.out.println("Digite o sexto (1-M / 2-F / 3-Outros ");
        sexo = leia.nextInt();

        System.out.println("Digite o seu esporte favorito (1 - Fut/ 2 - Volei / 3 - Basq / 4 - Outros )");
        esporte = leia.nextInt();

        // ---

        // pp verificando

        while (continua == 'S') {


            // verificando (filtro de dados)

            if (esporte == 1)
                futebol++;

            if (esporte == 2 && sexo == 2)
                voleibol++;

            if (esporte == 3 && sexo == 1 && idade > 50)
                basquete++;

            if ((esporte == 1 || esporte == 2) && idade > 18)
                outros++;

            System.out.println("DESEJA CONTINUAR (S/N)? ");
            leia.skip("\\R");

            String s =String.valueOf(continua);// convertendo char para string
            s = leia.nextLine(); // convertendo o que digitou par maisucolo


        }

    }
}
