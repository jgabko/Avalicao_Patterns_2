package questao1;

public class Vendas extends ObservadorEstoque {
    public Vendas(Produto produto) {
        super(produto);
        produto.adicionarObservador(this);
    }

    @Override
    public void update() {
        if (produto.getQuantidadeAnterior() == 0 && produto.getQuantidade() > 0) {
            System.out.println("Vendas: " + produto.getNome() + " voltou ao estoque ("
                    + produto.getQuantidade() + " unidades).");
        }
    }
}
