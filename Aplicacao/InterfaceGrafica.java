package Aplicacao;

import javax.swing.*;
import java.util.List;
import Framework.*;

public class InterfaceGrafica extends JFrame {

    private Apresentavel quiz;

    private JLabel lblPergunta;
    private JPanel panelAlternativas;
    private JRadioButton[] alternativas;
    private JButton btnResponder;


    public InterfaceGrafica(Apresentavel quiz) {

        this.quiz = quiz;


        setTitle("Quiz");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel painelPrincipal = new JPanel();

        painelPrincipal.setLayout(
                new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS)
        );


        lblPergunta = new JLabel();

        painelPrincipal.add(lblPergunta);


        panelAlternativas = new JPanel();

        panelAlternativas.setLayout(
                new BoxLayout(panelAlternativas, BoxLayout.Y_AXIS)
        );


        painelPrincipal.add(panelAlternativas);


        btnResponder = new JButton("Responder");


        painelPrincipal.add(btnResponder);


        add(painelPrincipal);


        mostrarPergunta();


        btnResponder.addActionListener(e -> responder());


        setVisible(true);
    }



    private void mostrarPergunta() {

        lblPergunta.setText(quiz.getEnunciado());


        panelAlternativas.removeAll();


        List<String> opcoes = quiz.getAlternativas();


        alternativas = new JRadioButton[opcoes.size()];


        ButtonGroup grupo = new ButtonGroup();


        for (int i = 0; i < opcoes.size(); i++) {


            alternativas[i] = new JRadioButton(opcoes.get(i));


            grupo.add(alternativas[i]);


            panelAlternativas.add(alternativas[i]);
        }


        panelAlternativas.revalidate();

        panelAlternativas.repaint();
    }




    private void responder() {


        for (int i = 0; i < alternativas.length; i++) {


            if (alternativas[i].isSelected()) {


                quiz.responde(i);


                if (quiz.getNumeroQuestao() <= quiz.tamanho()) {

                    mostrarPergunta();

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            quiz.fimQuiz()
                    );

                    dispose();
                }


                return;
            }
        }


        JOptionPane.showMessageDialog(
                this,
                "Escolha uma alternativa!"
        );

    }

}