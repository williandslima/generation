programa {
  funcao inicio() {
    inteiro numero, numeroX

    escreva("Digite um numero inteiro entre 1 e 10: ")
    leia(numero)
    
    se( numero <= 10)
		{
            numeroX = 1

            enquanto(numeroX <= 10){
              escreva("\n",numero," x ", numeroX, " = ", (numero * numeroX))
              numeroX ++
    
		}
		senao
		{
      escreva("Digite um numero inteiro entre 1 e 10")
		}
  
    
    
    
    }
    
  }
}
