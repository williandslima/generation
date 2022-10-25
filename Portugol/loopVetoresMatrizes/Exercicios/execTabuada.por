programa {
	funcao inicio() {
		inteiro i = 1, nDigitado, resultado
		
		escreva ("Vamos fazer um calculo: ")
		escreva ("Digite o numero: ")
		leia(nDigitado)
		
		enquanto(i <=10 ){
			
			resultado = (i * nDigitado)
			escreva( nDigitado, "x", i, " = ",  resultado, "\n")
			
			i++ // sempre
			}
	
		
	}
}
