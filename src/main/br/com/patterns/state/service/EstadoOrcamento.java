package main.br.com.patterns.state.service;

import main.br.com.patterns.state.domain.Orcamento;

/**
 * Created by odilon on 06/04/16.
 */
public interface EstadoOrcamento {

    double calcula(Orcamento orcamento);

    void aprova(Orcamento orcamento);

    void reprova(Orcamento orcamento);

    void finaliza(Orcamento orcamento);
}
