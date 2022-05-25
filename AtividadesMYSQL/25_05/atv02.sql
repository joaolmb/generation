create database db_pizzaria_legal;
use db_pizzaria_legal;

-- Crie a tabela tb_categorias e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar as pizzas.
-- Criando tabela de categorias
create table tb_categorias(
	id bigint auto_increment,
    tipo varchar(255) not null,
    borda varchar(255),
    
    primary key(id)
);

-- Crie a tabela tb_pizzas e determine 4 atributos, além da Chave Primária, relevantes aos produtos da pizzaria.
-- Criando tabela de pizzas
create table tb_pizzas (
	id int auto_increment,
    sabor varchar(255),
    tamanho varchar(255) not null,
    valor decimal(5,2) not null,
    tempo time not null,
    categorias_id bigint,
    
    primary key(id),
    foreign key (categorias_id) references tb_categorias(id)
);

-- Insira 5 registros na tabela tb_categorias.
-- Inserindo valores das categorias
insert into tb_categorias(tipo) values("Salgada");
insert into tb_categorias(tipo, borda) values("Salgada", "Catupiry");
insert into tb_categorias(tipo, borda) values("Salgada", "Cheddar");
insert into tb_categorias(tipo) values("Doce");
insert into tb_categorias(tipo, borda) values("Doce", "Nutella");

-- Insira 8 registros na tabela tb_pizzas, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
-- Inserindo pizzas
insert into tb_pizzas(sabor, tamanho, valor, tempo, categorias_id) values("À moda", "Família", 30.50, "00:30:00", 2);
insert into tb_pizzas(sabor, tamanho, valor, tempo, categorias_id) values("Frango com Catupiry", "Gigante", 45.50, "00:45:00", 2);
insert into tb_pizzas(sabor, tamanho, valor, tempo, categorias_id) values("Calabresa", "Gigante", 30.50, "00:50:00", 1);
insert into tb_pizzas(sabor, tamanho, valor, tempo, categorias_id) values("Catuperoni", "Pequena", 15.75, "00:20:00", 3);
insert into tb_pizzas(sabor, tamanho, valor, tempo, categorias_id) values("Margherita", "Super", 35.50, "00:35:00", 1);
insert into tb_pizzas(sabor, tamanho, valor, tempo, categorias_id) values("Ovomaltine", "Média", 25.90, "00:38:00", 4);
insert into tb_pizzas(sabor, tamanho, valor, tempo, categorias_id) values("Morango com Nutella e Sorvete", "Broto", 40, "00:15:00", 5);
insert into tb_pizzas(sabor, tamanho, valor, tempo, categorias_id) values("America", "Gigante", 30.50, "01:00:00", 3);

-- Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.
select * from tb_pizzas where valor > 45;

-- Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00.
select * from tb_pizzas where valor > 50 and valor <100;

-- Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome.
select * from tb_pizzas where sabor like "%m%";

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias.
-- intencionalmente eu trouxe só algumas informações
select tb_pizzas.sabor, tb_pizzas.tamanho, tb_pizzas.valor, tb_categorias.tipo, tb_categorias.borda from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.categorias_id;

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias, onde traga apenas as pizzas que pertençam a uma categoria específica (Exemplo: Todas as pizzas que são doce)
select * from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.categorias_id where tamanho = "gigante"