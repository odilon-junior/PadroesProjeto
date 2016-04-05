package main.br.com.patterns.decorator.service;


import main.br.com.patterns.decorator.domain.Orcamento;

/**
 * Created by odilon on 05/04/16.
 */
public abstract class Imposto {
    private final Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {
        outroImposto = null;
    }

    protected double calculaOutroImposto(Orcamento orcamento) {
        if (outroImposto == null)
            return 0;
        return outroImposto.calcular(orcamento);
    }

    public abstract double calcular(Orcamento orcamento);
}
