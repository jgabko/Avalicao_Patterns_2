package questao2;

public class Main {
    public static void main(String[] args) {
        Tiquete tiquete = new Tiquete("ABC1D23", 61, new Rotativo());
        System.out.println("Placa: " + tiquete.getPlaca() + " | " + tiquete.getMinutos() + " minutos");

        System.out.printf("rotativo: R$ %.2f%n", tiquete.calcularValor());
        tiquete.setPerfil(new Mensalista());
        System.out.printf("Mensalista: R$ %.2f%n", tiquete.calcularValor());
        tiquete.setPerfil(new Conveniado());
        System.out.printf("conveniado: R$ %.2f%n", tiquete.calcularValor());
    }
}
