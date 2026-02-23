import dao.LoginDao;
import model.Login;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormCadastroLogin extends JFrame{
    private JPanel Principal;
    private JTextField TF_Nome;
    private JPasswordField TF_Senha;
    private JTextField TF_Email;
    private JButton cadastrarButton;
    private JButton listarButton;
    private JTable table1;

    LoginDao loginDao;

    //criamos um array de string para o rótulo da tabela
    String[] colunas ={"ID", "NOME", "E-MAIL", "DATA CADASTRO", "DATA ATUALIZAÇÃO"};

    //inserindo o rotulo na linnha 0 do Objeto model
    DefaultTableModel model = new DefaultTableModel(colunas, 0);

    public FormCadastroLogin() {
        setContentPane(Principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        table1.setModel (model);

        loginDao = new LoginDao();
        loginDao.inserirLogin(new Login("Pedro", "pedrolas@gmail.com", "SenhaSecreta123", "2025-07-01", "2025-08-18"));
        loginDao.inserirLogin(new Login("Maria", "maria.silva@gmail.com", "SenhaForte456", "2025-06-15", "2025-08-10"));
        loginDao.inserirLogin(new Login("João", "joao123@hotmail.com", "JoaoSenha789", "2025-05-20", "2025-08-12"));
        loginDao.inserirLogin(new Login("Ana", "ana.costa@yahoo.com", "Costa@2025", "2025-07-05", "2025-08-17"));
        loginDao.inserirLogin(new Login("Lucas", "lucas_oliveira@gmail.com", "LcsOlv#001", "2025-04-11", "2025-08-13"));
        loginDao.inserirLogin(new Login("Fernanda", "fernanda.moura@gmail.com", "F3r!2025", "2025-06-25", "2025-08-16"));
        loginDao.inserirLogin(new Login("Carlos", "carlos.santos@hotmail.com", "Carl0s2025", "2025-03-30", "2025-08-14"));
        loginDao.inserirLogin(new Login("Juliana", "juliana_ferreira@gmail.com", "Jul@1234", "2025-05-01", "2025-08-15"));
        loginDao.inserirLogin(new Login("Rafael", "rafael.azevedo@yahoo.com", "RafPass!55", "2025-06-10", "2025-08-18"));
        loginDao.inserirLogin(new Login("Beatriz", "bia.martins@gmail.com", "BiaMartins#2025", "2025-07-02", "2025-08-17"));

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = TF_Nome.getText();
                String email = TF_Email.getText();
                String senha = TF_Senha.getText();
                String dataCadastro = "2025-08-14" ;
                String dataAtualizacao= "";

                Login login = new Login(nome, email, senha, dataCadastro, dataAtualizacao);
                loginDao.inserirLogin(login);
               // loginDao.inserirLogin(new Login(nome, email, senha, dataCadastro, dataAtualizacao));

                System.out.println(loginDao.getLista());

                /*System.out.println("Nome: " + TF_Nome.getText());
                System.out.println("E-mail: " + TF_Email.getText());
                System.out.println("Senha: " + TF_Senha.getText());*/

            }

        });
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(loginDao.getLista());

                model.setRowCount(0);
                for(Login l : loginDao.getLista()){
                    Object[] linha={
                            l.getId(),
                            l.getNome(),
                            l.getEmail(),
                            l.getDataCadastro(),
                            l.getDataAtualizacao()
                    };
                    model.addRow(linha);
                }
            }
        });
    }
}
