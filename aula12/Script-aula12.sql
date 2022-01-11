--Aula 12
--Manipula��o de varias tabelas 
--Relacionamento de tabelas
--Identifica��o pessoal: nome, nascimento, telefone
--Dados profissionais: salario, profiss�o 
--Endere�amento: logradouro, bairro, cidade, estado, pais, cep

--           Matriz 
-- |nome | profissao | cidade
--1|  -  |     -     |  -
--2|  -  |     -     |  -

--REUZABILIDADE
--INTEGRIDADE DOS DADOS
--MULTIPLICADE DOS DADOS 

--***************************************************************************--
--Exemplos
--Tabelas secund�ria: tabela Profissao
create table tab_profissao(
	id_profissao serial primary key not null,
	nome varchar (30) not null
);

--Tabelas secund�ria: tabela ficha_cadastral
create table tabela_ficha_cadastral (
	id_cadastro serial primary key not null,
	nome varchar (30) not null,
	id_profissao int not null,
	
	CONSTRAINT fk_ficha_cadastral_profissao
	foreign key(id_profissao)
	REFERENCES tab_profissao(id_profissao)
);


