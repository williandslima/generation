programa {
	funcao inicio() {
		
		inteiro start, end
		// faca enquanto usando para validar
        faca{
            escreva ("Digite o valor inicial: ")
            leia(start)
            
            escreva("Digite o valor final: ")
            leia(end)
            
        } enquanto(start > end)
        
        
        se (start % 2 == 1)
                start += 1
        
        // 
        para (start; start <= end; start += 2) {
        escreva ("\n", start)
        }
	
		
		
	}
}
