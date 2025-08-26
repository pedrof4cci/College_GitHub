import dao.TarefaDao;

public class Main {

    static TarefaDao tarefaDao = new TarefaDao();

    public static void main(String[] args) {

        FormGerenciadorTarefas formGerenciadorTarefas = new FormGerenciadorTarefas();
        formGerenciadorTarefas.setVisible(true);
    }
}