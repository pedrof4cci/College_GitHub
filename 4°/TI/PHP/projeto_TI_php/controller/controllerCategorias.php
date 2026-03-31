<?php

require_once __DIR__ . '/../dao/DaoCategorias.php';

$dao = new DaoCategorias();

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $acao = $_POST['acao'] ?? '';

    if ($acao === 'create') {
        $nome = trim((string)($_POST['nome'] ?? ''));
        $descricao = trim((string)($_POST['descricao'] ?? ''));

        if ($nome === '') {
            http_response_code(400);
            echo 'Nome é obrigatório.';
            exit;
        }

        $categoria = new Categoria();
        $categoria->setNome($nome);
        $categoria->setDescricao($descricao);

        $dao->create($categoria);

        header('Location: controllerCategorias.php?acao=listAll');
        exit;
    }

    http_response_code(400);
    echo 'Ação inválida.';
    exit;
}

$acao = $_GET['acao'] ?? 'formCreate';

if ($acao === 'listAll') {
    $categorias = $dao->listAll();
    require __DIR__ . '/../view/categorias/listarCategorias.php';
    exit;
}

if ($acao === 'formCreate') {
    require __DIR__ . '/../view/categorias/formCadastroCategoria.php';
    exit;
}

http_response_code(404);
echo 'Página não encontrada.';

