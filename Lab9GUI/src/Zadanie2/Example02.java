package Zadanie2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example02 extends JFrame{
    private JTextField inputA;
    private JTextField inputB;
    private JButton sumaButton;
    private JButton różnicaButton;
    private JButton wyjścieButton;
    private JPanel JPanel1;
    private JLabel WynikLbl;

    double valueA, valueB, score;

    public Example02(){
        super("Kalkulator");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(inputA.getText());
                valueB = Double.parseDouble(inputB.getText());
                score = valueA + valueB;
                WynikLbl.setText("Suma "+String.valueOf(valueA)+" + "+String.valueOf(valueB)+" = "+String.valueOf(score));
                inputA.setText("");
                inputB.setText("");
            }
        });

        różnicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(inputA.getText());
                valueB = Double.parseDouble(inputB.getText());
                score = valueA - valueB;
                WynikLbl.setText("Suma "+String.valueOf(valueA)+" - "+String.valueOf(valueB)+" = "+String.valueOf(score));
                inputA.setText("");
                inputB.setText("");
            }
        });

        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
