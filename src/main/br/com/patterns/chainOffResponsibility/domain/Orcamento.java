package main.br.com.patterns.chainOffResponsibility.domain;

import main.br.com.patterns.chainOffResponsibility.service.Desconto;
import main.br.com.patterns.chainOffResponsibility.service.DescontoAcimaDeQuatrocentosReais;
import main.br.com.patterns.chainOffResponsibility.service.DescontoCincoItens;
import main.br.com.patterns.chainOffResponsibility.service.SemDesconto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by odilon on 04/04/16.
 */
public class Orcamento {

    private List<Item> itens;

    public Orcamento(Item item) {
        itens = new ArrayList<>();
        itens.add(item);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularDesconto() {
        Desconto descontoAcimaQuatrocentosReais = new DescontoAcimaDeQuatrocentosReais();
        Desconto descontoCincoItens = new DescontoCincoItens();
        Desconto semDesconto = new SemDesconto();

        descontoAcimaQuatrocentosReais.setProximo(descontoCincoItens);
        descontoCincoItens.setProximo(semDesconto);

        return descontoAcimaQuatrocentosReais.calcular(this);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public double getValor() {
        double valor = 0;

        for (Item item : itens) {
            valor += item.getPreco();
        }
        return valor;
    }
}
