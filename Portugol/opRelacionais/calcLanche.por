programa {
  funcao inicio() 
  { 
    
    cadeia produto
    inteiro codProduto, quantProduto
    real valorTotal

//Listagem
    escreva ("Cod | Nome do Produto \n" )
    escreva ("1 - | Cachorro-quente \n")
    escreva ("2 - | X-Salada \n")
    escreva ("3 - | X-Bacon \n")
    escreva ("4 - | Bauru \n")
    escreva ("5 - | Refrigerante \n")
    escreva ("6 - | Suco de Laranja \n")

//---Mostre na tela o valor total da conta e nome do produto que foi comprado
escreva ("Digite o codigo do produto comprado: ")
leia (codProduto)
escreva ("Digite a quantidade do produto comprado: ")
leia (quantProduto)

escolha codProduto {
        caso 1:
           valorTotal = quantProduto * 10
           escreva("A compra realizada foi Cachorro-quente com o valor total de R$ ", valorTotal)
        pare
        caso 2:
           valorTotal = quantProduto * 15
           escreva("A compra realizada foi X-Salada com o valor total de R$ ", valorTotal)
        pare
        caso 3:
           valorTotal = quantProduto * 18
           escreva("A compra realizada foi X-Bacon com o valor total de R$ ", valorTotal)
        pare
        caso 4:
           valorTotal = quantProduto * 12
           escreva("A compra realizada foi Bauro com o valor total de R$ ", valorTotal)
        pare
        caso 5:
           valorTotal = quantProduto * 8
           escreva("A compra realizada foi Refrigerante com o valor total de R$ ", valorTotal)
        pare
        caso 6:
           valorTotal = quantProduto * 13
           escreva("A compra realizada foi Suco de Laranja com o valor total de R$ ", valorTotal)
        pare

        caso contrario:
              escreva("Opcao invalida")
        }



  }
}
