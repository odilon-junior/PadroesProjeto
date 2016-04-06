package main.br.com.patterns.state;

/**
 * Created by odilon on 06/04/16.
 */
public class Finalizado implements EstadoOrcamento {
    @Override
    public double calcula(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento esta em estado inconsistente");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento esta em estado inconsistente");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento esta em estado inconsistente");
    }
}
