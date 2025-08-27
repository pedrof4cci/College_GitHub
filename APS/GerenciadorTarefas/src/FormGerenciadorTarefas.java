import model.Tarefa;
import dao.TarefaDao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormGerenciadorTarefas extends JFrame{
    private JPanel Principal;
    private JTextField TF_TituloTarefa;
    private JButton BT_AdicionaTarefaButton;
    private JTextField TF_DescricaoTarefa;
    private JTable table1;

    TarefaDao tarefaDao;

    String[] colunas ={"TITULO", "DESCRICAO", "STATUS"};
    DefaultTableModel model = new DefaultTableModel(colunas, 0);

    public FormGerenciadorTarefas(){
        setContentPane(Principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Gerenciador de Tarefas");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        tarefaDao = new TarefaDao();
        table1.setModel (model);

        BT_AdicionaTarefaButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String titulo = TF_TituloTarefa.getText();
                String descricao = TF_DescricaoTarefa.getText();
                boolean status = true;

                Tarefa tarefa = new Tarefa(titulo, descricao, status);
                tarefaDao.inserirTarefa(tarefa);

                System.out.println(tarefaDao.getLista());

                model.setRowCount(0);
                for(Tarefa t : tarefaDao.getLista()){
                    Object[] linha={
                            t.getTitulo(),
                            t.getDescricao(),
                            t.getStatus()
                    };
                    model.addRow(linha);
                }
            }
        });
        /*
        public void listaTarefa(){

        }
        System.out.println(tarefaDao.getLista());

        model.setRowCount(0);
        for(Tarefa t : tarefaDao.getLista()){
            Object[] linha={
                    t.getTitulo(),
                    t.getDescricao(),
            };
            model.addRow(linha);
        }

         */






    }




}
