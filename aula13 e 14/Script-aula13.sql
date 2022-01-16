create table tab_profissao(
	id_profissao serial primary key not null,
	nome varchar (30) not null
);

--Tabelas secundária: tabela ficha_cadastral
create table tabela_ficha_cadastral (
	id_cadastro serial primary key not null,
	nome varchar (30) not null,
	id_profissao int not null,
	
	CONSTRAINT fk_ficha_cadastral_profissao
	foreign key(id_profissao)
	REFERENCES tab_profissao(id_profissao)
);


