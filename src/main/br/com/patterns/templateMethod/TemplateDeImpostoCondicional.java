package main.br.com.patterns.templateMethod;

/**
 * Created by odilon on 04/04/16.
 */
public abstract class TemplateDeImpostoCondicional {

    public double calcula(Orcamento orcamento) {

        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract double minimaTaxacao(Orcamento orcamento);
}
