programa {
  funcao inicio() 
  {
  
  //inicio
  inteiro numero, resultado
  escreva ("--- Verificaçåo de numeros --- \n")
  
  // verificar se e par ou impar, e verificar ser e positivo
  escreva ("Digite o numero para verificaçåo: \n")
  leia(numero)

  resultado = numero % 2
		
		se (resultado == 0)
		    escreva("Numero par e positivo") //ok
    
		senao se (resultado < 0)
		    escreva("Numero impar e negativo")
    senao
		    escreva("Numero impar")
    
  
  }
}
