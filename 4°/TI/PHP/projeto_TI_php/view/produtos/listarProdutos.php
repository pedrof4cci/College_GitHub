<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Produtos</title>
</head>
<body>
    <h1>Lista de Produtos</h1>

    <p>
        <a href="controllerProdutos.php?acao=formCreate">Cadastrar produto</a> |
        <a href="../index.php">Voltar</a>
    </p>

    <table border="1" cellpadding="6" cellspacing="0">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Categoria</th>
                <th>Preço</th>
                <th>Estoque</th>
                <th>Descrição</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach (($produtos ?? []) as $produto): ?>
                <tr>
                    <td><?= htmlspecialchars((string)$produto['id']) ?></td>
                    <td><?= htmlspecialchars((string)$produto['nome']) ?></td>
                    <td><?= htmlspecialchars((string)($produto['categoria_nome'] ?? '')) ?></td>
                    <td><?= htmlspecialchars((string)$produto['preco']) ?></td>
                    <td><?= htmlspecialchars((string)$produto['estoque']) ?></td>
                    <td><?= htmlspecialchars((string)($produto['descricao'] ?? '')) ?></td>
                </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</body>
</html>

