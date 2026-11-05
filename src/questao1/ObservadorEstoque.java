package questao1;

public abstract class ObservadorEstoque {
    protected final Produto produto;

    protected ObservadorEstoque(Produto produto) {
        this.produto = produto;
    }

    public abstract void update();
}
