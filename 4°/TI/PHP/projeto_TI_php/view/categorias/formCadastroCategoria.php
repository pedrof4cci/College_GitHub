<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Categorias</title>
</head>
<body>
    <form action="" method="POST">
        <div>
            <h1>Cadastro de Categorias</h1>
            <p>Informe todos os campos solicitados.</p>
        </div>
        <div>
            <label for="nome">Nome:</label>
            <input type="text" name="nome" id="nome" required>
        </div>
        <div>
            <label for="descricao">Descrição:</label>
            <input type="text" name="descricao" id="descricao">
        </div>
        <input type="hidden" name="acao" value="create">
        <div>
            <input type="submit" value="Cadastrar">
        </div>
    </form>
    <p><a href="../index.php">Voltar</a></p>
</body>
</html>

