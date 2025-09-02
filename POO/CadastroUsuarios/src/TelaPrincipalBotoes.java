import model.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipalBotoes extends JFrame {
    private JPanel Principal;
    private JButton usuariosButton;
    private JButton listarButton;
    private JButton sobreButton;
    private JButton sairButton;

    public TelaPrincipalBotoes() {
        setContentPane(Principal);
        setSize(900, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Menu com Botões");
        setLocationRelativeTo(null);
        setVisible(true);


        usuariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormCadastroLogin formCadLogin = new FormCadastroLogin();
                formCadLogin.setVisible(true);
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
