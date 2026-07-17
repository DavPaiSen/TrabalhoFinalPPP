package Aplicacao;

import Framework.*;

public class Main {
    public static void main(String[] args) {
        QuizConhecimentosGerais quizConhecimentosGerais = new QuizConhecimentosGerais(PoliticaSingleton.getPadrao());
        Console console = new Console(quizConhecimentosGerais);
        console.apresentar();
    }
}
