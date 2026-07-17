package Framework;

import java.time.Duration;

public class PontuacaoMaxTempo implements PoliticaPontuacao{
    Duration tempoMaximo;
    PoliticaPontuacao auxiliar;

    public int acertou(Duration tempo) {
        if (tempo.compareTo(tempoMaximo) > 0) {
            return auxiliar.errou(tempo);
        } else {
            return auxiliar.acertou(tempo);
        }
    }

    public int errou(Duration tempo) {
        return auxiliar.errou(tempo);
    }

    public PontuacaoMaxTempo(Duration tempoMaximo, PoliticaPontuacao auxiliar) {
        this.tempoMaximo = tempoMaximo;
        this.auxiliar = auxiliar;
    }
}