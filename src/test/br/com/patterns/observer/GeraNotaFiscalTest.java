package test.br.com.patterns.observer;


import main.br.com.patterns.observer.models.Fatura;
import main.br.com.patterns.observer.models.NFe;
import main.br.com.patterns.observer.services.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;

/**
 * Created by odilon on 15/03/16.
 */
public class GeraNotaFiscalTest {

    @Test
    public void deveInvocarAcoesPosGerarNFe() {
        AcaoPosGerarNotaFiscal enviarEmailMock = mock(EnviarEmail.class);
        AcaoPosGerarNotaFiscal enviarSapMock = mock(EnviarSap.class);
        AcaoPosGerarNotaFiscal salvarDadosMock = mock(SalvarDados.class);

        List<AcaoPosGerarNotaFiscal> acoes = Arrays.asList(enviarEmailMock,
                enviarSapMock,
                salvarDadosMock);

        Fatura fatura = new Fatura();
        GeradorNotaFiscal geradorNotaFiscal = new GeradorNotaFiscal(acoes);

        NFe nfe = geradorNotaFiscal.gerar(fatura);

        Mockito.verify(enviarEmailMock).executar(nfe);
        Mockito.verify(enviarSapMock).executar(nfe);
        Mockito.verify(salvarDadosMock).executar(nfe);
    }
}
