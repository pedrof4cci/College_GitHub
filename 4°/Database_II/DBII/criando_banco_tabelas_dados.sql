create database DatabaseII;
use databaseii;

create table tb_curso(
	cd_curso INT primary key,
    nm_curso VARCHAR(50),
    ds_horario VARCHAR(10)
);

create table tb_responsavel(
	cd_responsavel INT primary key,
    nm_responsavel VARCHAR(30),
    ds_sobrenome VARCHAR(45),
    tb_responsavelcol VARCHAR(20)
);

create table tb_aluno(
	cd_aluno INT primary key,
    nm_aluno VARCHAR(30),
    ds_sobrenome VARCHAR(50),
    nr_cpf VARCHAR(14),
    id_curso INT,
    id_responsavel INT,
    vl_mensalidade VARCHAR(45),
    tb_alunocol DECIMAL(10,2),
    dt_matricula DATE,
    tb_curso_cd_curso INT,
    tb_responsavel_cd_responsavel INT,
    foreign key (tb_curso_cd_curso) references tb_curso(cd_curso),
    foreign key (tb_responsavel_cd_responsavel) references tb_responsavel(cd_responsavel)
);

	-- insert na tabela de cursos
insert into tb_curso(cd_curso, nm_curso, ds_horario) values (1, 'Informatica', 'Integral'); 
insert into tb_curso(cd_curso, nm_curso, ds_horario) values (2, 'Desenvolvimento de Sistemas', 'Noite'); 
insert into tb_curso(cd_curso, nm_curso, ds_horario) values (3, 'Administração', 'Manhã'); 
insert into tb_curso(cd_curso, nm_curso, ds_horario) values (4, 'Engenharia de Software', 'Noite'); 
select * from tb_curso;

	-- insert na tabela de responsavel
insert into tb_responsavel (cd_responsavel, nm_responsavel, ds_sobrenome, tb_responsavelcol) values (1, 'João', 'Silva', 'valor1');
insert into tb_responsavel (cd_responsavel, nm_responsavel, ds_sobrenome, tb_responsavelcol) values (2, 'Maria', 'Souza', 'valor2');
insert into tb_responsavel (cd_responsavel, nm_responsavel, ds_sobrenome, tb_responsavelcol) values (3, 'Carlos', 'Oliveira', 'valor3');
insert into tb_responsavel (cd_responsavel, nm_responsavel, ds_sobrenome, tb_responsavelcol) values (4, 'Ana', 'Pereira', 'valor4');
insert into tb_responsavel (cd_responsavel, nm_responsavel, ds_sobrenome, tb_responsavelcol) values (5, 'Lucas', 'Ferreira', 'valor5');
select * from tb_responsavel

	-- insert na tabela de aluno
insert into tb_aluno (cd_aluno, nm_aluno, ds_sobrenome, nr_cpf, id_curso, id_responsavel, vl_mensalidade, tb_alunocol, dt_matricula, tb_curso_cd_curso, tb_responsavel_cd_responsavel) 
values (1, 'Pedro', 'Lopes', '01234589', 2, 1, 'R$500', 123.45, '2026-03-20', 2, 1);
select * from tb_aluno;
