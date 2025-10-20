create database controle_estoque;
use controle_estoque;

create table produto(
	id int primary key auto_increment,
    nome varchar(100) not null,
    quantidade int not null,
    preco decimal (5,2) not null
);

insert into produto (nome, quantidade, preco) 
value ("Mouse", 2, 25.78);

select * from produto;
