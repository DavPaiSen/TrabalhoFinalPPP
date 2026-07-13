import java.util.List;

public class MultiplaEscolha implements Pergunta{
    private String enunciado;
    private int alternativaCorreta;
    private List<String> alternativas;

    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getAtlternativas() {
        return alternativas;
    }

    public int getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public MultiplaEscolha(String enunciado, int alternativaCorreta, List<String> alternativas) {
        this.enunciado = enunciado;
        this.alternativaCorreta = alternativaCorreta;
        this.alternativas = alternativas;
    }
}
