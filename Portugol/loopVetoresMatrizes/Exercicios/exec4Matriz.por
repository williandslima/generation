programa
{
	
	funcao inicio()
	{
		inteiro m[3][3], tamanhoI, tamanhoJ
		
		tamanhoI = 3
		tamanhoJ = 3
		
		para(inteiro indiceI=0; indiceI < tamanhoI; indiceI++){

			para(inteiro indiceJ=0; indiceJ < tamanhoJ; indiceJ++){
			
				escreva("Digite um valor para a entrada na posicao [", indiceI, "][", indiceJ, "]: ")
				leia(m[indiceI][indiceJ])
			    
			}
			
		}
		
	    escreva("Os elementos da Diagonol principal é: ", m[0][0], m[1][1], m[2][2], "\n ")
	  
	    escreva("Os elementos da Diagonol Secundária é: ", m[0][2], m[1][1], m[2][0], "\n ")
	    

		
		
	}
}
