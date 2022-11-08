package contaBancaria.model;

import contaBancaria.model.conta;

public interface Repository {


    // procurar por numero
    public void procurarPorNumero (int numero);
    public void listarTodas (); // motrar todas contas
    public void cadastrar (conta conta);
    public void atualizar (conta conta);
    public void deletar (int numero);

    public void sacar (int numero, float valor);
    public void depositar (int numero, float valor);
    public void transferir (int numeroOrigem, int numeroDestino, float valor);


}
