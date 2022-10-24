programa {
  funcao inicio() {
cadeia tipoAnimal, caracAnimal, alimentoAnimal, totalTexto



escreva ("Digite um tipo de animal: --- | Vertebrado ou Invertebrado | --- \n")
leia(tipoAnimal)
escreva ("Digite um tipo de animal entre : --- | Ave, Mamifero, Inseto ou Anelideo | ---- \n")
leia(caracAnimal)
escreva ("Digite o tipo de alimentacao do animao entre: --- | Carnivoro, Onivoro, Herbivoro, Hematofago | --- \n")
leia(alimentoAnimal)

		se (tipoAnimal == "Vertebrado" e caracAnimal == "Ave" e alimentoAnimal == "Carnivoro")
		    escreva("Aguia") 
    
		senao se (tipoAnimal == "Vertebrado" e caracAnimal == "Ave" e alimentoAnimal == "Onivoro")
		    escreva("Pomba") 
		senao se (tipoAnimal == "Vertebrado" e caracAnimal == "Mamifero" e alimentoAnimal == "Onivoro")
		    escreva("Homem") 
		senao se (tipoAnimal == "Vertebrado" e caracAnimal == "Mamifero" e alimentoAnimal == "Herbivoro")
		    escreva("Vaca") 

		senao se (tipoAnimal == "Invertebrado" e caracAnimal == "Inseto" e alimentoAnimal == "Hematofago")
		    escreva("Pulga") 
		senao se (tipoAnimal == "Invertebrado" e caracAnimal == "Inseto" e alimentoAnimal == "Herbivoro")
		    escreva("Largata") 
		senao se (tipoAnimal == "Invertebrado" e caracAnimal == "Anelideo" e alimentoAnimal == "Hematofago")
		    escreva("Sanguessuga") 
		senao se (tipoAnimal == "Invertebrado" e caracAnimal == "Anelideo" e alimentoAnimal == "Onivoro")
		    escreva("Minhoca") 
    
    
    senao
		    escreva("Verifique a maneira digitada")
        
    




  }
}
