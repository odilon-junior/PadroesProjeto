package test.br.com.patterns.builder;

import junit.framework.Assert;
import main.br.com.patterns.builder.NFeBuilder;
import main.br.com.patterns.builder.dominio.Imposto;
import main.br.com.patterns.builder.dominio.Item;
import main.br.com.patterns.builder.dominio.NFe;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by odilon on 10/04/16.
 */
public class CriaNFeTest {

    @Test
    public void deveCriarNFe() {
        NFe nfe = NFeBuilder.build()
                .comCliente("Odilon da Silva Júnior")
                .comEmissor("Submarino.com")
                .comImposto(new Imposto("ICSS", 10))
                .comItens(Arrays.asList(new Item("caneta", 10.00, 1), new Item("borracha", 2.00, 2)))
                .builder();

        final String clienteEsperado = "Odilon da Silva Júnior";
        assertNotNull(nfe);
        assertEquals(clienteEsperado, nfe.getNomeCliente());
    }
}
