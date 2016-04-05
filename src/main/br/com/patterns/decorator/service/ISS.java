package main.br.com.patterns.decorator.service;

import main.br.com.patterns.decorator.domain.Orcamento;

/**
 * Created by odilon on 05/04/16.
 */
public class ISS extends Imposto {

    public ISS() {
        super();
    }

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
    }
}
