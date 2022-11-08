package lsita;

import java.util.ArrayList;
import java.util.Scanner;

public class listaa {

	public static Scanner leia = new Scanner(System.in);

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// transformar o primitivo em objeto

		// criando uma colection tipo de dado
		ArrayList<Double> notas = new ArrayList<Double>();
		// coleciton aray list que armazena tipo double chamado notas

		Double d = Double.valueOf(9);
		double numero = 0.0;

		notas.add(7.0);
		notas.add(5.0);
		notas.add(3.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(d);

		System.out.println("Digite a nota ");
		numero = leia.nextDouble();
		notas.add(numero);

		System.out.println("Digite a nota ");
		numero = leia.nextDouble();
		notas.add(numero);

		// collection toda
		System.out.println("Dados da Collection Notas: " + notas.toString());

		// qual a posicao da nota 4.0 (indice
		System.out.println("Qual a posicao " + notas.indexOf(4.0));

		// Existe tal iten?
		System.out.println("Existe ? " + notas.contains(4.0));
		
		// Lista VAzia?
		System.out.println("Lista vazia? ? " + notas.isEmpty());

		// Remover tal iten?
		notas.remove(7.0);

		// impressao uma em baixo da outra/ var define o dado de forma implicita.
		// var consegue identificar que,
		for (var nota : notas) {
			System.out.println(nota); // loop de criar nota1, nota2, nota3 ...... (no array notas)
		}
		//for each simplificando
		notas.forEach(System.out::println);
		
		
		/*for (int i=0; i < notas.size(); i++){
			System.out.println(notas.get(i));

		}*/

		
	}
}
