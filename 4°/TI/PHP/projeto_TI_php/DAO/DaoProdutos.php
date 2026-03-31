<?php

require_once __DIR__ . '/../config/Database.php';
require_once __DIR__ . '/../model/Produtos.php';

class DaoProdutos{
    private $conn;

    public function __construct(){
        $this->conn = Database::conectar();
    }

    public function create(Produtos $produto){
        $sql = "INSERT INTO produtos (nome, descricao, preco, estoque, categoria_id)
                VALUES (:nome, :descricao, :preco, :estoque, :categoria_id)";

        $stmt = $this->conn->prepare($sql);

        return $stmt->execute([
            ':nome' => $produto->getNome(),
            ':descricao' => $produto->getDescricao(),
            ':preco' => $produto->getPreco(),
            ':estoque' => $produto->getEstoque(),
            ':categoria_id' => $produto->getCategoria_id(),
        ]);
    }

    public function listAll(){
        $sql = "SELECT p.id, p.nome, p.descricao, p.preco, p.estoque, p.categoria_id,
                       c.nome AS categoria_nome
                FROM produtos p
                LEFT JOIN categorias c ON c.id = p.categoria_id
                ORDER BY p.nome ASC";

        $stmt = $this->conn->query($sql);

        return $stmt->fetchAll();
    }
}
