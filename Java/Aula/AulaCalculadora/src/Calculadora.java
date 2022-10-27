import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//receber coisas do console system.in
		//system.in 
		
		Scanner leia = new Scanner(System.in); // classe para pegar informacoes criamos objeto
		
		// formatando as casas decimais
		DecimalFormat df = new DecimalFormat ("###.##");	
		
		//criando variavel
		int numero1, numero2;
		
		// receber os dados via teclado, numero inteiro
		System.out.println("\n Digite o numero primeiro numero");
		numero1 = leia.nextInt();
		System.out.println("\n Digite o numero segundo numero");
		numero2 = leia.nextInt();
		
		System.out.println("\n " + numero1 + "+" + numero2 + " = " + (numero1 + numero2) );
		System.out.println("\n " + numero1 + "-" + numero2 + " = " + (numero1 - numero2) );
		System.out.println("\n " + numero1 + "/" + numero2 + " = " + (numero1 / numero2) );
		System.out.println("\n " + numero1 + "*" + numero2 + " = " + (numero1 * numero2) );
		
		// potencia
		System.out.println("\n " + numero1 + "^" + numero2 + " = " + Math.pow(numero1, numero2));
		//raiz quadrada
		System.out.println("\n Raiz quadrada de " + numero1 + " = " + df.format(Math.sqrt(numero1)));
		
		

	}

}
