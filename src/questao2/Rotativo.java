package questao2;

public class Rotativo implements PerfilCobranca {
    private static final double VALOR_POR_HORA = 8.00;

    @Override
    public double calcular(int minutos) {
        return (minutos / 60.0) * VALOR_POR_HORA;
    }
}
