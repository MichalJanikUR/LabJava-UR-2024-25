import javax.swing.*;

public class WelcomeForm extends JFrame{
    private JPanel JPanel1;
    private JLabel pleaseWaitLbl;
    private JProgressBar progressBar1;

    public WelcomeForm() {
        super("Welcome Form");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);
        this.setVisible(true);

        progression();
        dispose();
        //otwarcie nowego formularza
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }

    private void progression(){
        int counter = 0;
        while(counter <= 100){
            pleaseWaitLbl.setText("Please wait ...");;
            progressBar1.setValue(counter);

            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            counter += 5;
        }
    }
}
