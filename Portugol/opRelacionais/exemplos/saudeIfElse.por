programa {
  funcao inicio() 
  {
    cadeia nome //var para texto
    inteiro idade //var para numero inteiro

    escreva ("Digite o seu nome: ")
    leia(nome) //pengando indo do usuario e armazenando na var
    escreva ("Digite a sua idade em anos: ")
    leia(idade)

    se (idade >0 e idade <= 10)
      escreva ("A mensalidade do Plano e R$ 100.00")
    senao se (idade <= 29)
      escreva ("A mensalidade do plano e R$ 200.00")
    senao se (idade <= 45)
      escreva ("A mensalidade do plano e R$ 300.00")
    senao se (idade <= 59)
      escreva ("A mensalidade do plano e R$ 500.00")
    senao se (idade <= 65)
      escreva ("A mensalidade do plano e R$ 600.00")
    senao 
      escreva ("A Mensalidade do plano e R$ 1000.00")

    
  }
}
