package escola.module;

public class Diretor extends Pessoa{

    private String Categoria;


    public Diretor(int matricula, String nome, String Categoria) {
        super(matricula, nome);
        this.Categoria = Categoria;
        // TODO Auto-generated constructor stub
    }
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
    public void visualizar() {
        super.visualizar();
        System.out.println("\n Diretor da Modalidade " + this.Categoria);

    }
}