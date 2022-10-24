programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		
		
    real numero1, numero2 //resultado

    escreva ("Digite o primeiro numero: ")
    leia(numero1)
  
    escreva ("Digite o segundo numero: ")
    leia(numero2)

    escreva("\n", numero1, " + ", numero2, " = ", numero1 + numero2 )
    escreva("\n", numero1, " - ", numero2, " = ", numero1 - numero2 )
    escreva("\n", numero1, " * ", numero2, " = ", numero1 * numero2 )
    escreva("\n", numero1, " / ", numero2, " = ", numero1 / numero2 )

    escreva("\n", numero1, " Potencia ", numero2, " = ", Matematica.potencia(numero1,numero2))
    escreva("\n", numero1, " Raiz ", numero2, " = ", Matematica.raiz(numero1, 2.0 ))


      }
}

