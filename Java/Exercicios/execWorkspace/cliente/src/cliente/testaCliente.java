package cliente;

import cliente.module.cliente;
import cliente.module.pessoaFisica;
import cliente.module.pessoaJuridica;

public class testaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pessoaFisica cliente = new pessoaFisica(1, " Willian Lima ", 01 , 5, 1233333333);
		cliente.visualizar();
		cliente.setCPF(555555555);
		cliente.setNome("Ricardo da Silva");
		cliente.visualizar();
		
		
		pessoaJuridica cliente2 = new pessoaJuridica(2, " Augusto Lima ", 01 , 10, 999999999);
		cliente2.visualizar();
		cliente2.setDesconto(9);
		cliente2.setNome("Maria Emilia");
		cliente2.visualizar();
		
		
		
		
		
		
		
	}

}
