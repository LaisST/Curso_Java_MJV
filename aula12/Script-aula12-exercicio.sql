create type genero as enum ('Masc', 'Fem', 'Outro')

create table ator (
	id serial primary key,
	nome varchar(50) not null,
	sobrenome varchar(50) not null,
	genero genero not null,
	data_nascimento date not null
);

create table diretor (
	id serial primary key,
	nome varchar(50) not null,
	sobrenome varchar(50) not null,
	genero genero not null,
	data_nascimento date not null
);

create table filme (
	id serial primary key,
	titulo varchar(100) not null,
	sinopse text not null,
	bilheteria bigint
);

create table filme_ator (
	id serial primary key,
	id_ator bigint not null,
	id_filme bigint not null,
	salario bigint not null,
	constraint fk_filme_ator_ator foreign key(id_ator) references ator(id),
	constraint fk_filme_ator_filme foreign key(id_filme) references filme(id)
);

create table filme_diretor (
	id serial primary key,
	id_diretor bigint not null,
	id_filme bigint not null,
	salario bigint not null,
	constraint fk_filme_diretor_diretor foreign key(id_diretor) references diretor(id),
	constraint fk_filme_diretor_filme foreign key(id_filme) references filme(id)
);

--inserts
insert into diretor (nome, sobrenome, genero, data_nascimento)
values
('Quentin', 'Tarantino', 'Masc', '1969-05-02'),
('Steven ', 'Spielberg', 'Masc', '1965-07-15'),
('Alfred', 'Hitchcock', 'Masc', '1980-08-19'),
('Francis', 'Coppola', 'Masc', '1979-12-01'),
('George', 'Lucas', 'Masc', '1989-03-28'),
('Tim', 'Button', 'Masc', '1969-06-05')

insert into ator (nome, sobrenome, genero, data_nascimento)
values
('Jackie', 'Chan', 'Masc', '1969-05-02'),
('Adam ', 'Sandler', 'Masc', '1975-07-15'),
('Will', 'Smith', 'Masc', '1980-08-19'),
('Vin', 'Diesel', 'Masc', '1979-12-01'),
('Ben', 'Affleck', 'Masc', '1989-03-28'),
('Kristen', 'Stewart', 'Fem', '1990-06-05'),
('Sandra', 'Bullock', 'Fem', '1975-07-05'),
('Scarlett', 'Johansson', 'Fem', '1986-08-05')

insert into filme (titulo, sinopse, bilheteria)
values
('Avatar', 'Lorem ipsum', 2841389103),
('Avengers Endgame', 'Lorem ipsum', 2797800564),
('Titanic', 'Lorem ipsum', 2201223624),
('Star Wars: The Force Awakens', 'Lorem ipsum', 2068223624),
('Avengers: Infinity War', 'Lorem ipsum', 2048359754),
('Jurassic World', 'Lorem ipsum', 1671713208)

insert into filme_ator (id_filme, id_ator, salario)
values
(1, 1, 841389103),
(1, 3, 41389103),
(1, 7, 1389103),
(2, 2, 997800564),
(2, 4, 87800564),
(2, 1, 800564),
(3, 6, 1201223624),
(3, 5, 91223624),
(4, 8, 1034112312),
(4, 3, 1034112312),
(5, 8, 359754),
(5, 2, 359754)

insert into filme_diretor (id_filme, id_diretor, salario)
values
(1, 6, 1389103),
(1, 5, 2389103),
(2, 2, 97800564),
(3, 3, 223624),
(3, 4, 223624),
(4, 5, 8223624),
(5, 6, 359754),
(5, 1, 48359754),
(6, 2, 671713208)

-- 1 - Em quantos filmes o Tim Button foi o diretor?
select count(*) from filme_diretor
where id_diretor = 6
--Resp: 2

-- 2 - Quais filmes tiveram lucro?
-- 3 - Quais filmes tiveram prejuizo?
select titulo, 
	   bilheteria - 
(
	  (select sum(fa.salario) from filme_ator fa where fa.id_filme = f.id) + 
	  (select sum(fd.salario) from filme_diretor fd where fd.id_filme = f.id)
) as lucro
from filme f

-- 4 - Qual ator participou  de mais filme e quanto que ele ganhou ao total?
select id_ator, 
		count(*) qtde_filmes,
		sum(salario) salario_total
from filme_ator fa  
group by id_ator
order by count(*) desc

-- 5 - Existe algum ator que nao trabalhor em nenhum filme?
select * from ator a
left join filme_ator fa on fa.id_ator = a.id
where fa.id_filme is null

-- 6 - Existe algum filme que tem mais de 2 atores, quais?
select id_filme, count(*) as qtd_ator 
from filme_ator
group by id_filme
having count(*) > 2
order by qtd_ator desc

-- 7 - Qual foi o filme mais caro?
select titulo, 
(
	  (select sum(fa.salario) from filme_ator fa where fa.id_filme = f.id) + 
	  (select sum(fd.salario) from filme_diretor fd where fd.id_filme = f.id)
) as custo
from filme f
order by custo desc

-- 8 - Quantos Star Wars foi dirigidos pelo George Luccas?

select * from filme f
inner join filme_diretor fd on fd.id_filme = f.id 
inner join diretor d on d.id = fd.id_diretor 
where titulo ilike 'Star Wars%'
and d.nome = 'George' and d.sobrenome = 'Lucas'

-- 9 - Quantos os atores ganharam separado por genero 'Masc e Fem'
select a.genero, sum(salario) from ator a
left join filme_ator fa on fa.id_ator = a.id
group by a.genero
