package ingresso;

import ingresso.module.ingresso;

public class testaIngresso {

	public static void main(String[] args) {

		ingresso ingresso = new ingresso("RHCP", 15, 2, 499, 99922221);
		ingresso.visualizar();

		ingresso.setEvento("SOAD");
		ingresso.setData(21);
		ingresso.setValor(500);

		ingresso.visualizar();

		// TODO Auto-generated method stub

	}

}
