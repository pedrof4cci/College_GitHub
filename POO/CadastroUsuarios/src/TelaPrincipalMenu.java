import javax.swing.*;

public class TelaPrincipalMenu extends JFrame{
    private JPanel Principal;

    public TelaPrincipalMenu(){
        setContentPane(Principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1900,1080);
        setLocationRelativeTo(null);
        setTitle("Tela de Menus");
        setVisible(true);

        //criação da barra de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);//adiciona o menu à barra

        //criarção de um menu
        JMenu menuUsuario = new JMenu("Usuário");
        menuBar.add(menuUsuario);//adiciona

        //criando itens
        JMenuItem subMenuCadastroUsuario = new JMenuItem("Novo Usuário");
        JMenuItem subMenuRelatorioUsuario = new JMenuItem("Relatório Usuário");

        //adiciona item
        menuUsuario.add(subMenuCadastroUsuario);
        menuUsuario.add(subMenuRelatorioUsuario);

        JMenu menuTarefa = new JMenu("Tarefa");
        JMenu menuSobre = new JMenu("Sobre");
        JMenu menuSair = new JMenu("Sair");

    }
}
