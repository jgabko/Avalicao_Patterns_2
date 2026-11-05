package questao2;

public class Tiquete {
    private final String placa;
    private final int minutos;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutos, PerfilCobranca perfil) {
        if (minutos < 0) {
            throw new IllegalArgumentException(" não pode ser negativo.");
        }
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutos);
    }
}
