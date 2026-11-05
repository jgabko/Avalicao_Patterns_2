package questao2;

public class Conveniado implements PerfilCobranca {
    private static final int MINUTOS_GRATUITOS = 30;
    private static final double VALOR_POR_HORA = 8.00;
    private static final double porcent_desconto= 0.20;
    private static final double DESCONTO = 1 - porcent_desconto;

    @Override
    public double calcular(int minutos) {
        if (minutos <= MINUTOS_GRATUITOS) {
            return 0.0;
        }
        // A cobrança começa após os 30 minutos gratuitos.
        int minutosCobrados = minutos - MINUTOS_GRATUITOS;
        double horasIniciadas = (minutosCobrados / 60.0);
        return horasIniciadas * VALOR_POR_HORA *  DESCONTO;
    }
}
