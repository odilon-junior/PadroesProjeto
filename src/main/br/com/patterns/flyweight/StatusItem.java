package main.br.com.patterns.flyweight;

/**
 * Created by odilon on 14/04/16.
 */
public class StatusItem {

    public String status;
    public boolean finalizado;

    public StatusItem(String status, boolean finalizado) {
        this.status = status;
        this.finalizado = finalizado;
    }
}
