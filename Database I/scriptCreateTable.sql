create table Produtos(
idProduto int primary key auto_increment,
nomeProduto character(100),
descricao character(100),
preço decimal (10,2),
dataCadastro date
);

create table Clientes(
idCliente int primary key auto_increment,
nomeCliente character(80),
eMail character(150),
telefone character(15),
dataNascimento date,
statusCliente tinyint
);

create table Vendas(
idVenda int primary key auto_increment,
idProduto int,
idCliente int,
valorVenda decimal(65,2),
dataVenda date,
	foreign key (idProduto) references Produtos (idProduto),
	foreign key (idCliente) references Clientes (idCliente)
);

create table Fornecedores(
idFornecedor int primary key auto_increment,
nomeEmpresa character(80),
nomeContato character(80),
telefone character(15),
cidade character(50),
dataRegistro datetime
);

-- ###################
--  inserindo valores
-- ###################

INSERT INTO Produtos (nomeProduto, descricao, preço, dataCadastro) VALUES
('Notebook Dell Inspiron', 'Notebook i7, 16GB RAM, SSD 512GB', 4500.00, '2023-05-12'),
('Mouse Logitech M280', 'Mouse sem fio, 1000 DPI', 120.00, '2023-06-03'),
('Teclado Mecânico Redragon', 'Teclado RGB Switch Blue', 280.00, '2023-07-21'),
('Monitor LG 24"', 'Monitor Full HD, 75Hz, HDMI', 890.00, '2023-08-10'),
('Headset HyperX Cloud II', 'Headset Gamer Surround 7.1', 650.00, '2023-09-15');

INSERT INTO Clientes (nomeCliente, eMail, telefone, dataNascimento, statusCliente) VALUES
('João Silva', 'joao.silva@email.com', '11999998888', '1990-03-15', 1),
('Maria Oliveira', 'maria.oliveira@email.com', '21988887777', '1985-07-22', 1),
('Carlos Souza', 'carlos.souza@email.com', '31977776666', '1992-01-10', 0),
('Fernanda Lima', 'fernanda.lima@email.com', '41966665555', '1998-11-05', 1),
('Ana Paula', 'ana.paula@email.com', '51955554444', '2000-09-25', 1);

INSERT INTO Vendas (idProduto, idCliente, valorVenda, dataVenda) VALUES
(1, 1, 4500.00, '2023-10-01'),
(2, 2, 120.00, '2023-10-05'),
(3, 3, 280.00, '2023-11-11'),
(5, 4, 650.00, '2023-11-20'),
(4, 5, 890.00, '2023-12-02');

INSERT INTO Fornecedores (nomeEmpresa, nomeContato, telefone, cidade, dataRegistro) VALUES
('Tech Distribuidora LTDA', 'Roberto Almeida', '1133332222', 'São Paulo', '2023-05-10 10:30:00'),
('Logitech Brasil', 'Fernanda Costa', '1144445555', 'Campinas', '2023-06-14 14:45:00'),
('Redragon Imports', 'Luiz Henrique', '2133334444', 'Rio de Janeiro', '2023-07-18 09:15:00'),
('LG Eletrônicos', 'Mariana Santos', '3132221111', 'Belo Horizonte', '2023-08-25 16:20:00'),
('HyperX Supplies', 'Ricardo Lima', '4135556666', 'Curitiba', '2023-09-05 11:00:00');
