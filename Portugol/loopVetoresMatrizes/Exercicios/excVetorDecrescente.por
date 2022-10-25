programa {
	funcao inicio() 
	{
		
	    inteiro vetor[10] = {5, 3, 2, 4, 1, 6, 9, 8, 10, 7}// definindo vetor
	    inteiro i, j, tamanho = 10, copia // definindo variaves que vou usar
	    
	    para ( i = 0; i < tamanho -1; i++ ){ //enquanto i for menor que -1 incrementar ++ 1 
	        para ( j=0; j < tamanho -1 -i; j++ ){ // ou seja vai incrementar 10 numeros por que o tamanho foi definido 
	            se(vetor[j] < vetor [j+1]){ // se o vetor"numeroJ" for menor que Numeroj+1 faca o seguinte
	                copia = vetor[j] // armazena em copia o vetor [numero J]
	                vetor[j] = vetor[j+1] // incrementa o vetor numero 
	                vetor[j+1] = copia
	            }
	        }
	    }
	   para ( i=0; i < tamanho; i++ ){
	       escreva ("\n", i, " numero: ", vetor[i], "\n")
	   }
	   //lendo a proxima
		
		
	}
}
