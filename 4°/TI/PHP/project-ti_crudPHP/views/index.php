<?php
    require_once "../dao/ProdutoDAO.php";
    require_once "../dao/CategoriaDAO.php";
    require_once "../model/Produto.php";

    $pDAO = new ProdutoDAO();
    $cDAO = new CategoriaDAO();

    $produtoEditando = null;

    if (isset($_GET['editar_id'])) {
        $produtoEditando = $pDAO->buscarPorId($_GET['editar_id']);
    }

    $produtos = $pDAO->listar();      
    $categorias = $cDAO->listar();    
?>



<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>Gerenciador de Produtos</title>
    <link rel="stylesheet" href="../style/style.css">
</head>
<body class="container mt-5">

    <h2 class="mb-4">Cadastro de Produto</h2>
    
    <form action="../controller/ProdutoController.php?acao=salvar" method="POST" class="row-form">
        <input type="hidden" name="id" value="<?= $produtoEditando ? $produtoEditando['id'] : '' ?>">

        <div class="form-group">
            <label>Nome do Produto</label>
            <input type="text" name="nome" value="<?= $produtoEditando ? $produtoEditando['nome'] : '' ?>" required>
        </div>

        <div class="form-group">
            <label>Preço</label>
            <input type="number" step="0.01" name="preco" value="<?= $produtoEditando ? $produtoEditando['preco'] : '' ?>" required>
        </div>

        <div class="form-group">
            <label>Categoria</label>
            <select name="id_categoria" required>
                <option value="">Selecione...</option>
                <?php foreach($categorias as $cat): ?>
                    <option value="<?= $cat['id'] ?>" 
                        <?= ($produtoEditando && $produtoEditando['id_categoria'] == $cat['id']) ? 'selected' : '' ?>>
                        <?= $cat['nome'] ?>
                    </option>
                <?php endforeach; ?>
            </select>
        </div>

        <div>
            <button type="submit" class="btn-save">
            <?= $produtoEditando ? 'Atualizar' : 'Salvar' ?>
            </button>
        </div>
    </form>

    <hr>

    <h2 class="mt-5">Listagem de Produtos</h2>
    
    <table class="table table-striped table-hover mt-3">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Preço</th>
                <th>Categoria</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach($produtos as $p): ?>
            <tr>
                <td><?= $p['id'] ?></td>
                <td><?= $p['nome'] ?></td>
                <td>R$ <?= number_format($p['preco'], 2, ',', '.') ?></td>
                <td><?= $p['categoria_nome'] ?></td>
                <td>
                    <a href="index.php?editar_id=<?= $p['id'] ?>" class="btn btn-sm btn-warning">Editar</a>
                    
                    <a href="../controller/ProdutoController.php?acao=excluir&id=<?= $p['id'] ?>" 
                    class="btn btn-sm btn-danger" 
                    onclick="return confirm('Tem certeza que deseja excluir?')">Excluir</a>
                </td>
            </tr>
            <?php endforeach; ?>
        </tbody>
    </table>

</body>
</html>