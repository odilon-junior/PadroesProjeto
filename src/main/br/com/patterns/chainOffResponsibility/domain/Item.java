package main.br.com.patterns.chainOffResponsibility.domain;

/**
 * Created by odilon on 04/04/16.
 */
public class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
