package funcionario;

import funcionario.module.funcionario;

public class testaFuncionario {
    public static void main(String[] args) {

        funcionario funcionario = new funcionario("Willian Lima ", 386123, 444, "Dev Junior", 100);
        funcionario.visualizar();
        funcionario.setNome("Ricardo Lima");
        funcionario.setCPF(123456);
        funcionario.setRegistro(2);
        funcionario.setSalario(1000);

        funcionario.visualizar();


    }
}
