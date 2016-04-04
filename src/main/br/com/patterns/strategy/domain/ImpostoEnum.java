package main.br.com.patterns.strategy.domain;

import main.br.com.patterns.strategy.service.ICMS;
import main.br.com.patterns.strategy.service.IImposto;
import main.br.com.patterns.strategy.service.ISS;

/**
 * Created by odilon on 04/04/16.
 */
public enum ImpostoEnum {
    ISS(new ISS()),
    ICMS(new ICMS());

    private final IImposto imposto;

    ImpostoEnum(IImposto imposto) {
        this.imposto = imposto;
    }

    public IImposto getImposto() {
        return imposto;
    }
}
