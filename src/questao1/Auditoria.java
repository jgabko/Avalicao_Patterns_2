package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria extends ObservadorEstoque {
    private final List<String> registros = new ArrayList<>();

    public Auditoria(Produto produto) {
        super(produto);
        produto.adicionarObservador(this);
    }

    @Override
    public void update() {
        String registro = produto.getNome() + ": " + produto.getQuantidadeAnterior()
                + " -> " + produto.getQuantidade() + " unidades";
        registros.add(registro);
        System.out.println("Auditoria: " + registro);
    }

    public int totalRegistros() {
        return registros.size();
    }
}
