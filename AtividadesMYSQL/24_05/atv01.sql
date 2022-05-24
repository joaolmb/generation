create database db_quitandaGen;
use db_quitandaGen;

create table tb_produtos (
	id int auto_increment,
    nome varchar(30) not null,
    preco decimal(5,2) not null,
    quantidadeEstoque int,
    setor varchar(30),
    
    primary key(id)
);

insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Banana CAturra", "Hortífruti", 6.98, 30);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Abacaxi", "Hortífruti", 8.99, 32);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Coco Verde", "Hortífruti", 4.99, 20);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Goiaba Vermelha", "Hortífruti", 5.98, 25);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Manga Palmer", "Hortífruti", 3.98, 45);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Doce de Leite", "Doces", 9.99, 8);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Geleia de Mocotó", "Doces", 12, 15);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Provoloner Defumado", "Queijos", 26.98, 10);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Abobrinha Italiana", "Legumes", 3.99, 24);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Batata Asterix", "Legumes", 11.99, 17);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Cenoura Vermelha", "Legumes", 7.99, 13);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Alface Crespa", "Verduras", 4.98, 6);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Coentro", "Verduras", 2.98, 5);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Rabanete", "Verduras", 4.98, 7);
insert into tb_produtos(nome,setor,preco,quantidadeEstoque) values("Rúcula", "Verduras", 6.98, 9);

select * from tb_produtos where setor="hortifruti";
select * from tb_produtos where setor="legumes";

set sql_safe_updates = 0;
delete from tb_produtos where setor="verduras";