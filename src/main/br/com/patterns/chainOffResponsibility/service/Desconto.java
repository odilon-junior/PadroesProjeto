package main.br.com.patterns.chainOffResponsibility.service;

import main.br.com.patterns.chainOffResponsibility.domain.Orcamento;

/**
 * Created by odilon on 04/04/16.
 */
public interface Desconto {

    double calcular(Orcamento orcamento);
    void setProximo(Desconto desconto);
}
