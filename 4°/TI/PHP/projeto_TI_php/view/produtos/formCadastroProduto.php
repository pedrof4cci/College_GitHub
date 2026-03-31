<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Produtos</title>
</head>
<body>
    <form action="" method="POST">
        <div>
            <h1>Cadastro de Produtos</h1>
            <p>Informe todos os campos solicitados.</p>
        </div>

        <div>
            <label for="nome">Nome:</label>
            <input type="text" name="nome" id="nome" required>
        </div>
        <div>
            <label for="preco">Preço:</label>
            <input type="text" name="preco" id="preco" required>
        </div>
        <div>
            <label for="estoque">Estoque:</label>
            <input type="number" name="estoque" id="estoque" required>
        </div>
        <div>
            <label for="categoria_id">Categoria:</label>
            <select name="categoria_id" id="categoria_id" required>
                <option value="">Selecione...</option>
                <?php foreach (($categorias ?? []) as $categoria): ?>
                    <option value="<?= htmlspecialchars((string)$categoria['id']) ?>">
                        <?= htmlspecialchars((string)$categoria['nome']) ?>
                    </option>
                <?php endforeach; ?>
            </select>
        </div>
        <div>
            <label for="descricao">Descrição:</label>
            <textarea name="descricao" id="descricao"></textarea>
        </div>

        <input type="hidden" name="acao" value="create">
        <div>
            <input type="submit" value="Cadastrar">
        </div>
    </form>

    <p>
        <a href="controllerProdutos.php?acao=listAll">Listar produtos</a> |
        <a href="../index.php">Voltar</a>
    </p>
</body>
</html>

