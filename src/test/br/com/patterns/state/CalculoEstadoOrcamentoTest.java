package test.br.com.patterns.state;

import main.br.com.patterns.state.Orcamento;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by odilon on 06/04/16.
 */
public class CalculoEstadoOrcamentoTest {

    private Orcamento orcamento;
    private static final double DELTA = 0.01;

    @Before
    public void inicializar() {
        orcamento = new Orcamento(100);
    }

    @After
    public void finalizar() {
    }

    @Test
    public void deveCalcularValorOrcamentoAguardandoAprovacao() {
        double valorCalculado = orcamento.aplicaDesconto();

        final double valorEsperado = 1.00;
        Assert.assertEquals(valorEsperado, valorCalculado, DELTA);
    }

    @Test
    public void deveCalcularValorOrcamentoAprovado() {
        orcamento.aprovar();

        double valorCalculado = orcamento.aplicaDesconto();
        final double valorEsperado = 5.00;

        Assert.assertEquals(valorEsperado, valorCalculado, DELTA);
    }

    @Test
    public void deveCalcularValorOrcamentoFinalizado() {
        orcamento.aprovar();
        orcamento.finalizar();

        double valorCalculado = orcamento.aplicaDesconto();

        final double valorEsperado = 0;
        Assert.assertEquals(valorEsperado, valorCalculado, DELTA);
    }

    @Test
    public void deveRetornarZeroOrcamentoReprovado() {
        orcamento.reprovar();
        double valorCalculado = orcamento.aplicaDesconto();

        final double valorEsperado = 0;
        Assert.assertEquals(valorEsperado, valorCalculado, DELTA);
    }

    @Test(expected = RuntimeException.class)
    public void deveLancarExcecaoQuandoTentarFinalizarOrcamentoAguardandoAprovacao() {
        orcamento.aprovar();
    }

    @Test(expected = RuntimeException.class)
    public void deveLancarExcecaoQuandoTentarAprovarOrcamentoFinalizado() {
        orcamento.aprovar();
        orcamento.finalizar();
        orcamento.aprovar();
    }

    @Test(expected = RuntimeException.class)
    public void deveLancarExcecaoQuandoTentarAprovarOrcamentoReprovado() {
        orcamento.aprovar();
        orcamento.finalizar();
        orcamento.reprovar();
    }


}
