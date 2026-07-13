import java.util.List;

public interface Pergunta {
    public String getEnunciado();

    public List<String> getAtlternativas();

    public int getAlternativaCorreta();
}