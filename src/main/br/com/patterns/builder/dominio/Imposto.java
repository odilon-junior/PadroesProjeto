package main.br.com.patterns.builder.dominio;

/**
 * Created by odilon on 09/04/16.
 */
public class Imposto {

    private String nome;
    private double valor;

    public Imposto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
