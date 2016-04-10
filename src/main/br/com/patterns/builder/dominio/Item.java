package main.br.com.patterns.builder.dominio;

/**
 * Created by odilon on 10/04/16.
 */
public class Item {
    private String nome;
    private double valor;
    private double quantidade;

    public Item(String nome, double valor, double quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
