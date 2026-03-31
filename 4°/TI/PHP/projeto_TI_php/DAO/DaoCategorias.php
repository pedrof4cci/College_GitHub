<?php

require_once __DIR__ . '/../config/Database.php';
require_once __DIR__ . '/../model/Categorias.php';

class DaoCategorias{
    
    private $conn;

    public function __construct(){
        $this->conn = Database::conectar();
    }


    public function create(Categoria $categoria){
        $sql = "INSERT INTO categorias (nome, descricao) VALUES (:nome, :descricao)";

        $stmt = $this->conn->prepare($sql);

        return $stmt->execute([
            ':nome' => $categoria->getNome(),
            ':descricao' => $categoria->getDescricao(),
        ]);
    }

    public function listAll(){
        $sql = "SELECT id, nome, descricao FROM categorias ORDER BY nome ASC";

        $stmt = $this->conn->query($sql);

        return $stmt->fetchAll();
    }
}
