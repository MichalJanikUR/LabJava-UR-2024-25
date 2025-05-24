import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioTask extends JFrame{
    private JPanel panel1;
    private JPanel JPanel1;
    private JButton backButton;
    private JButton OKButton;
    private JButton closeButton;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macRadioButton;
    private JLabel iconView;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Figures/linux.jpg"));
    private ImageIcon iconWin = new ImageIcon(getClass().getResource("Figures/windows.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("Figures/mac.png"));

    private static ImageIcon resize(ImageIcon src, int width, int height){
        return new ImageIcon(src.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }

    public RadioTask() {
        super("Radio Box");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 400;
        this.setSize(width, height);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "";
                if(linuxRadioButton.isSelected()) text = "Linux";
                if(windowsRadioButton.isSelected()) text = "Windows";
                if(macRadioButton.isSelected()) text = "Mac";

                JOptionPane.showMessageDialog(RadioTask.this,"Wybrano system: "+ text);
            }
        });
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected())
                    iconView.setIcon(resize(iconLinux,100,80));
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected())
                    iconView.setIcon(resize(iconWin,100,80));
            }
        });
        macRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macRadioButton.isSelected())
                    iconView.setIcon(resize(iconMac,100,80));
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
