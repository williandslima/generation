package ingresso;

import ingresso.module.ingresso;
import ingresso.module.ingressoMeia;

public class testaIngresso {

	public static void main(String[] args) {

		ingressoMeia ingresso = new ingressoMeia("RHCP", 15, 2, 499, 99922221, 100);
		ingresso.visualizar();
		ingresso.setDesconto(100);

		/*
		 * ingresso.setEvento("SOAD"); ingresso.setData(21); ingresso.setValor(500);
		 * ingresso.visualizar();
		 */
		// TODO Auto-generated method stub

	}

}
