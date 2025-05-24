import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTask extends JFrame {
    private JPanel JPanel1;
    private JRadioButton javaPrice3500PLNRadioButton;
    private JRadioButton cPrice3000PLNRadioButton;
    private JRadioButton cPrice4000PLNRadioButton;
    private JRadioButton pythonPrice5000PLNRadioButton;
    private JButton OKButton;
    private JCheckBox javaPrice3500PLNCheckBox;
    private JCheckBox cPrice3000PLNCheckBox;
    private JCheckBox cPrice4000PLNCheckBox;
    private JCheckBox pythonPrice5000PLNCheckBox;
    private JButton backButton;
    private JButton closeButton;

    public CheckBoxTask() {
        super("Check Box");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 400;
        this.setSize(width, height);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float price = 0;
                String msg = "";
                if(javaPrice3500PLNCheckBox.isSelected())
                {
                    msg += javaPrice3500PLNCheckBox.getText() + "\n";
                    price += 3500;
                }
                if(cPrice3000PLNCheckBox.isSelected())
                {
                    msg += cPrice3000PLNCheckBox.getText() + "\n";
                    price += 3000;
                }
                if(cPrice4000PLNCheckBox.isSelected())
                {
                    msg += cPrice4000PLNCheckBox.getText() + "\n";
                    price += 4000;
                }
                if(pythonPrice5000PLNCheckBox.isSelected())
                {
                    msg += pythonPrice5000PLNCheckBox.getText() + "\n";
                    price += 5000;
                }
                if(javaPrice3500PLNCheckBox.isSelected() || cPrice3000PLNCheckBox.isSelected() || cPrice4000PLNCheckBox.isSelected() || pythonPrice5000PLNCheckBox.isSelected())
                {
                    msg += "----------------------------------- \n Razem: "+price+" PLN";
                }

                JOptionPane.showMessageDialog(CheckBoxTask.this,msg);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuForm menuForm = new MenuForm();
                menuForm.setVisible(true);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
