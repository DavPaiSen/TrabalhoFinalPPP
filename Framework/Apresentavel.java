package Framework;

import java.util.List;

public interface Apresentavel {
    public String getEnunciado();
    
    public List<String> getAlternativas();

    public boolean responde (int resposta);

    public String fimQuiz();

    public int getNumeroQuestao();

    public int tamanho();
}
