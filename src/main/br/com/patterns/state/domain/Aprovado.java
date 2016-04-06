package main.br.com.patterns.state.domain;

import main.br.com.patterns.state.service.EstadoOrcamento;

/**
 * Created by odilon on 06/04/16.
 */
public class Aprovado implements EstadoOrcamento {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
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
        orcamento.estadoOrcamento = new Finalizado();
    }
}
