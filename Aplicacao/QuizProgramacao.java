import java.util.ArrayList;
import java.util.List;

public class QuizProgramacao {


        public static List<Pergunta> criarPerguntas() {


            List<Pergunta> perguntas = new ArrayList<>();


            perguntas.add(
                    PerguntaFactory.novaPergunta(
                            "multipla escolha",
                            "Qual o significado de POO?",
                            List.of(
                                    "Programação Organizada por Objetos",
                                    "Processamento Orientado a Objetos",
                                    "Programação Orientada a Objetos",
                                    "Projeto Orientado a Operações"
                            ),
                            2
                    )
            );


            perguntas.add(
                    PerguntaFactory.novaPergunta(
                            "multipla escolha",
                            "Qual destas linguagens é orientada a objetos?",
                            List.of(
                                    "C++",
                                    "HTML",
                                    "CSS",
                                    "SQL"
                            ),
                            0
                    )
            );


            perguntas.add(
                    PerguntaFactory.novaPergunta(
                            "verdadeiro ou falso",
                            "Uma interface em Java pode declarar métodos.",
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
                            "Qual desses é usada para repetir um bloco de código?",
                            List.of(
                                    "if",
                                    "switch",
                                    "for",
                                    "return"
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
                            "multipla escolha",
                            "Qual palavra-chave é usada para criar um objeto em Java?",
                            List.of(
                                    "class",
                                    "new",
                                    "this",
                                    "void"
                            ),
                            1
                    )
            );


            perguntas.add(
                    PerguntaFactory.novaPergunta(
                            "multipla escolha",
                            "Qual estrutura é utilizada para tomar decisões?",
                            List.of(
                                    "if",
                                    "for",
                                    "while",
                                    "do-while"
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
                            "Qual padrão de projeto é usado para cria objetos ?",
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


