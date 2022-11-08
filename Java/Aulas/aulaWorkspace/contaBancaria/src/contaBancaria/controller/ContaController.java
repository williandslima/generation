package contaBancaria.controller;

import java.util.ArrayList;

import contaBancaria.model.conta;
import contaBancaria.repository.ContaRepository;

// interface obriga implementar

public class ContaController implements ContaRepository {

	// criar colection antes dos methodos

	private ArrayList<conta> listaContas = new ArrayList<conta>();

	// ---

	@Override // indica que esta sobrescrevend

	//// pesquisar por numero da conta S
	public void procurarPorNumero(int numero) {

		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("Conta nao encontrada");

	}

	public conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta;
		}

		return null;
	}

	/// ---------

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(conta conta) {

		// gerar numero automaticamente
		conta.setNumero(gerarNumero()); // criando numeros automaticmos

		// criar conta
		listaContas.add(conta);
		System.out.println("Conta foi criada!");

		// TODO Auto-generated method stub

	}

	public int gerarNumero() {
		// TODO Auto-generated method stub
		return listaContas.size() + 1; /// metodo vai retornar numero de lista etcs
	}

	@Override
	public void atualizar(conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {

		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("Conta apagada");

		} else
			System.out.println("Conta nao encontrada");

	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

}
