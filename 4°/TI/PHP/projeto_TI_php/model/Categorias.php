<?php
class Categoria{
    public $id;
    public $nome;
    public $descricao;


    public function setId($id){
        $this->id = $id;
    }
    public function setNome($nome){
        $this->nome = $nome;
    }
    public function setDescricao($descricao){
        $this->descricao = $descricao;
    }

    public function getId(){
        return $this->id;
    }
    public function getNome(){
        return $this->nome;
    }
    public function getDescricao(){
        return $this->descricao;
    }
}