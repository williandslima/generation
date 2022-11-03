package contaBancaria;

import contaBancaria.model.conta;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conta conta1 = new conta( 1 , 123 ,1 ,"Willian Lima", 1000.0f );
       
		conta1.sacar(10.0f);
        
		conta1.visualizar();
        
       

	}

}
