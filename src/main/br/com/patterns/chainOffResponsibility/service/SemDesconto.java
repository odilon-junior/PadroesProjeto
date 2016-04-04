package main.br.com.patterns.chainOffResponsibility.service;

import main.br.com.patterns.chainOffResponsibility.domain.Orcamento;

/**
 * Created by odilon on 04/04/16.
 */
public class SemDesconto implements Desconto {
    @Override
    public double calcular(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto desconto) {

    }
}
