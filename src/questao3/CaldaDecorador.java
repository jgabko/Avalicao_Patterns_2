package questao3;

public class CaldaDecorador extends CondimentDecorator {
    public CaldaDecorador(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Calda";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 1.25;
    }
}
