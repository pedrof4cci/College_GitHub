package dao;

import model.Tarefa;

import java.util.ArrayList;

public class TarefaDao {
    public ArrayList<Tarefa> lista;

    public TarefaDao(){ lista = new ArrayList<>(); }

    public ArrayList<Tarefa> getLista(){ return lista; }

    public void inserirTarefa(Tarefa tarefa){ lista.add(tarefa); }
}
