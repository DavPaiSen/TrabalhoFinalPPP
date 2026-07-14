import java.util.List;

public class PerguntaFactory {
    public static Pergunta novaPergunta(String tipo, String enunciado, List<String> alternativas, int indiceCorreta) {

        if (indiceCorreta < 0 || indiceCorreta >= alternativas.size()) {
            throw new IllegalArgumentException("O indice informado e incompativel com as alternativas informadas");
        }

        switch (tipo.toLowerCase()) {
            case "multipla escolha":
                return new MultiplaEscolha(enunciado, indiceCorreta, alternativas);

            case "verdadeiro ou falso":
                return new VerdadeiroOuFalso(enunciado, alternativas, indiceCorreta);
        
            default:
                throw new IllegalArgumentException("Tipo de pergunta informado nao existe");
        }
    }
}
