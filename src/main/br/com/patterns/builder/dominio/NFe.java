package main.br.com.patterns.builder.dominio;

import java.util.Calendar;
import java.util.List;

/**
 * Created by odilon on 09/04/16.
 */
public class NFe {

    private String nomeCliente;
    private Imposto imposto;
    private List<Item> itens;
    private String emissor;
    private Calendar dataEmissao;

    public NFe(String nomeCliente, Imposto imposto, List<Item> itens, String emissor, Calendar dataEmissao) {
        this.nomeCliente = nomeCliente;
        this.imposto = imposto;
        this.itens = itens;
        this.emissor = emissor;
        this.dataEmissao = dataEmissao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public List<Item> getItens() {
        return itens;
    }

    public String getEmissor() {
        return emissor;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }
}
