--DDL
-- 1)Criar a tabela citada acima contemplando os campos destacados, desconsiderando inicialmente o campo profissao;
create table tab_ficha_profissional(
	--O id ser� gerado de forma automatica pelo serial primary key
	id_profissional serial primary key not null,
	nome varchar (50) not null,
	email varchar (50) not null,
	telefone varchar (15) not null,
	logradouro varchar (50) not null,
	numero varchar (5) not null,
	bairro varchar (50) not null,
	cidade varchar (30) not null,
	estado varchar (30) not null,
	salario_minimo_pretendido numeric(8,2) not null,
	salario_maximo_pretendido numeric(8,2) not null,
	estrangeiro char (1) not null
);
select * from tab_ficha_profissional;

--2) Alterar a tabela para a inclus�o do campo profissao;
ALTER TABLE tab_ficha_profissional ADD COLUMN profissao varchar (50);

--3) Alterar a coluna email para que ela possa suportar at� 100 caracteres;
ALTER TABLE tab_ficha_profissional ALTER COLUMN email TYPE varchar(100);

--DML
--1) Realizar um insert com 10 registros profissionais - SEM INFORMAR O VALOR DA COLUNA PROFISS�O;
insert into tab_ficha_profissional(nome, email, telefone, logradouro, numero, bairro, cidade, estado, salario_minimo_pretendido, salario_maximo_pretendido, estrangeiro) values
('Lais Costa', 'laiscostast@gmail.com', '1146343097', 'Avenida Brasil', '277', 'Centro', 'Po�', 'SP', 2000.00, 10.000, 'N'),
('Eddward Messias', 'eddwardmessias@gmail.com', '083988639028', 'Av. Dom Pedro l', '1400', 'Itarar�', 'Campina Grande', 'PB', 1500.00, 4500.00, 'N'),
('Marcos Paulo', 'marcospaulo@gmail','81991547020','Avenida Jornalista Alberto Francisco Torres', '405-A','Icara�','Niter�i','RJ',1.000,2.000,'N'),
('Dayane', 'sistemas12day@gmail.com', '091985324369', 'Travessa Padre Ant�nio Franco', '2421', 'Matinha','Camet�', 'PA', 2000, 5000, 'N'),
('Luis Carlos', 'luiscarlos@gmail','091985445566','Rua 07 de setembro', '1234','Central','Bel�m','PA', 1500, 3500,'N'),
('Nat�lia Sabino', 'natalia@gmail.com','1145687965','Rua Conde Juliano', '140','Vila Sui�a','Santo Andr�','S�o Paulo',2000,2500,'N'),
('Daniela Aguiar', 'daniela@gmail.com','1145687966','Rua Sigma', '130','Vila Palmares','S�o Paulo','S�o Paulo',1500,1800,'N'),
('Day Rodriguez','day@email.com', '1252585957', 'Rua S�o Paulo', '256','Vila Rio', 'S�o Vicente', 'S�o Paulo', 2000, 2500, 'S'),
('Anthony Silva', 'anthony@gmail', '88982305780','Rua Flores', '54', 'S�o Miguel', 'Fortaleza', 'Cear�', 3000,3500, 'N'),
('Cla�dia Maia', 'claudia@gmail.com', '119568544037', 'Rua Jardim','25', 'Itaquera', 'S�o Paulo', 'S�o Paulo', 2800, 3500, 'N'),
('Luciano Marques', 'luciano@gmail.com', '219568544037', 'Rua Sol','30', 'Vila Merc�s', 'Rio de Janeiro', 'Rio de Janeiro', 2800, 3500, 'N');
--2) Definir as profiss�es via update nos registros inseridos, considerando a altera��o individualmente;
update tab_ficha_profissional set profissao = 'ANALISTA DE SISTEMAS JR' where id_profissional = 1;
update tab_ficha_profissional set profissao = 'ANALISTA DE SISTEMAS SENIOR' where id_profissional = 2;
update tab_ficha_profissional set profissao = 'ANALISTA DE BANCO DE DADOS' where id_profissional = 3;
update tab_ficha_profissional set profissao = 'ANALISTA SALESFORCE' where id_profissional = 4;
update tab_ficha_profissional set profissao = 'ANALISTA DE SISTEMAS JR' where id_profissional = 5;
update tab_ficha_profissional set profissao = 'ANALISTA DE SISTEMAS SENIOR' where id_profissional = 6;
update tab_ficha_profissional set profissao = 'DESENVOLVEDOR JAVA SENIOR' where id_profissional = 7;
update tab_ficha_profissional set profissao = 'DESENVOLVEDOR C++' where id_profissional = 8;
update tab_ficha_profissional set profissao = 'DESENVOLVEDOR PYTHON' where id_profissional = 9;
update tab_ficha_profissional set profissao = 'DESENVOLVEDOR .NET' where id_profissional = 10;
update tab_ficha_profissional set profissao = 'ANALISTA DE SISTEMAS SENIOR' where id_profissional = 11;
update tab_ficha_profissional set profissao = 'ANALISTA DE SISTEMAS JR' where id_profissional = 12;

--3) Excluir todos os registros que o campo estrangeiro for considerado verdadeiro;
DELETE FROM tab_ficha_profissional WHERE estrangeiro = 'S';
--4) O cadastro de Id=3 dever� residir no endereco: Logradouro='PRACA DA SE', Numero = 'S/N', Bairro = 'CENTRO', Cidade = 'SAO PAULO', Estado = 'SP';
update tab_ficha_profissional set logradouro = 'PRACA DA SE', numero = 'S/N', bairro = 'CENTRO', cidade = 'SAO PAULO',estado = 'SP' where id_profissional = 3;



--DQL
--1) Retornar uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profiss�o, Nome;
--2) Retornar uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profiss�o, Salario M�ximo do maior para o menor;
--3) Retornar uma lista com a seguinte informa��o concatenada e apelidada de nome_profissao: NOME + ' - ' + PROFISSAO;
--4) Retornar uma lista contendo o nome da profiss�o e a quantidade de registros da profiss�o.
--5) Retornar o registro com menor sal�rio m�nimo;
--6) Retornar se existir o registro com a seguinte condi��o: Nome parecido com 'MARCOS PAULO' e Salario Maximo maior que 1200 e Salario Maximo menor ou igual que 2000 e que o Estado esteja entre SP, RJ, SC.