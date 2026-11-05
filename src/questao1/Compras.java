package questao1;

public class Compras extends ObservadorEstoque {
    public Compras(Produto produto) {
        super(produto);
        produto.adicionarObservador(this);
    }

    @Override
    public void update() {
        if (produto.getQuantidade() < 5) {
            System.out.println("Compras: estoque baixo de " + produto.getNome()
                    + " (" + produto.getQuantidade() + " unidades).");
        }
    }
}
