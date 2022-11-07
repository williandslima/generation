package exception;

class exceptionSimples extends Exception {

	private static final long serialVersionUID = 1L;

	public exceptionSimples() {
	}

	public exceptionSimples(String mensagem) {
		super(mensagem);
	}
}