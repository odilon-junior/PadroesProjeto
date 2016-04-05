package main.br.com.patterns.decorator.service;

import main.br.com.patterns.decorator.domain.Orcamento;

/**
 * Created by odilon on 05/04/16.
 */
public class ICMS extends Imposto {

    public ICMS() {
        super();
    }

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.01 + calculaOutroImposto(orcamento);
    }
}
