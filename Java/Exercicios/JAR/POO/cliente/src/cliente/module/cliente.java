package cliente.module;

public class cliente {

	// atributos (Variavels
	private int codigo;
	private String nome;
	private int pedido;

	public cliente(int codigo, String nome, int pedido, int desconto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.pedido = pedido;
		this.desconto = desconto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	private int desconto;

	public void visualizar() {
		System.out.println("********************* ");
		System.out.println("Desconto do cliente ");
		System.out.println("********************* ");
		System.out.println("Codigo do Cliente " + this.codigo);
		System.out.println("Nome do Cliente " + this.nome);
		System.out.println("Desconto de  " + this.desconto + "%");
		System.out.println("Pedido " + this.pedido);

	}
}
