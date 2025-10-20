CREATE DATABASE HelpDesk;
USE HelpDesk;

CREATE TABLE Pessoa (
  codPessoa INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255)
);

CREATE TABLE Cliente (
  codPessoa INT PRIMARY KEY,
  numCliente INT,
  FOREIGN KEY (codPessoa) REFERENCES Pessoa(codPessoa)
);
CREATE TABLE Atendente (
  codPessoa INT PRIMARY KEY,
  numAtendente INT,
  FOREIGN KEY (codPessoa) REFERENCES Pessoa(codPessoa)
);

CREATE TABLE Tecnico (
  codPessoa INT PRIMARY KEY,
  numTecnico INT,
  FOREIGN KEY (codPessoa) REFERENCES Pessoa(codPessoa)
);

CREATE TABLE Equipamento (
  codEquipamento INT AUTO_INCREMENT PRIMARY KEY,
  descricao VARCHAR(255)
);

CREATE TABLE Pedido (
  codPedido INT AUTO_INCREMENT PRIMARY KEY,
  data DATE,
  descricao TEXT,
  codCliente INT,
  FOREIGN KEY (codCliente) REFERENCES Cliente(codPessoa)
);

CREATE TABLE Pedido_Equipamento (
  codPedido INT,
  codEquipamento INT,
  PRIMARY KEY (codPedido, codEquipamento),
  FOREIGN KEY (codPedido) REFERENCES Pedido(codPedido),
  FOREIGN KEY (codEquipamento) REFERENCES Equipamento(codEquipamento)
);

CREATE TABLE HistoricoAtendimento (
  codHistorico INT AUTO_INCREMENT PRIMARY KEY,
  codPedido INT,
  codPessoa INT,
  descricao TEXT,
  data DATETIME,
  FOREIGN KEY (codPedido) REFERENCES Pedido(codPedido),
  FOREIGN KEY (codPessoa) REFERENCES Pessoa(codPessoa)
);

CREATE TABLE Situacao (
  codSituacao INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100)
);

CREATE TABLE Pedido_Situacao (
  codPedido INT,
  codSituacao INT,
  dataHora DATETIME,
  FOREIGN KEY (codPedido) REFERENCES Pedido(codPedido),
  FOREIGN KEY (codSituacao) REFERENCES Situacao(codSituacao)
);

CREATE TABLE TipoServico (
  codTipo INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(150)
);

CREATE TABLE Pedido_TipoServico (
  codPedido INT,
  codTipo INT,
  FOREIGN KEY (codPedido) REFERENCES Pedido(codPedido),
  FOREIGN KEY (codTipo) REFERENCES TipoServico(codTipo)
);

CREATE TABLE Categoria (
  codCategoria INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(150)
);

CREATE TABLE SubCategoria (
  codSubCategoria INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(150),
  codCategoria INT,
  FOREIGN KEY (codCategoria) REFERENCES Categoria(codCategoria)
);

CREATE TABLE ItemCategoria (
  codItem INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(150),
  codSubCategoria INT,
  FOREIGN KEY (codSubCategoria) REFERENCES SubCategoria(codSubCategoria)
);