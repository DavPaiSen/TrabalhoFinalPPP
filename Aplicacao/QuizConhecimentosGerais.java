package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import Framework.*;

public class QuizConhecimentosGerais {

    public static List<Pergunta> criarPerguntas() {

        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Quantos ossos temos em uma orelha?",
                        List.of(
                                "2",
                                "3",
                                "4",
                                "5"
                        ),
                        1
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Qual é o planeta mais quente do Sistema Solar?",
                        List.of(
                                "Mercúrio",
                                "Marte",
                                "Vênus",
                                "Júpiter"
                        ),
                        2
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Que doença era comum entre marinheiros e piratas devido à falta de vitamina C?",
                        List.of(
                                "Malária",
                                "Escorbuto",
                                "Tuberculose",
                                "Gripe"
                        ),
                        1
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Em que ano foi criada a ONU?",
                        List.of(
                                "1939",
                                "1942",
                                "1945",
                                "1950"
                        ),
                        2
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Qual é o pássaro mais rápido do mundo?",
                        List.of(
                                "Águia",
                                "Falcão-peregrino",
                                "Condor",
                                "Coruja"
                        ),
                        1
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Qual é a única parte do corpo humano totalmente formada ao nascer?",
                        List.of(
                                "Coração",
                                "Pulmão",
                                "Olho",
                                "Cérebro"
                        ),
                        2
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Quantos corações possui um polvo?",
                        List.of(
                                "1",
                                "2",
                                "3",
                                "4"
                        ),
                        2
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Em qual continente está localizado o maior deserto do mundo?",
                        List.of(
                                "África",
                                "Ásia",
                                "Antártica",
                                "América do Sul"
                        ),
                        2
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "verdadeiro ou falso",
                        "O Monte Everest é a montanha mais alta do mundo.",
                        List.of(
                                "Verdadeiro",
                                "Falso"
                        ),
                        0
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "verdadeiro ou falso",
                        "Os morcegos são aves.",
                        List.of(
                                "Verdadeiro",
                                "Falso"
                        ),
                        1
                )
        );

        return perguntas;
    }
}