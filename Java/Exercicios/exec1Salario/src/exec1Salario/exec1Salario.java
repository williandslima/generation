package exec1Salario;

import java.util.Scanner;

public class exec1Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//criando "methodos"
				Scanner leia = new Scanner(System.in);
				
				
				//criando variaveis
				float salario, abono, nSalario;
				
				
				//digite o salario
				System.out.println("Vamos calcular o Abono \n");
				System.out.println("Digite o Salario: \n");
				
				//leia o salario
				salario = leia.nextFloat();
				
				//digite o abono
				System.out.println("Digite o Abono: ");
				
				//leia o abono
				abono = leia.nextFloat();
				
				
				//novo salario = salario + abono
				nSalario = (salario + abono);
				
				// exibe novo salario
				
				System.out.println("\n O Novo salario e : " + nSalario);
		
		
	}

}
