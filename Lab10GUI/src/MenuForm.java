import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame{
    private JPanel JPanel1;
    private JButton zadanie1Button;
    private JButton zadanie2Button;
    private JButton wylogujButton;
    private JButton closeButton;

    public MenuForm(){
        super("Menu");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 100;
        this.setSize(width, height);
        zadanie1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RadioTask radioTask = new RadioTask();
                radioTask.setVisible(true);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        zadanie2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                CheckBoxTask checkBoxTask = new CheckBoxTask();
                checkBoxTask.setVisible(true);
            }
        });
        wylogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
            }
        });
    }
}
