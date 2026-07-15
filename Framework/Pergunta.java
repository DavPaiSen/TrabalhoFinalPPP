package Framework;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public abstract class Pergunta { //template
    protected String enunciado;
    protected List<String> alternativas;
    protected int alternativaCorreta;
    protected Instant inicio; 

    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getAtlternativas() {
        return alternativas;
    }

    public int getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public Duration tempo() {
        return Duration.between(inicio, Instant.now());
    }

    public Pergunta(String enunciado, List<String> alternativas, int alternativaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    
}