create database db_farmacia_bem_estar;
use db_farmacia_bem_estar;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255),
    valor decimal(9,2),
    quantidade int,
    marca varchar(255),
    categoria_id bigint,
    
    primary key (id),
    foreign key (categoria_id) references tb_categorias(id)
);

create table tb_categorias(
	id bigint auto_increment,
    nome_categoria varchar(255),
    setor varchar(255),
    
    primary key(id)
);

insert into tb_categorias(nome_categoria, setor) values("Remedios","Balcão");
insert into tb_categorias(nome_categoria, setor) values("Esportes","Setor saúde academia");
insert into tb_categorias(nome_categoria, setor) values("Soluões naturais","Homeopátia");
insert into tb_categorias(nome_categoria, setor) values("Infantil","Para crianças");
insert into tb_categorias(nome_categoria, setor) values("Equipamentos","Ergonomia");

insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Creatina",85.99,15,"Grouf", 2);
insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Paracetamal",15.58,25,"Gen", 1);
insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Xarope Tia Chica",10.45,5,"Tia Chica", 3);
insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Fralda",64.78,45,"Pamper", 4);
insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Tala",20.47,4,"Saúde+", 5);
insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Mamadeira",8.94,10,"Mamio", 4);
insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Própoles",4.78,8,"Mel da Mãe", 3);
insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Durateeston",150,2,"Marcão", 2);
insert into tb_produtos(nome, valor, quantidade, marca, categoria_id) values("Paracetabem",20.79,12,"Gen", 1);


select * from tb_produtos where valor > 50;
select * from tb_produtos where valor between 5 and 60;
select * from tb_produtos where nome like "%c%" ;

select * from tb_produtos inner join tb_categorias on tb_categorias.id = tb_produtos.categoria_id;
select * from tb_produtos inner join tb_categorias on tb_categorias.id = tb_produtos.categoria_id where  nome_categoria="esportes"