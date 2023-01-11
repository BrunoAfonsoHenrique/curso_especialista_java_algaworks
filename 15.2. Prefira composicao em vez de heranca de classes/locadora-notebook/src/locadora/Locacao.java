package locadora;

public abstract class Locacao {

    private Notebook notebook;

    public Locacao(Notebook notebook) {
        this.notebook = notebook;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public abstract double calcularValorDevido(int horasUtilizadas);
}
