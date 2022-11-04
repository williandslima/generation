package cliente;

import cliente.module.cliente;
import cliente.module.pessoaFisica;
import cliente.module.pessoaJuridica;

public class testaCliente {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        pessoaFisica cliente = new pessoaFisica(1, "Willian Lima ", 386123, 444, 99999);
        cliente.visualizar();
        cliente.setNome("Ricardo Lima");
        cliente.setCodigo(2);
        cliente.visualizar();

        pessoaJuridica cliente2 = new pessoaJuridica(1, "Willian Lima ", 386123, 444, 99999);
        cliente2.visualizar();
        cliente2.setNome("Ricardo Lima");
        cliente2.setCodigo(2);
        cliente2.visualizar();

    }

}
