package test.br.com.patterns.strategy;

import main.br.com.patterns.strategy.domain.ImpostoEnum;
import main.br.com.patterns.strategy.domain.NFe;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by odilon on 04/04/16.
 */
public class CalcularImpostoNFeTest {

    private NFe nfe;
    private static final double VALOR_TOTAL_NFE = 100;
    private static double DELTA = 0.1;

    @Before
    public void inicializar() {
    }

    @After
    public void finalizar(){
    }

    @Test
    public void deveCalcularISS() {
        nfe = new NFe(VALOR_TOTAL_NFE, ImpostoEnum.ISS);

        final double valorCalculado = nfe.calcularImposto();
        final double valorEsperado = 60.00;

        assertEquals(valorCalculado, valorEsperado, DELTA);
    }

    @Test
    public  void deveCalcularICMS(){
        nfe = new NFe(VALOR_TOTAL_NFE, ImpostoEnum.ICMS);

        final double valorCalculado = nfe.calcularImposto();
        final double valorEsperado = 40.00;

        assertEquals(valorCalculado, valorEsperado, DELTA);

    }
}
