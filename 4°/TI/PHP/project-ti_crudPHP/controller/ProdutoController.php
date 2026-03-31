<?php
    require_once __DIR__ . "/../model/Produto.php";
    require_once __DIR__ . "/../dao/ProdutoDAO.php";

    
    $produto = new Produto();
    $produtoDAO = new ProdutoDAO();

    
    $acao = $_GET['acao'] ?? '';

    if ($acao == 'salvar') {
        
        $produto->setNome($_POST['nome']);
        $produto->setPreco($_POST['preco']);
        $produto->setIdCategoria($_POST['id_categoria']);

      
        if (!empty($_POST['id'])) {
            $produto->setId($_POST['id']);
            $produtoDAO->atualizar($produto);
        } else {
            $produtoDAO->inserir($produto);
        }

        header("Location: ../views/index.php");

    } elseif ($acao == 'excluir') {

        $id = $_GET['id'];
        $produtoDAO->deletar($id);
        
        header("Location: ../views/index.php");
    }