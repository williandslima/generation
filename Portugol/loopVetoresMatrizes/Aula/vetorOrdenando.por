programa {
	funcao inicio() 
	{
		
	    inteiro vetor[5] = {5, 3, 2, 4, 1}, tamanho = 5, copia
	    //lendo a posicao inicial
	    
	    para (inteiro i=0; i < tamanho -1; i++ ){
	        para (inteiro j=0; j < tamanho -1 -i; j++ ){
	            se(vetor[j] > vetor [j+1]){
	                copia = vetor[j]
	                vetor[j] = vetor[j+1]
	                vetor[j+1] = copia
	            }
	        }
	    }
	   para (inteiro i=0; i < tamanho; i++ ){
	       escreva ("\n", i, " numero: ", vetor[i], "\n")
	   }
	   //lendo a proxima
		
		
	}
}
