package visual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel Principal;
    private JButton avancarButton;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public Login() {
        setVisible(true);
        setContentPane(Principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login");
        setSize(400, 400);
        setLocationRelativeTo(null);

        avancarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = new String(passwordField1.getPassword());
        });
    }




}
