package main.br.com.patterns.state;

/**
 * Created by odilon on 06/04/16.
 */
public class AguardandoAprovacao implements EstadoOrcamento {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.01;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoOrcamento = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoOrcamento = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento esta em estado inconsistente");
    }
}
