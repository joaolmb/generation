create database db_ecommerce;

create table tb_produtos (
	id int auto_increment,
    nome_produto varchar(30) not null,
    marca varchar(30) not null,
    valor decimal(6,2),
    tamanho int,
	
    primary key (id)
);

insert into tb_produtos(nome_produto, marca, valor, tamanho) values ("NikeCourt React Vapor Nitro","Nike",1049.99,36);
insert into tb_produtos(nome_produto, marca, valor, tamanho) values ("Coreracer","Adidas",180.49,43);
insert into tb_produtos(nome_produto, marca, valor, tamanho) values ("Racer Carbon","Fila",809.99,38);
insert into tb_produtos(nome_produto, marca, valor, tamanho) values ("Deviate Nitro","Puma",1199.90,41);
insert into tb_produtos(nome_produto, marca, valor, tamanho) values ("Cyber 2","Olympikus",151.99,40);
insert into tb_produtos(nome_produto, marca, valor, tamanho) values ("Fit","Kappa",59.99,44);
insert into tb_produtos(nome_produto, marca, valor, tamanho) values ("Revolution 6 Next","Nike",224.99,40);
insert into tb_produtos(nome_produto, marca, valor, tamanho) values ("Raiden 3","Asics",251.99,42);

select * from tb_produtos where valor > 500;
select * from tb_produtos where valor < 500;

update tb_produtos set tamanho=40 where id=6;