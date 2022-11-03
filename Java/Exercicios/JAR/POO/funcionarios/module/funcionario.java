package funcionarios.module;

public class funcionario {

	private String nome;
	private int CPF;
	private int registro;
	private String cargo;
	private int salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public funcionario(String nome, int cPF, int registro, String cargo, int salario) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.registro = registro;
		this.cargo = cargo;
		this.salario = salario;
	}

	public void visualizar() {
		System.out.println("\n *********************");
		System.out.println("\n Funcionario ");
		System.out.println("\n *********************");
		System.out.println("\n Nome do Funcionarios " + this.nome);
		System.out.println("\n CPF funcionario " + this.CPF);
		System.out.println("\n Cargo " + this.cargo);
		System.out.println("\n Registro do Funcionarios  " + this.registro);
		System.out.println("\n Salario " + this.salario);

	}

}
