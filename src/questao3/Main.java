package questao3;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        iBebida pedido1 = new Espresso();
        pedido1 = new LeiteDecorador(pedido1);
        pedido1 = new ChantillyDecorador(pedido1);
        imprimir(pedido1);

        iBebida pedido2 = new Cha();
        pedido2 = new CaldaDecorador(pedido2);
        imprimir(pedido2);

        iBebida pedido3 = new Espresso();
        pedido3 = new LeiteDecorador(pedido3);
        pedido3 = new LeiteDecorador(pedido3);
        pedido3 = new CaldaDecorador(pedido3);
        imprimir(pedido3);
    }

    private static void imprimir(iBebida pedido) {
        System.out.printf("%s: R$ %.2f%n", pedido.Descricao(), pedido.Preco());
    }
}
