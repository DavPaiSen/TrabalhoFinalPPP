package Framework;

public class PoliticaSingleton {
    private static PontuacaoPadrao pontuacaoPadrao;
    private static PontuacaoPenalizar pontuacaoPenalizar;
    private static PontuacaoDecrescente pontuacaoDecrescente;

    public static PoliticaPontuacao getPadrao() {
        if (pontuacaoPadrao == null) {
            pontuacaoPadrao = new PontuacaoPadrao();
        } 
        return pontuacaoPadrao;
    }

    public static PoliticaPontuacao getPenalizar() {
        if (pontuacaoPenalizar == null) {
            pontuacaoPenalizar = new PontuacaoPenalizar();
        }
        return pontuacaoPenalizar;
    }

    public static PoliticaPontuacao getDecrescente() {
        if (pontuacaoDecrescente == null) {
            pontuacaoDecrescente = new PontuacaoDecrescente();
        }
        return pontuacaoDecrescente;
    }

    //para o maxTempo nao faz sentido pois podem ter varias combinacoes de tempo maximo e politicas auxiliares
}
