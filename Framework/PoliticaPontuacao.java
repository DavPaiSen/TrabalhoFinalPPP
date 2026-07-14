import java.time.Duration;

public interface PoliticaPontuacao {
    public int acertou(Duration tempoSegundos);

    /* Devolve um numero negativo (se for o caso), a pontuacao deve sempre ser somada, nunca subtraida */
    public int errou(Duration tempoSegundos);
}
