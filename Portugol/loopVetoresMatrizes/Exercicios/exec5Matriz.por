programa
{
	// sei que tem maneira mais correta de fazer, mais limpa.... mas tenho dificuldade em juntar estruturas, onde colocar
  // como colocar, qual usar. tipo... o se dentro do enquanto, o enquanto dentro do se. etcs

	funcao inicio()
	{
		real m[10][4], tamanhoI, tamanhoJ
		tamanhoI = 10
		tamanhoJ = 4
    real nAluno1,nAluno2,nAluno3,nAluno4,nAluno5,nAluno6,nAluno7,nAluno8,nAluno9,nAluno10,
		
    para(real indiceI=0; indiceI < tamanhoI; indiceI++){
      para(real indiceJ=0; indiceJ < tamanhoJ; indiceJ++){
		  	escreva("Digite um valor para a entrada na posicao [", indiceI, "][", indiceJ, "]: ")
				leia(m[indiceI][indiceJ])
			}
		}

	// escreva("Os elementos da Diagonol principal: ", m[0][0], m[1][1], m[2][2], "\n")
	// escreva("Os elementos da Diagonol Secundaria: ", m[0][2], m[1][1], m[2][0], "\n")
		
    escreva(nAluno1 = (m[0][0]+m[0][1]+m[0][2]+m[0][3]) /4, " | " )
		escreva(nAluno2 = (m[1][0]+m[1][1]+m[1][2]+m[1][3]) /4, " | " )
    escreva(nAluno3 = (m[2][0]+m[2][1]+m[2][2]+m[2][3]) /4, " | " )
    escreva(nAluno4 = (m[3][0]+m[3][1]+m[3][2]+m[3][3]) /4, " | " )
    escreva(nAluno5 = (m[4][0]+m[4][1]+m[4][2]+m[4][3]) /4, " | " )
    escreva(nAluno6 = (m[5][0]+m[5][1]+m[5][2]+m[5][3]) /4, " | " )
    escreva(nAluno7 = (m[6][0]+m[6][1]+m[6][2]+m[6][3]) /4, " | " )
    escreva(nAluno8 = (m[7][0]+m[7][1]+m[7][2]+m[7][3]) /4, " | " )
    escreva(nAluno9 = (m[8][0]+m[8][1]+m[8][2]+m[8][3]) /4, " | " )
    escreva(nAluno10 = (m[9][0]+m[9][1]+m[9][2]+m[9][3]) /4, " | " )
    

    
 
	}
}