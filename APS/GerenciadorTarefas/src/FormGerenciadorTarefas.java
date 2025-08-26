import model.Tarefa;
import dao.TarefaDao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormGerenciadorTarefas extends JFrame{
    private JPanel Principal;
    private JTextField TF_TituloTarefa;
    private JButton BT_AdicionaTarefaButton;
    private JTextField TF_DescricaoTarefa;
    private JList list1;

    TarefaDao tarefaDao;

    public FormGerenciadorTarefas(){
        setContentPane(Principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Gerenciador de Tarefas");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);


        BT_AdicionaTarefaButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String titulo = TF_TituloTarefa.getText();
                String descricao = TF_DescricaoTarefa.getText();

                Tarefa tarefa = new Tarefa(titulo, descricao);
                tarefaDao.inserirTarefa(tarefa);

                System.out.println("titulo: " + TF_TituloTarefa.getText());
                System.out.println("descricao: " + TF_DescricaoTarefa.getText());

            }
        });
    }




}
