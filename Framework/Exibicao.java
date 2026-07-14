public interface Exibicao {
    void mostrarPergunta(Pergunta pergunta);
    int lerResposta();
    void mostarResultado(int pontos, int acertos, int erros);

}
