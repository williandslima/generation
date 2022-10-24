programa {
  funcao inicio() {
  
    inteiro idade //var para numero inteiro

    escreva ("Ola qual sua idade? ")
    leia(idade)

    se (idade >=16 e idade < 18)
      escreva ("Pessoa Apta a votar e o voto e facultativo")
    senao se (idade >= 18 e idade < 65)
      escreva ("Pessoa Apta a votar e o voto é obrigatorio")
    senao se (idade >= 65)
      escreva ("Pessoa Apta a votar e o voto e facultativo")
    senao 
      escreva ("Nao esta apta a votar")
  }
}