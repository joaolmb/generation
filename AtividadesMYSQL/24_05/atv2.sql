create database db_brecho;
use db_brecho;

create table tb_produtos (
	id int auto_increment,
    nome varchar(30) not null,
    preco decimal(5,2) not null,
    quantidadeEstoque int,
    tamanho varchar(10),
    
    primary key(id)
);


insert into tb_produtos(nome,tamanho,preco,quantidadeEstoque) values ("Camisa listrada", "GG", 20.99, 3);
insert into tb_produtos(nome,tamanho,preco,quantidadeEstoque) values ("Camisa listrada", "M", 40, 3);
insert into tb_produtos(nome,tamanho,preco,quantidadeEstoque) values ("Camisa xadrez", "XG", 85.48, 1);
insert into tb_produtos(nome,tamanho,preco,quantidadeEstoque) values ("Calça Jeans", "40", 120.18, 2);
insert into tb_produtos(nome,tamanho,preco,quantidadeEstoque) values ("Calça Cargo", "46", 150.87, 3);
insert into tb_produtos(nome,tamanho,preco,quantidadeEstoque) values ("Short Jeans", "38", 89.98, 5);
insert into tb_produtos(nome,tamanho,preco,quantidadeEstoque) values ("Blusa Moletom", "G", 120.99, 4);
insert into tb_produtos(nome,tamanho,preco,quantidadeEstoque) values ("Vestido", "P", 116.33, 1);

select * from tb_produtos where preco>50;
select * from tb_produtos where preco<50;

select * from tb_produtos where id=2;

update tb_produtos set nome="Camisa lisa" where id=2;

delete from tb_produtos where id=2;
delete from tb_produtos where id=3;