package funcionarios.module;

public class funcVendedor extends funcionario {

	private int comissao;
	private String cargo;
	
	public funcVendedor(String nome, int cPF, int registro, int salario, int comissao, String cargo) {
		super(nome, cPF, registro, salario);
		this.comissao = comissao;
		this.cargo = cargo;
		// TODO Auto-generated constructor stub
	}	
	

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Cargo do funcionario " + this.cargo);
		System.out.println("Comissao de " + this.comissao);
		
	}
	
	
}
