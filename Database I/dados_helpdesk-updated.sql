-- Inserts for Pessoa
INSERT INTO Pessoa (nome) VALUES ('Alice');
INSERT INTO Pessoa (nome) VALUES ('Bob');
INSERT INTO Pessoa (nome) VALUES ('Carol');

-- Inserts for Cliente
INSERT INTO Cliente (codPessoa, numCliente) VALUES (1, 1001);
INSERT INTO Cliente (codPessoa, numCliente) VALUES (2, 1002);
INSERT INTO Cliente (codPessoa, numCliente) VALUES (3, 1003);

-- Inserts for Atendente
INSERT INTO Atendente (codPessoa, numAtendente) VALUES (1, 2001);
INSERT INTO Atendente (codPessoa, numAtendente) VALUES (2, 2002);
INSERT INTO Atendente (codPessoa, numAtendente) VALUES (3, 2003);

-- Inserts for Tecnico
INSERT INTO Tecnico (codPessoa, numTecnico) VALUES (1, 3001);
INSERT INTO Tecnico (codPessoa, numTecnico) VALUES (2, 3002);
INSERT INTO Tecnico (codPessoa, numTecnico) VALUES (3, 3003);

-- Inserts for Equipamento
INSERT INTO Equipamento (descricao) VALUES ('Impressora');
INSERT INTO Equipamento (descricao) VALUES ('Computador');
INSERT INTO Equipamento (descricao) VALUES ('Monitor');

-- Inserts for Pedido
INSERT INTO Pedido (data, descricao, codCliente) VALUES ('2025-10-28', 'Pedido A', 1);
INSERT INTO Pedido (data, descricao, codCliente) VALUES ('2025-10-29', 'Pedido B', 2);
INSERT INTO Pedido (data, descricao, codCliente) VALUES ('2025-10-30', 'Pedido C', 3);

-- Inserts for Pedido_Equipamento
INSERT INTO Pedido_Equipamento (codPedido, codEquipamento) VALUES (1, 1);
INSERT INTO Pedido_Equipamento (codPedido, codEquipamento) VALUES (2, 2);
INSERT INTO Pedido_Equipamento (codPedido, codEquipamento) VALUES (3, 3);

-- Inserts for HistoricoAtendimento
INSERT INTO HistoricoAtendimento (codPedido, codPessoa, descricao, data) VALUES (1, 1, 'Atendimento inicial', '2025-10-28 10:00:00');
INSERT INTO HistoricoAtendimento (codPedido, codPessoa, descricao, data) VALUES (2, 2, 'Verificação feita', '2025-10-29 11:00:00');
INSERT INTO HistoricoAtendimento (codPedido, codPessoa, descricao, data) VALUES (3, 3, 'Finalizado', '2025-10-30 12:00:00');

-- Inserts for Situacao
INSERT INTO Situacao (nome) VALUES ('Aberto');
INSERT INTO Situacao (nome) VALUES ('Em andamento');
INSERT INTO Situacao (nome) VALUES ('Fechado');

-- Inserts for Pedido_Situacao
INSERT INTO Pedido_Situacao (codPedido, codSituacao, dataHora) VALUES (1, 1, '2025-10-28 10:05:00');
INSERT INTO Pedido_Situacao (codPedido, codSituacao, dataHora) VALUES (2, 2, '2025-10-29 11:05:00');
INSERT INTO Pedido_Situacao (codPedido, codSituacao, dataHora) VALUES (3, 3, '2025-10-30 12:05:00');

-- Inserts for TipoServico
INSERT INTO TipoServico (nome) VALUES ('Suporte');
INSERT INTO TipoServico (nome) VALUES ('Manutenção');
INSERT INTO TipoServico (nome) VALUES ('Instalação');

-- Inserts for Pedido_TipoServico
INSERT INTO Pedido_TipoServico (codPedido, codTipo) VALUES (1, 1);
INSERT INTO Pedido_TipoServico (codPedido, codTipo) VALUES (2, 2);
INSERT INTO Pedido_TipoServico (codPedido, codTipo) VALUES (3, 3);

-- Inserts for Categoria
INSERT INTO Categoria (nome) VALUES ('Hardware');
INSERT INTO Categoria (nome) VALUES ('Software');
INSERT INTO Categoria (nome) VALUES ('Rede');

-- Inserts for SubCategoria
INSERT INTO SubCategoria (nome, codCategoria) VALUES ('Impressora', 1);
INSERT INTO SubCategoria (nome, codCategoria) VALUES ('Sistema Operacional', 2);
INSERT INTO SubCategoria (nome, codCategoria) VALUES ('Wi-Fi', 3);

-- Inserts for ItemCategoria
INSERT INTO ItemCategoria (nome, codSubCategoria) VALUES ('HP LaserJet', 1);
INSERT INTO ItemCategoria (nome, codSubCategoria) VALUES ('Windows 10', 2);
INSERT INTO ItemCategoria (nome, codSubCategoria) VALUES ('TP-Link', 3);
