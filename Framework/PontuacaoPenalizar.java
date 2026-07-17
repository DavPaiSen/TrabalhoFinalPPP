package Framework;

import java.time.Duration;

public class PontuacaoPenalizar implements PoliticaPontuacao{
    public int acertou(Duration tempo) {
        return 1;
    }

    public int errou(Duration tempo) {
        return -1;
    }

}
