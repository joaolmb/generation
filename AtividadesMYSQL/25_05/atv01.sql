create database db_generation_game_online;

use db_generation_game_online;

-- Criando tabela de classes
create table tb_classes (
	id bigint auto_increment not null,
    nome_classe varchar(255) not null,
    usa_magia boolean, 
    
    primary key (id)
);

-- Criando tabela de personagens
create table tb_personagens (
	id int auto_increment,
	nome varchar(255) not null,
    poder_ataque int,
    poder_defesa int,
    vestimenta varchar(255),
    
    classes_id bigint,
    
    primary key(id),
    foreign key (classes_id) references tb_classes(id)
);

-- Inserindo classes
insert into tb_classes(nome_classe, usa_magia) values ("Mago", true);
insert into tb_classes(nome_classe, usa_magia) values ("Assassino", false);
insert into tb_classes(nome_classe, usa_magia) values ("Curandeiro", true);
insert into tb_classes(nome_classe, usa_magia) values ("Paladino", false);
insert into tb_classes(nome_classe, usa_magia) values ("Xamã", true);
insert into tb_classes(nome_classe, usa_magia) values ("Lutador", false);
insert into tb_classes(nome_classe, usa_magia) values ("Bardo", true);
insert into tb_classes(nome_classe, usa_magia) values ("Bárbaro", false);
insert into tb_classes(nome_classe, usa_magia) values ("Guerreiro", false);

-- Inserindo personagens
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("Luís",85,75,"Armaduras pesadas",9);
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("João",85,75,"Armaduras pesadas",9);
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("Rick",70,60,"Armaduras leves",2);
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("Frodo",50,55,"Armaduras medias",3);
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("Shazam,",78,70,"Armaduras leves sem proteção",4);
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("Strange",70,60,"Armaduras levemente protegidas",5);
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("Smigol",90,80,"Armaduras pesadas e protegidas",6);
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("Aragorn",65,75,"Armaduras medias",7);
insert into tb_personagens(nome, poder_ataque, poder_defesa, vestimenta, classes_id) values("Mark",95,80,"Armaduras fortes",8);

-- Adaptei essa parte para cair no meu range
select * from tb_personagens where poder_ataque>80;
select * from tb_personagens where poder_defesa>65 and poder_defesa<80;
select * from tb_personagens where nome like '%c%';

-- Inner join com todos campos
select * from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.classes_id;
-- Inner join com apenas uma classe
select * from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.classes_id where nome_classe = "guerreiro";