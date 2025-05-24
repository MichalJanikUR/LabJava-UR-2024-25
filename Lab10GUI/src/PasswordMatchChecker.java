import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordMatchChecker extends JFrame {
    private JPanel JPanel1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton OKButton;

    public PasswordMatchChecker()
    {
        super("Password Match Checker");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 150;
        this.setSize(width, height);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = "qwerty";

                String newPassword = new String(passwordField1.getPassword());
                String confirmPassword = new String(passwordField2.getPassword());

                if(newPassword.equals(confirmPassword) && newPassword.equals(password))
                    JOptionPane.showMessageDialog(PasswordMatchChecker.this,"Congratulations! You entered the correct password!");
                else if(!(newPassword.equals(confirmPassword) && newPassword.equals(password)))
                    JOptionPane.showMessageDialog(PasswordMatchChecker.this,"Wrong password");

                if(newPassword.equals(confirmPassword))
                    JOptionPane.showMessageDialog(PasswordMatchChecker.this,"Passwords match!");
                else
                    JOptionPane.showMessageDialog(PasswordMatchChecker.this,"Passwords do not match!");
            }
        });
    }
}
