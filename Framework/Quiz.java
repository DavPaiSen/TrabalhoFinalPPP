
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Quiz implements Apresentavel{
    private List<Pergunta> perguntas;
    private int pontos;
    private int acertos;
    private int indicePerguntaAtual;
    private Pergunta perguntaAtual;
    private PoliticaPontuacao politicaPontuacao;//stategy

    public Quiz(List<Pergunta> perguntas, PoliticaPontuacao politicaPontuacao) {
        this.perguntas = perguntas;
        this.politicaPontuacao = politicaPontuacao;

        pontos = 0;
        indicePerguntaAtual = 0;
        acertos = 0;

        perguntaAtual = perguntas.get(indicePerguntaAtual);
    }
    public void responde(int resposta) {
        Duration tempo = perguntaAtual.tempo();
        if (resposta == perguntaAtual.getAlternativaCorreta()) {
            acertos++;
            pontos += politicaPontuacao.acertou(tempo);
        } else {
            pontos += politicaPontuacao.errou(tempo);
        }
        indicePerguntaAtual++;

        if (indicePerguntaAtual < perguntas.size()) {
            perguntaAtual = perguntas.get(indicePerguntaAtual);
        }
    }

    public String fimQuiz() {
        return ("Total de acertos: " + acertos + "\nTotal de erros: " + (perguntas.size() - acertos) + "\nPontuacao final: " + pontos);
    }

    public Pergunta perguntaAtual() {
        return perguntas.get(indicePerguntaAtual);
    }

    public String getEnunciado() {
        return perguntaAtual.getEnunciado();
    }

    public List<String> getAlternativas() {
        return perguntaAtual.getAtlternativas();
    }

    public int getNumeroQuestao() {
        return indicePerguntaAtual + 1;
    }

    public int tamanho() {
        return perguntas.size();
    }
}