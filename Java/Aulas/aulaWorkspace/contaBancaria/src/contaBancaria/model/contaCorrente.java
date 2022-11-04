package contaBancaria.model;

//criando relacao de heranca extends da conta
public class contaCorrente extends conta {

	private float limite;

	public contaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo); // metodo super busca os atributos na superclas conta

		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente");
			return false;
		}
		setSaldo(getSaldo() - valor);
		return true;

	}

	// sobrescrever metodos
	public void vizualizar() {
		super.visualizar();
		System.out.println("Limite de Credito " + this.limite);
	}

}
