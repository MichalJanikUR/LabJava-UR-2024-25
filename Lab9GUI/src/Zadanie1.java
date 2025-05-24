import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame{
    private JPanel panel1;
    private JButton Konwertuj;
    private JButton Wyjście;
    private JLabel OutputScore;
    private JTextField inputTemp;

    double valueTemp, score;

    public Zadanie1(){
        super("Konwerter temperatury");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        Konwertuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueTemp = Double.parseDouble(inputTemp.getText());
                score = 32 + (((double)9/5) * valueTemp); //źródło: wiki
                OutputScore.setText("Temperatura: "+valueTemp+" C na F: "+score);
                inputTemp.setText("");
            }
        });


        Wyjście.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
