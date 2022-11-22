package com.example.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indicou que a classe e controladora do tipo rest
@RequestMapping("/")  //endereco que definimos

public class hello_worldController {

	@GetMapping
	public String hello () {
		return " <h1> Hello World </h1> ";
	}

	
	@GetMapping("/bsm")
	public String bsm () {
		return " <hr> PT - BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades\n </hr>"
				+ "<hr> PT - BSM-GM - Mentalidade de Crescimento\n </hr>"
				+ "<hr> PT - BSM-P - Persistência\n </hr>"
				+ " <hr> PT - BSM-PR - Responsabilidade Pessoal"
				+ " <hr> PT - BSM-FO - Orientação ao Futuro\n"
				+ " <hr> PT - BSM-C - Comunicação\n"
				+ " <hr> PT - BSM-OD - Orientação ao Detalhe\n"
				+ " <hr> PT - BSM-PA - Proatividade\n"
				+ " <hr>PT - C-GG - Dar e Receber\n"
				+ " <hr>PT - SA-CS1 - Estudo de Caso 1: Força de Trabalho Distribuída\n"
				+ " <hr>PT - SA-CS2 - Estudo de Caso 2: Entregável Urgente\n"
				+ " <hr>PT - SA-CS3 - Estudo de Caso 3: Novas Habilidades Necessárias\n"
				+ " <hr>PT - SA-CS4 - Estudo de Caso 4: Aprender e Compartilhar\n"
				+ " <hr>PT- SA-CS5 - Estudo de Caso 5: Resolução Estratégica de Problemas\n"
				+ " <hr>PT - SSM-TM - Gestão do Tempo\n"
				+ " <hr>PT - SSM-RLW - Maximizar a Aprendizagem Online e o Trabalho Remoto\n"
				+ "";
	}

	@GetMapping("/objetivos")
	public String objetivos () {
		return "Objetivos de concluir JAVA, e se aprofundar em programacao android";
	}
	
	
}
