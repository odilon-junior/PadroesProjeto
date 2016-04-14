package main.br.com.patterns.flyweight;

import javax.management.InstanceNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by odilon on 14/04/16.
 */
public class FabricaStatusItem {

    private static Map<String, StatusItem> map = new HashMap<>();

    private FabricaStatusItem() {
    }

    static {
        map.put("FECHADO", new StatusItem("FECHADO", true));
        map.put("PAGO", new StatusItem("PAGO", false));
    }

    public static StatusItem getInstance(String key) throws InstanceNotFoundException {
        if (key.isEmpty() || key == null) {
            throw new InstanceNotFoundException("Instancia nao encontrada");
        } else {
            return map.get(key);
        }
    }
}
