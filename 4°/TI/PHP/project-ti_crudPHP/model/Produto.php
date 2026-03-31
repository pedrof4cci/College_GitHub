<?php
    class Produto {
        private $id;
        private $nome;
        private $preco;
        private $id_categoria;


        //setters
        public function setNome($nome){
            $this->nome=$nome;
        }
        public function setPreco($preco){
            $this->preco=$preco;
        }
        public function setId($id){
            $this->id=$id;
        }
        public function setIdCategoria($id_categoria){
            $this->id_categoria = $id_categoria;
        }



        //getters
        public function getNome(){
            return $this->nome;
        }
        public function getPreco(){
            return $this->preco;
        }
        public function getId(){
            return $this->id;
        }
        public function getIdCategoria(){
            return $this->id_categoria;
        }

    }


