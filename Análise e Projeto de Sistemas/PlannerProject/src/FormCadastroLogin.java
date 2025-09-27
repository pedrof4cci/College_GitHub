import model.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCadastroLogin extends JFrame{
    private JPanel Principal;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JTextField textField2;
    private JLabel TF_Nome;
    private JLabel TF_Email;
    private JLabel TF_Senha;
    private JButton Button_Cadastrar;
    private JButton Button_Listar;

    //LoginDao loginDao;

    public FormCadastroLogin() {

        setVisible(true);
        setContentPane(Principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cadastrar Usuário");
        setSize(400, 400);
        setLocationRelativeTo(null);
/*
        loginDao = new LoginDao();

        Login login = new Login(nome, email, senha, dataCadastro, dataAtualizacao);
        loginDao.inserirLogin(login);

 */

        Button_Cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = TF_Nome.getText();
                String email = TF_Email.getText();
                String senha = TF_Senha.getText();



                System.out.println("Nome: "+ TF_Nome.getText());
                System.out.println("Email: "+ TF_Email.getText());
                System.out.println("Senha: "+ TF_Senha.getText());
            }
        });
    }
}
