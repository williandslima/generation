package cliente.module;

public class cliente {

    // atributos (Variavels
    private int codigo;
    private String nome;
    private int CPF;
    private int pedido;

    public cliente(int codigo, String nome, int cPF, int pedido, int desconto) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        CPF = cPF;
        this.pedido = pedido;
        this.desconto = desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    private int desconto;

    public void visualizar() {
        System.out.println("\n *********************");
        System.out.println("\n Desconto do cliente ");
        System.out.println("\n *********************");
        System.out.println("\n Codigo do Cliente " + this.codigo);
        System.out.println("\n CPF Cliente " + this.CPF);
        System.out.println("\n Nome do Cliente " + this.nome);
        System.out.println("\n Desconto  " + this.desconto);
        System.out.println("\n Pedido" + this.pedido);

    }
}
