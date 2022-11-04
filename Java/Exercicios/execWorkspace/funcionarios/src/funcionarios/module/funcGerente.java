package funcionarios.module;

public class funcGerente extends funcionario {

	private String cargo;
	
	public funcGerente(String nome, int cPF, int registro, int salario, String cargo) {
		super(nome, cPF, registro, salario);
		this.cargo = cargo;
		// TODO Auto-generated constructor stub
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public void visualizar() {
		super.visualizar();
		System.out.println("Cargo do funcionario " + this.cargo);
	}
	 

	
}
