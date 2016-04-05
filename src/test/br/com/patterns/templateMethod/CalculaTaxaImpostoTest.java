package test.br.com.patterns.templateMethod;

import main.br.com.patterns.templateMethod.ImpostoY;
import main.br.com.patterns.templateMethod.Orcamento;
import main.br.com.patterns.templateMethod.TemplateDeImpostoCondicional;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by odilon on 04/04/16.
 */
public class CalculaTaxaImpostoTest {

    private TemplateDeImpostoCondicional impostoY;
    private static final double DELTA = 0.01;

    @Before
    public void inicializar() {
        impostoY = new ImpostoY();
    }

    @After
    public void finalizar() {
    }


    @Test
    public void deveTaxarMenorImpostoQuandoValorOrcamentoMenorQueQuinhentos() {
        final Orcamento orcamento = new Orcamento(400);
        final double valorCalculado = impostoY.calcula(orcamento);
        final double valorEsperado = 24.0;

        assertEquals(valorCalculado, valorEsperado, DELTA);
    }

    @Test
    public void deveTaxarMaiorImpostoQuandoValorOrcamentoMaiorQueQuinhentos() {
        final Orcamento orcamento = new Orcamento(500);
        final double valorCalculado = impostoY.calcula(orcamento);
        final double valorEsperado = 50;

        assertEquals(valorCalculado, valorEsperado, DELTA);
    }
}
