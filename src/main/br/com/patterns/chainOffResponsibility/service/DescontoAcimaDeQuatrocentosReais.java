package main.br.com.patterns.chainOffResponsibility.service;

import main.br.com.patterns.chainOffResponsibility.domain.Orcamento;

/**
 * Created by odilon on 04/04/16.
 */
public class DescontoAcimaDeQuatrocentosReais implements Desconto {

    private Desconto desconto;

    @Override
    public double calcular(Orcamento orcamento) {
        if (orcamento.getValor() > 400) {
            return orcamento.getValor() * 0.01;
        } else {
            return desconto.calcular(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.desconto = desconto;
    }
}
