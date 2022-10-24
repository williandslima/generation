programa {
	funcao inicio() {
	    
	    // Calculando salario Liquido
	    
	    real salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido
	    
	    //leia salarioBruno
	    escreva ("Bem vindo ao cálculo de Salário Liquido\n")
    	escreva ("Qual o Salário Bruto? \n")
        leia (salarioBruto)
        
	    //leia adicionalNoturno
	    escreva ("Qual o adicional Noturno ? \n")
        leia (adicionalNoturno)
        
	    //leia horas extras
	    escreva ("Quanto de Horas extras? \n")
        leia (horasExtras)
        
	    //leia descontros de um colaborador
	    escreva ("Quanto de Desconto? \n")
        leia (descontos)
        
        
        salarioLiquido = (salarioBruto + adicionalNoturno +(horasExtras * 5) - descontos )
	    
	    //exibe salario liquido
	    escreva ("O Salario liquido será : ", salarioLiquido)
		
		
		
	}
}
