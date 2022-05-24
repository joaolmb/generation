create database db_escola;
use db_escola;

create table tb_alunos (
	id int auto_increment,
    nome varchar(50) not null,
    nota decimal(3,1) not null,
    idade int not null,
    materia varchar(20),
    
    primary key(id)
);

insert into tb_alunos(nome, idade, materia, nota) values ("João Marques", 20, "Matemática", 8.9);
insert into tb_alunos(nome, idade, materia, nota) values ("João Paz", 21, "Português", 8.6);
insert into tb_alunos(nome, idade, materia, nota) values ("João Bento", 18, "Geográfia", 4.56);
insert into tb_alunos(nome, idade, materia, nota) values ("João Lucas", 20, "Inglês", 8.7);
insert into tb_alunos(nome, idade, materia, nota) values ("João Souza", 21, "História", 9.4);
insert into tb_alunos(nome, idade, materia, nota) values ("João Neres", 21, "Física", 7.5);
insert into tb_alunos(nome, idade, materia, nota) values ("João Victor", 19, "Filosofia", 7.8);
insert into tb_alunos(nome, idade, materia, nota) values ("João Lima", 22, "Ed. Física", 10.0);

select * from tb_alunos where nota>7;
select * from tb_alunos where nota<7;

update tb_alunos set nota=7.56 where id=2;

