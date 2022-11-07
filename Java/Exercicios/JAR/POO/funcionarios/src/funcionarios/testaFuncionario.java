package funcionarios;

import funcionarios.module.funcGerente;
import funcionarios.module.funcionario;

public class testaFuncionario {

	public static void main(String[] args) {

		funcGerente funcGerente = new funcGerente("Willian Lima ", 386123, 444, 999, "Dev Junior");
		funcGerente.visualizar();
		funcGerente.setNome("Ricardo Lima");
		funcGerente.setCPF(123456);
		funcGerente.setRegistro(2);
		funcGerente.setSalario(1000);
		funcGerente.visualizar();

	}

}
