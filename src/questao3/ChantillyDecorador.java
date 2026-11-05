package questao3;

public class ChantillyDecorador extends CondimentDecorator {
    public ChantillyDecorador(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Chantilly";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 2.00;
    }
}
