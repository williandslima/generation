package cliente;

import cliente.module.cliente;

public class testaCliente {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        cliente cliente = new cliente(1, "Willian Lima ", 386123, 444, 100);
        cliente.visualizar();
        cliente.setNome("Ricardo Lima");
        cliente.setCodigo(2);

        cliente.visualizar();

    }

}
