package ingresso.module;

public class ingressoMeia extends ingresso{

	private int desconto;
	
	public ingressoMeia(String evento, int data, int lote, int valor, int qrCodeValidator, int desconto) {
		super(evento, data, lote, valor, qrCodeValidator);
		this.desconto = desconto;
		// TODO Auto-generated constructor stub
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	
	public void visualizar() {
		super.visualizar();
		int desconto = this.desconto;
		System.out.println("Ingresso meia entrada no Valor de  " +desconto);
	}

}
