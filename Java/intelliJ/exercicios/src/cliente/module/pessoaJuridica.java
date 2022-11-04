package cliente.module;

public class pessoaJuridica extends cliente {

    private int CNPJ;

    public pessoaJuridica(int codigo, String nome, int pedido, int desconto, int CNPJ) {
        super(codigo, nome, pedido, desconto);
        this.CNPJ = CNPJ;
        // TODO Auto-generated constructor stub
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int cNPJ) {
        CNPJ = cNPJ;
    }


    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ DO CLIENTE " + this.CNPJ);

    }
}