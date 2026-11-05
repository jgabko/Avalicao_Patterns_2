package questao2;

public class Mensalista implements PerfilCobranca {
    private static final double VALOR_FIXO = 25.00;

    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }
}
