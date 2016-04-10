package main.br.com.patterns.builder;

import main.br.com.patterns.builder.dominio.Imposto;
import main.br.com.patterns.builder.dominio.Item;
import main.br.com.patterns.builder.dominio.NFe;

import java.util.Calendar;
import java.util.List;

/**
 * Created by odilon on 10/04/16.
 */
public class NFeBuilder {

    private String nomeCliente;
    private Imposto imposto;
    private List<Item> itens;
    private String emissor;
    private Calendar dataEmissao;

    public static NFeBuilder build() {
        return new NFeBuilder();
    }

    public NFeBuilder() {
        this.dataEmissao = Calendar.getInstance();
    }

    public NFeBuilder comCliente(String nome) {
        this.nomeCliente = nome;
        return this;
    }

    public NFeBuilder comImposto(Imposto imposto) {
        this.imposto = imposto;
        return this;
    }

    public NFeBuilder comItens(List<Item> itens) {
        this.itens = itens;
        return this;
    }

    public NFeBuilder comEmissor(String emissor) {
        this.emissor = emissor;
        return this;
    }

    public NFe builder() {
        NFe nfe = new NFe(nomeCliente, imposto, itens, emissor, dataEmissao);
        return nfe;
    }


}
