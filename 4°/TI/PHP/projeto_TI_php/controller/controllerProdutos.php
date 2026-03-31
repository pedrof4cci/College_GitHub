<?php

require_once __DIR__ . '/../dao/DaoProdutos.php';
require_once __DIR__ . '/../dao/DaoCategorias.php';

$daoProdutos = new DaoProdutos();
$daoCategorias = new DaoCategorias();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $acao = $_POST['acao'] ?? '';

    if ($acao === 'create') {
        $nome = trim((string)($_POST['nome'] ?? ''));
        $descricao = trim((string)($_POST['descricao'] ?? ''));
        $precoRaw = str_replace(',', '.', (string)($_POST['preco'] ?? ''));
        $estoqueRaw = (string)($_POST['estoque'] ?? '');
        $categoriaIdRaw = (string)($_POST['categoria_id'] ?? '');

        if ($nome === '') {
            http_response_code(400);
            echo 'Nome é obrigatório.';
            exit;
        }

        if ($precoRaw === '' || !is_numeric($precoRaw)) {
            http_response_code(400);
            echo 'Preço inválido.';
            exit;
        }

        if ($estoqueRaw === '' || !is_numeric($estoqueRaw)) {
            http_response_code(400);
            echo 'Estoque inválido.';
            exit;
        }

        if ($categoriaIdRaw === '' || !ctype_digit($categoriaIdRaw)) {
            http_response_code(400);
            echo 'Categoria inválida.';
            exit;
        }

        $produto = new Produtos();
        $produto->setNome($nome);
        $produto->setDescricao($descricao);
        $produto->setPreco((float)$precoRaw);
        $produto->setEstoque((int)$estoqueRaw);
        $produto->setCategoria_id((int)$categoriaIdRaw);

        $daoProdutos->create($produto);

        header('Location: controllerProdutos.php?acao=listAll');
        exit;
    }

    http_response_code(400);
    echo 'Ação inválida.';
    exit;
}

$acao = $_GET['acao'] ?? 'formCreate';

if ($acao === 'listAll') {
    $produtos = $daoProdutos->listAll();
    require __DIR__ . '/../view/produtos/listarProdutos.php';
    exit;
}

if ($acao === 'formCreate') {
    $categorias = $daoCategorias->listAll();
    require __DIR__ . '/../view/produtos/formCadastroProduto.php';
    exit;
}

http_response_code(404);
echo 'Página não encontrada.';
