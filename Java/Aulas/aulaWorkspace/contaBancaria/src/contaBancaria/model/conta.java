package contaBancaria.model;

public class conta {

	// atributos (Variavels
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	public int getNumero() {
		return numero;
	}

	public conta(int numero, int agencia, int tipo, String titular, float saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta corrente";
			break;
		case 2:
			tipo = "Conta poupanca";
			break;
		}

		System.out.println("\n *********************");
		System.out.println("\n Dados da conta ");
		System.out.println("\n *********************");
		System.out.println("\n Numero da conta " + this.numero);
		System.out.println("\n Numero da Agencia " + this.agencia);
		System.out.println("\n Tipo  " + tipo);
		System.out.println("\n Titular " + this.titular);
		System.out.println("\n Saldo " + this.saldo);

	}

	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente");
			return false;
		}
		setSaldo(getSaldo() - valor);
		return true;

	}

}
