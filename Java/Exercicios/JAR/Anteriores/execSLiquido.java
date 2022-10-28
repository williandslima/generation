package exec3SLiquido;

import java.util.Scanner;

public class execSLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// criando "methodos" para ler o que usuario escreve
		Scanner leia = new Scanner(System.in);

		// Variaveis

		float sBruto, adiNoturno, hExtras, descontos, sLiquido;

		// Digite e leia

		System.out.println("Vamos calcular seu Salario Liquido: ");
		System.out.println("Digite o Salario bruto: "); // mensagem para digitar
		sBruto = leia.nextFloat(); // Armazenar o que usuario escreveu
		System.out.println("Digite o adicional Noturno: "); // mensagem para digitar
		adiNoturno = leia.nextFloat(); // Armazenar o que usuario escreveu
		System.out.println("Digite as Horas Extras: "); // mensagem para digitar
		hExtras = leia.nextFloat(); // Armazenar o que usuario escreveu
		System.out.println("Digite o Desconto: "); // mensagem para digitar
		descontos = leia.nextFloat(); // Armazenar o que usuario escreveu

		// calculo do salario liquido
		// Salario liquido = Salario bruto + adcionNoturo + (horasextras*5_ - descontos
		sLiquido = sBruto + adiNoturno + (hExtras * 5) - descontos;

		System.out.println("O Salario liquido é: " + sLiquido); // Exibe salario liquido
		
		

	}

}
