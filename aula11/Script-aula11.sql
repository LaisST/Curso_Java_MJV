--SQL - LINGUAGEM DE INTERAÇÃO COM O BANCO DE DADOS
--DDL - DEFINIÇÃO
create table tab_ficha_cadastral (
	profissao varchar(50) not null,
    nome varchar(50) not null,
    sexo char (1) not null,
    salario_minimo numeric(8,2) not null,
    salario_maximo numeric(8,2) not null,
    data_nascimento date not null,
    cpf varchar(15) not null,
    rg varchar(15) not null,
    logradouro varchar(50) not null,
    numero varchar(5) not null,
    bairro varchar(50) not null,
    municipio varchar(50) not null,
    uf varchar(2) not null,
    cep varchar(12) not null,
    naturalidade varchar(50) not null,
    pais varchar(50) not null,
    telefone varchar(15) not null,
    celular varchar(15) not null,
    email varchar(50) not null,
    escolaridade varchar(50) not null
);
--alter table
-- alter table
drop table tab_ficha_cadastral;
--- ??

--DML - MANIPULAÇÃO DOS DADOS EM TABELA
insert into tab_ficha_cadastral 
values ('DESENVOLVEDOR JR','LAIS COSTA','F', 1200.50, 5000.00,'1993-11-13', '39871726814', '383070039', 'RUA JOAO LEITE DE GODOY', '277', 'AGUA VERMELHA',  'POÁ', 'SP', '08565320','SÃO PAULO', 'BRASIL', '1146343097', '11994853110', 'LAISCOSTAST@GMAIL.COM', 'SUPERIOR' 
); 

insert into tab_ficha_cadastral 
values ('DESENVOLVEDOR JR','DAYANE  ','F', 1200.50, 5000.00,'1993-05-20', '123456789', '658214569', 'RUA JOSE ANDRADE', 'S/N', 'CENTRO',  'SÃO PAULO', 'SP', '08552100','SÃO PAULO', 'BRASIL', '1164107537', '11924691349', 'DAY@GMAIL.COM', 'SUPERIOR');

insert into tab_ficha_cadastral 
values ('DESENVOLVEDOR SENIOR','CAROLINE COSTA','F', 3000.00, 10000.00,'1993-07-25', '39871726123', '383070123', 'RUA JACARAU', '9F', 'NOVO PORTUGAL',  'GUARULHOS', 'SP', '08557300','SÃO PAULO', 'BRASIL', '1146341234', '11994851234', 'CAROLCOSTA@GMAIL.COM', 'SUPERIOR' 
); 

---???
--update 

--DQL
select nome, salario_minimo, municipio, escolaridade as escola 
from tab_ficha_cadastral
where salario_minimo > 1000.0 and salario_minimo < 1500.0
and escolaridade like 'SUPERIOR';
--plus - order by - retornar os dados

--Criando uma tabela com primary key 
create table tab_cidade (
	id int primary key,
	nome varchar (50) not null
);

insert into tab_cidade values(
	'1', 'SÃO PAULO'
);

insert into tab_cidade values(
	3, 'CURITIBA'
);

--CRIANDO TABELA CLIENTE COM PRIMARY KEY COM AUTO INCREMENT
create table tab_cliente (
	id serial primary key,
	nome varchar (50) not null
);

--ATUALIZAÇÃO UTILIZANDO O WHERE PARA GARANTIR QUE SOMENTE UM ID SERÁ ALTERADO
update tab_cliente set nome = 'LAIS TEIXEIRA' where id = 1;
update tab_cliente set nome = 'CAROLINE COSTA' where id = 2;