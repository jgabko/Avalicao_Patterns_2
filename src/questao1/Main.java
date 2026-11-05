package questao1;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado RGB ULTRA", 8);
        Compras compras = new Compras(produto);
        Vendas vendas = new Vendas(produto);
        Auditoria auditoria = new Auditoria(produto);

        System.out.println("de 8 para 4:");
        produto.setQuantidade(4);
        System.out.println(" continua 4:");
        produto.setQuantidade(4);
        System.out.println(" de 4 para 0:");
        produto.setQuantidade(0);
        System.out.println(" de 0 para 3:");
        produto.setQuantidade(3);

        produto.removerObservador(compras);
        System.out.println("de 3 para 2 dps de remover compra");
        produto.setQuantidade(2);
        produto.setQuantidade(0);
        produto.removerObservador(vendas);
        System.out.println(" de 0 a 4 dps de tirar vendas");
        produto.setQuantidade(4);
        System.out.println("Registros: " + auditoria.totalRegistros());
    }
}

