package main.br.com.patterns.strategy.domain;

/**
 * Created by odilon on 04/04/16.
 */
public class NFe {

    private double valor;
    private ImpostoEnum imposto;

    public NFe(double valor, ImpostoEnum imposto) {
        this.imposto = imposto;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public double calcularImposto() {
        return this.imposto.getImposto().calcular(this);
    }
}
