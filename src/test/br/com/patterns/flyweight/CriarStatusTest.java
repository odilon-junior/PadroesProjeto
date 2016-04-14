package test.br.com.patterns.flyweight;

import main.br.com.patterns.flyweight.FabricaStatusItem;
import main.br.com.patterns.flyweight.StatusItem;
import org.junit.Assert;
import org.junit.Test;

import javax.management.InstanceNotFoundException;

import static org.junit.Assert.fail;

/**
 * Created by odilon on 14/04/16.
 */
public class CriarStatusTest {

    @Test
    public void deveGarantirApenasUmObjetoCriado() throws InstanceNotFoundException {
        StatusItem item1 = FabricaStatusItem.getInstance("FECHADO");
        StatusItem item2 = FabricaStatusItem.getInstance("FECHADO");

        Assert.assertTrue(item1 == item2);
    }

    @Test(expected = InstanceNotFoundException.class)
    public void deveReceberUmaExcecaoQuandoNaoExistirChave() throws InstanceNotFoundException {
        StatusItem intanceInexistente = FabricaStatusItem.getInstance("");
        fail();
    }
}
