package ingresso.module;

public class ingressoVIP extends ingresso{

	private String openBar;
	private float valorFull;
	
	public ingressoVIP(String evento, int data, int lote, int valor, int qrCodeValidator, String openBar, float valorFull) {
		super(evento, data, lote, valor, qrCodeValidator);
		this.openBar = openBar;
		this.valorFull = valorFull;
		// TODO Auto-generated constructor stub
	}

	public String getOpenBar() {
		return openBar;
	}

	public void setOpenBar(String openBar) {
		this.openBar = openBar;
	}

	public float getValorFull() {
		return valorFull;
	}

	public void setValorFull(float valorFull) {
		this.valorFull = valorFull;
	}
	
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Valor open Bar " + this.openBar);
		System.out.println("Valor VIP " + this.valorFull);
		
	}
	 


}
