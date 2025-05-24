package Zadanie2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Example01 extends JFrame{
    private JPanel JPanel1;
    private JButton OKButton;
    private JButton witajButton;
    private JPanel JPanelButton;
    private JLabel textInputLabel;
    private JPanel JPanelLbl;
    private JButton klikButton;
    private JLabel dataLabel;
    private JButton wyjścieButton;
    private JButton button1;

    public Example01(){
        super("Moje pierwsze GUI");
        this.setContentPane(this.JPanel1); //główny panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);
        //this.pack();

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = JOptionPane.showInputDialog("Podaj imię: ");
//                JOptionPane.showMessageDialog(null, "Witaj "+ text);
//                JOptionPane.showMessageDialog(null, "Witaj "+ text, "Tytuł", JOptionPane.WARNING_MESSAGE);

                int a = JOptionPane.showConfirmDialog(null,"Wpisano dane: "+text,"To jest moje okno ", JOptionPane.YES_NO_OPTION);
            }
        });

        witajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textInputLabel.setText("Dziś jest środa");

            }
        });

        klikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataLabel.setText(new Date().toString());
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
