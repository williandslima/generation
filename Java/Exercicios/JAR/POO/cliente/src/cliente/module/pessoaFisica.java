package cliente.module;
// 
public class pessoaFisica extends cliente{

	private int CPF;
	public pessoaFisica(int codigo, String nome, int pedido, int desconto, int CPF) {
		super(codigo, nome, pedido, desconto);
		this.CPF = CPF;
		
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF DO CLIENTE " + this.CPF);
	}
	 

}
