<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Categorias</title>
</head>
<body>
    <h1>Lista de Categorias</h1>

    <p>
        <a href="controllerCategorias.php?acao=formCreate">Cadastrar categoria</a> |
        <a href="../index.php">Voltar</a>
    </p>

    <table border="1" cellpadding="6" cellspacing="0">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Descrição</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach (($categorias ?? []) as $itemCategoria): ?>
                <tr>
                    <td><?= htmlspecialchars((string)$itemCategoria['id']) ?></td>
                    <td><?= htmlspecialchars((string)$itemCategoria['nome']) ?></td>
                    <td><?= htmlspecialchars((string)($itemCategoria['descricao'] ?? '')) ?></td>
                </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</body>
</html>

