create database escola;

use escola;

create table tbl_usuariosistema(
	id_usuario int primary key auto_increment,
	nomeLogin varchar (64) not null,
	senha varchar (64) not null,
	id_pessoa int not null
);

create table tbl_pessoa(
	id_pessoa int primary key auto_increment,
	nomePessoa varchar (200) not null
);

create table tbl_Aluno(
	id_aluno int primary key auto_increment,
	rm int not null,
	nomeAluno varchar (200) not null,
	id_pessoa int not null
);

alter table tbl_usuariosistema 
add constraint fk_usuariosistema_pessoa
foreign key (id_pessoa)
references tbl_pessoa(id_pessoa);

alter table tbl_Aluno
add constraint fk_aluno_pessoa
foreign key (id_pessoa)
references tbl_pessoa (id_pessoa);
