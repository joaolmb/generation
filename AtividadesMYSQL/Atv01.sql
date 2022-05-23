create database EmpresaExRH;

create table colaboradores (
	codigo bigint auto_increment,
    nome varchar(20) not null,
    email varchar(30),
    cargo varchar(20),
    salario decimal(6,2),
    primary key (codigo)
);

insert into colaboradores(nome, email, cargo, salario) values ("João das Quintas", "joaoquintas@empresaex.com", "Vendedor", 1350.45);
insert into colaboradores(nome, email, cargo, salario) values ("João Luiz", "joaoluiz@empresaex.com", "Desenvolvedor JAVA", 3350.42);
insert into colaboradores(nome, email, cargo, salario) values ("João Victor", "joaovictor@empresaex.com", "Gerente", 1850.89);
insert into colaboradores(nome, email, cargo, salario) values ("João Miguel", "joaomiguel@empresaex.com", "Supervisor", 2350.25);
insert into colaboradores(nome, email, cargo, salario) values ("João Paulo", "joaopaulo@empresaex.com", "Secretário", 1250.35);

select * from colaboradores where salario > 2000;
select * from colaboradores where salario < 2000;

update colaboradores Set cargo = "Filho do dono" where codigo = 2;