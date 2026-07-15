package Aplicacao;

import java.util.List;
import java.util.Scanner;

import Framework.*;

public class Console {
    private Apresentavel quiz;

    public void apresentar() {
        Scanner scanner = new Scanner(System.in);

        while (quiz.getNumeroQuestao() < quiz.tamanho()) {
            System.out.println("Questao " + quiz.getNumeroQuestao() + 1);
            System.out.println(quiz.getEnunciado());
            List<String> alternativas = quiz.getAlternativas();

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println(i+1 + ") " + alternativas.get(i));
            }

            System.out.println("Insira a resposta: ");
            quiz.responde(Integer.parseInt(scanner.nextLine())); //TODO tem que tratar o erro de nao ser um numero digitado
        }
        scanner.close();
        System.out.println(quiz.fimQuiz());
        
    }    
}