package test.br.com.patterns.decorator;

import main.br.com.patterns.decorator.domain.Orcamento;
import main.br.com.patterns.decorator.service.ICMS;
import main.br.com.patterns.decorator.service.ISS;
import main.br.com.patterns.decorator.service.Imposto;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by odilon on 05/04/16.
 */
public class CalcularImpostoDecoratorTest {

    private static Orcamento orcamento;
    private final static double DELTA = 0.1;

    @Before
    public void inicializar() {
        orcamento = new Orcamento(100);
    }

    @After
    public void finalizar() {
    }

    @Test
    public void deveCalcularComApenasUmImposto() {
        Imposto impoto = new ICMS();

        final double valorCalculado = impoto.calcular(orcamento);
        final double valorEsperado = 1.0;

        assertEquals(valorEsperado, valorCalculado, DELTA);
    }


    @Test
    public void deveCalcularComDoisImpostoDecorados() {
        Imposto impoto = new ICMS( new ISS());

        final double valorCalculado = impoto.calcular(orcamento);
        final double valorEsperado = 7.0;

        assertEquals(valorEsperado, valorCalculado, DELTA);
    }
}
