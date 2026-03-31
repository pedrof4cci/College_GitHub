<?php
    require_once __DIR__ . "/../config/Conexao.php";

class CategoriaDAO {
    public function listar() {
        $sql = "SELECT * FROM categoria ORDER BY nome ASC";
        $stmt = Conexao::getConexao()->prepare($sql);
        $stmt->execute();
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }
}