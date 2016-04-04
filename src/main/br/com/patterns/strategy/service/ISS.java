package main.br.com.patterns.strategy.service;

import main.br.com.patterns.strategy.domain.NFe;

/**
 * Created by odilon on 04/04/16.
 */
public class ISS implements IImposto {
    @Override
    public double calcular(NFe nfe) {
        return nfe.getValor() * 0.6;
    }
}
