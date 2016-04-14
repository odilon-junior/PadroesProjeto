package main.br.com.patterns.observer.services;


import main.br.com.patterns.observer.models.NFe;

/**
 * Created by odilon on 15/03/16.
 */
public class SalvarDados implements AcaoPosGerarNotaFiscal {
    public void executar(NFe nfe) {
        System.out.println("Salvando no banco");
    }
}
