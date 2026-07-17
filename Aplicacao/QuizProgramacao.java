package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import Framework.*;

public class QuizProgramacao {

    public static List<Pergunta> criarPerguntas() {

        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "A linguagem binária, utilizada pelos computadores, é formada por quantos valores?",
                        List.of(
                                "2",
                                "8",
                                "10",
                                "16"
                        ),
                        0
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "O que é uma variável em programação?",
                        List.of(
                                "Um tipo de linguagem",
                                "Um espaço para armazenar dados",
                                "Um comando de repetição",
                                "Um compilador"
                        ),
                        1
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Qual linguagem é usada principalmente para o desenvolvimento de aplicativos Android?",
                        List.of(
                                "Python",
                                "C",
                                "Java",
                                "HTML"
                        ),
                        2
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "O que é o Git?",
                        List.of(
                                "Uma linguagem de programação",
                                "Um banco de dados",
                                "Um sistema de controle de versão",
                                "Um sistema operacional"
                        ),
                        2
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Qual é a finalidade de uma função na programação?",
                        List.of(
                                "Armazenar arquivos",
                                "Executar uma tarefa específica",
                                "Criar um banco de dados",
                                "Compilar o programa"
                        ),
                        1
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "O que é uma API?",
                        List.of(
                                "Uma linguagem de programação",
                                "Um antivírus",
                                "Uma interface que permite a comunicação entre sistemas",
                                "Um editor de código"
                        ),
                        2
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "verdadeiro ou falso",
                        "Uma classe pode implementar mais de uma interface.",
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
                        "O encapsulamento protege os dados de uma classe.",
                        List.of(
                                "Verdadeiro",
                                "Falso"
                        ),
                        0
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Qual coleção permite armazenar elementos em ordem de inserção?",
                        List.of(
                                "ArrayList",
                                "HashMap",
                                "Stack",
                                "TreeMap"
                        ),
                        0
                )
        );

        perguntas.add(
                PerguntaFactory.novaPergunta(
                        "multipla escolha",
                        "Qual padrão de projeto é usado para criar objetos?",
                        List.of(
                                "Factory",
                                "Strategy",
                                "Proxy",
                                "Decorator"
                        ),
                        0
                )
        );

        return perguntas;
    }
}

