import dao.LoginDao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAutenticacao extends JFrame {
    private JPanel Principal;
    private JTextField senhaTF;
    private JButton sairButton;
    private JButton acessarButton;
    private JTextField emailTF;

    LoginDao loginDao = new LoginDao();
    public TelaAutenticacao(){
        setContentPane(Principal);
        setSize(350,250);
        setTitle("Autenticação");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        acessarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailTF.getText();
                String senha = new String(senhaTF.getPassword());
                System.out.println(senha);
                System.out.println(email);
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
