USE HelpDesk;

INSERT INTO Pessoa (codPessoa, nome) VALUES
(1, 'Maria Silva'),
(2, 'João Pereira'),
(3, 'Carlos Souza'),
(4, 'Ana Oliveira'),
(5, 'Lucas Costa'),
(6, 'Marina Rocha'),
(7, 'Felipe Gomes'),
(8, 'Sofia Lima'),
(9, 'Rafael Alves'),
(10, 'Beatriz Nunes');

INSERT INTO Cliente (codPessoa, numCliente) VALUES
(1, 1001),
(5, 1002),
(8, 1003);

INSERT INTO Atendente (codPessoa, numAtendente) VALUES
(2, 2001),
(4, 2002);

INSERT INTO Tecnico (codPessoa, numTecnico) VALUES
(3, 3001),
(6, 3002),
(9, 3003);

INSERT INTO Equipamento (codEquipamento, descricao) VALUES
(1, 'Notebook Dell Inspiron 15'),
(2, 'Impressora HP LaserJet'),
(3, 'Roteador Cisco RV340'),
(4, 'Monitor Samsung 24"'),
(5, 'Scanner Epson DS-570');

INSERT INTO Pedido (codPedido, data, descricao, codCliente) VALUES
(1, '2025-10-01', 'Erro ao inicializar o sistema operacional. Tela fica preta após login.', 1),
(2, '2025-10-05', 'Impressora retorna erro de papel apesar de não haver atolamento.', 5),
(3, '2025-10-10', 'Solicitação de instalação e configuração do software antivírus.', 1),
(4, '2025-10-12', 'Roteador com perda de conexão intermitente durante o dia.', 5),
(5, '2025-10-15', 'Solicitação de digitalização em lote e integração com servidor.', 8);

INSERT INTO Pedido_Equipamento (codPedido, codEquipamento) VALUES
(1, 1),
(2, 2),
(3, 1),
(4, 3),
(5, 5);

INSERT INTO HistoricoAtendimento (codHistorico, codPedido, codPessoa, descricao, data) VALUES
(1, 1, 1, 'Cliente reportou que o problema ocorre ao iniciar o Windows 10.', '2025-10-01 09:15:00'),
(2, 1, 2, 'Atendente verificou logs e abriu chamado para técnico.', '2025-10-01 10:00:00'),
(3, 1, 3, 'Técnico realizou restauração de inicialização e atualizou drivers.', '2025-10-02 14:30:00'),
(4, 2, 5, 'Cliente relatou falha na impressão colorida e mensagem de erro.', '2025-10-05 11:00:00'),
(5, 2, 4, 'Atendente orientou verificação de cartuchos e agendou visita técnica.', '2025-10-05 11:30:00'),
(6, 3, 1, 'Cliente solicitou instalação de antivírus corporativo.', '2025-10-10 08:50:00'),
(7, 3, 6, 'Técnico instalou antivírus e realizou configuração de políticas.', '2025-10-10 15:20:00'),
(8, 4, 5, 'Cliente relatou quedas de internet em horários de pico.', '2025-10-12 09:40:00'),
(9, 4, 9, 'Técnico substituiu cabo e atualizou firmware do roteador.', '2025-10-12 13:10:00'),
(10, 5, 8, 'Solicitação inicial para digitalização de documentos.', '2025-10-15 10:05:00');

INSERT INTO Situacao (codSituacao, nome) VALUES
(1, 'Aberto'),
(2, 'Em andamento'),
(3, 'Pendente'),
(4, 'Resolvido'),
(5, 'Fechado');

INSERT INTO Pedido_Situacao (codPedido, codSituacao, dataHora) VALUES
(1, 1, '2025-10-01 09:15:00'), -- Aberto
(1, 2, '2025-10-01 10:00:00'), -- Em andamento
(1, 4, '2025-10-02 16:45:00'), -- Resolvido
(2, 1, '2025-10-05 11:00:00'),
(2, 3, '2025-10-05 11:30:00'),
(3, 1, '2025-10-10 08:50:00'),
(3, 4, '2025-10-10 16:00:00'),
(4, 1, '2025-10-12 09:40:00'),
(4, 2, '2025-10-12 12:00:00'),
(4, 4, '2025-10-12 14:30:00'),
(5, 1, '2025-10-15 10:05:00'),
(5, 2, '2025-10-15 11:20:00');

INSERT INTO TipoServico (codTipo, nome) VALUES
(1, 'Instalação'),
(2, 'Manutenção'),
(3, 'Suporte Remoto'),
(4, 'Configuração de Rede');

INSERT INTO Pedido_TipoServico (codPedido, codTipo) VALUES
(1, 2), -- Manutenção
(2, 2), -- Manutenção
(3, 1), -- Instalação
(3, 3), -- Suporte Remoto
(4, 4), -- Configuração de Rede
(5, 1); -- Instalação (integração do scanner)

INSERT INTO Categoria (codCategoria, nome) VALUES
(1, 'Hardware'),
(2, 'Software'),
(3, 'Rede'),
(4, 'Serviços');

INSERT INTO SubCategoria (codSubCategoria, nome, codCategoria) VALUES
(1, 'Periféricos', 1),
(2, 'Computadores', 1),
(3, 'Sistemas Operacionais', 2),
(4, 'Aplicativos', 2),
(5, 'Infraestrutura de Rede', 3),
(6, 'Segurança', 4);

INSERT INTO ItemCategoria (codItem, nome, codSubCategoria) VALUES
(1, 'Instalação de driver de impressora', 1),
(2, 'Substituição de HD/SSD', 2),
(3, 'Reparo de boot / MBR', 3),
(4, 'Instalação de antivírus', 4),
(5, 'Configuração de roteador', 5),
(6, 'Análise de vulnerabilidade', 6);