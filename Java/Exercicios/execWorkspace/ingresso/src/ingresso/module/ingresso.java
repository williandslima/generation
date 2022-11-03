package ingresso.module;

public class ingresso {

	private String evento;
	private int data;
	private int lote;
	private int valor;
	private int qrCodeValidator;

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getQrCodeValidator() {
		return qrCodeValidator;
	}

	public void setQrCodeValidator(int qrCodeValidator) {
		this.qrCodeValidator = qrCodeValidator;
	}

	public ingresso(String evento, int data, int lote, int valor, int qrCodeValidator) {
		super();
		this.evento = evento;
		this.data = data;
		this.lote = lote;
		this.valor = valor;
		this.qrCodeValidator = qrCodeValidator;
	}

	public void visualizar() {
		System.out.println("\n *********************");
		System.out.println("\n INGRESSO ");
		System.out.println("\n *********************");
		System.out.println("\n Nome do Evento " + this.evento);
		System.out.println("\n Data do evento " + this.data + "de Dezembro");
		System.out.println("\n Lote " + this.lote);
		System.out.println("\n Valor pago " + this.valor);
		System.out.println("\n QRCODE " + this.qrCodeValidator);

	}

}
