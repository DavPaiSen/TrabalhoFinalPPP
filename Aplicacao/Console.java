package Aplicacao;

import java.util.List;
import java.util.Scanner;

import Framework.*;

public class Console {
    private Apresentavel quiz;

    public void apresentar() {
        Scanner scanner = new Scanner(System.in);

        while (quiz.getNumeroQuestao() < quiz.tamanho()) {
            System.out.println("Questao " + quiz.getNumeroQuestao());
            System.out.println(quiz.getEnunciado());
            List<String> alternativas = quiz.getAlternativas();

            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println(i+1 + ") " + alternativas.get(i));
            }

            System.out.println("Insira a resposta: ");
            boolean valido = false;
            int resposta = 0;
            while (!valido) {
                try {
                    resposta = Integer.parseInt(scanner.nextLine());
                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Digite apenas numeros, por favor");
                }
            }
            
            if (quiz.responde(resposta)) {
                System.out.println("Correto!");
            } else {
                System.out.println("Incorreto!");
            }

            System.out.println();
        }
        scanner.close();
        System.out.println(quiz.fimQuiz());        
    }    

    public Console(Apresentavel quiz) {
        this.quiz = quiz;        
    }
}