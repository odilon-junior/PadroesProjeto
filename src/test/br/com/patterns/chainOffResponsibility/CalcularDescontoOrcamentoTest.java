package test.br.com.patterns.chainOffResponsibility;

import main.br.com.patterns.chainOffResponsibility.domain.Item;
import main.br.com.patterns.chainOffResponsibility.domain.Orcamento;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by odilon on 04/04/16.
 */
public class CalcularDescontoOrcamentoTest {

    private Orcamento orcamento;
    private static final double DELTA = 0.1;

    @Before
    public void inicializa() {
    }

    @After
    public void finaliza() {
    }

    @Test
    public void deveCalcularDescontoQuandoOrcamentoTiverMaisCincoItens() {
        orcamento = new Orcamento(new Item("Caneta", 5.0));
        orcamento.adicionarItem(new Item("Borracha", 5.0));
        orcamento.adicionarItem(new Item("Tesoura", 10.0));
        orcamento.adicionarItem(new Item("Cola", 10.0));
        orcamento.adicionarItem(new Item("Corretivo", 5.0));

        final double valorCalculado = orcamento.calcularDesconto();
        final double valorEsperado = 17.50;

        assertEquals(valorEsperado, valorCalculado, DELTA);
    }

    @Test
    public void deveCalcularDescontoQuandoOrcamentoMaiorQuatrocentosReais() {
        orcamento = new Orcamento(new Item("Computador dell", 1000));

        final double valorCalculado = orcamento.calcularDesconto();
        final double valorEsperado = 10;

        assertEquals(valorEsperado, valorCalculado, DELTA);
    }
}
