import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


//testando a branch
public class Quiz {
    private List<Pergunta> perguntas;
    private int pontos;
    private int acertos;
    private int indicePerguntaAtual;
    private Pergunta perguntaAtual;
    private PoliticaPontuacao politicaPontuacao;//stategy

    public Quiz (int qtdGanha, int qtdPerde, PoliticaPontuacao politicaPontuacao) {
        perguntas = new ArrayList<>();
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
        //TODO trocar de pergunta
    }

    public String fimQuiz() {
        return ("Total de acertos: " + acertos + "\nTotal de erros: " + (perguntas.size() - acertos) + "\nPontuacao final: " + pontos);
    }

    public Pergunta perguntaAtual() {
        return perguntas.get(indicePerguntaAtual);
    }
}
