package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private int quantidadeAnterior;
    private final List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        }
        this.nome = nome;
        this.quantidade = quantidade;
        this.quantidadeAnterior = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getQuantidadeAnterior() {
        return quantidadeAnterior;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("não pode ser negativo.");
        }
        if (novaQuantidade == quantidade) {
            return;
        }
        quantidadeAnterior = quantidade;
        quantidade = novaQuantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorEstoque observador : observadores) {
            observador.update();
        }
    }
}
