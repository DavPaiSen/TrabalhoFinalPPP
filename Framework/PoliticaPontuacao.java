public interface PoliticaPontuacao {
    public int acertou(int tempoSegundos);

    /* Devolve um numero negativo (se for o caso), a pontuacao deve sempre ser somada, nunca subtraida */
    public int errou(int tempoSegundos);
}
