package model;

public class Tarefa {
    public String titulo;
    public String descricao;
    public boolean status;


    public Tarefa(String tarefaTitulo1, String tarefaDescricao1){
    }

    public Tarefa(String titulo, String descricao, boolean status){
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = true;
    }

    public String getTitulo(){ return titulo; }

    public String getDescricao(){ return descricao; }





}
