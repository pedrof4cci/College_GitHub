<?php
    require_once __DIR__ . "/../config/Conexao.php";

    class ProdutoDAO{
        public function inserir(Produto $p) {
            try {
                $sql = "INSERT INTO produto (nome, preco, id_categoria)
                        VALUES (:nome, :preco, :id_cat)";

                $stmt = Conexao::getConexao()->prepare($sql);

                $stmt->bindValue(":nome", $p->getNome());
                $stmt->bindValue(":preco", $p->getPreco());
                $stmt->bindValue(":id_cat", $p->getIdCategoria());

                return $stmt->execute();

            } catch (PDOException $e) {
                echo "Erro ao inserir: " . $e->getMessage();
            }
        }

      
        public function listar() {
            $sql = "SELECT p.*, c.nome as categoria_nome 
                    FROM produto p 
                    INNER JOIN categoria c ON p.id_categoria = c.id";
            $stmt = Conexao::getConexao()->prepare($sql);
            $stmt->execute();
            return $stmt->fetchAll(PDO::FETCH_ASSOC); // Retorna um array com os dados
        }

      
        public function deletar($id) {
            $sql = "DELETE FROM produto WHERE id = :id";
            $stmt = Conexao::getConexao()->prepare($sql);
            $stmt->bindValue(":id", $id);
            return $stmt->execute();
        }

        
        public function atualizar(Produto $p) {
            $sql = "UPDATE produto SET nome = :nome, preco = :preco, id_categoria = :id_cat 
                    WHERE id = :id";
            $stmt = Conexao::getConexao()->prepare($sql);
            $stmt->bindValue(":nome", $p->getNome());
            $stmt->bindValue(":preco", $p->getPreco());
            $stmt->bindValue(":id_cat", $p->getIdCategoria());
            $stmt->bindValue(":id", $p->getId());
            return $stmt->execute();
        }


        public function buscarPorId($id) {
            try {
                $sql = "SELECT * FROM produto WHERE id = :id";
                $stmt = Conexao::getConexao()->prepare($sql);
                $stmt->bindValue(":id", $id);
                $stmt->execute();
                
                // Usamos fetch() pois esperamos apenas UM resultado, não uma lista
                return $stmt->fetch(PDO::FETCH_ASSOC); 
                
            } catch (PDOException $e) {
                echo "Erro ao buscar produto: " . $e->getMessage();
                return null;
            }
        }
    }








