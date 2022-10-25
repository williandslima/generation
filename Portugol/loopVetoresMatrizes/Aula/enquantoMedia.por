programa {
    inclua biblioteca Texto --> t
    
	funcao inicio() {
		
		inteiro idade, contador = 0 //contador sera usado para media
		real media = 0.0, soma = 0.0
		cadeia continua = "S"
		
		enquanto (t.caixa_alta(continua) == "S") {
		    
		    escreva ("\n Difite a idade: ")
		    leia(idade)
		    
		    soma += idade
		    contador ++
		    
		    escreva ("\n Deseja contuniar (S/N)?  ")
		    leia(continua)
		    
	}
		
	media = soma /contador
	escreva ("\n Média das idades é: ", media)
		
		
	}
}
