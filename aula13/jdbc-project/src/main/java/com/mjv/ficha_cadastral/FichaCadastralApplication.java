package com.mjv.ficha_cadastral;

import com.mjv.ficha_cadastral.dao.ProfissaoDao;
import com.mjv.ficha_cadastral.model.Profissao;

public class FichaCadastralApplication {
	public static void main(String[] args) {
		exemploAlterarById();
	}
	
	static void exemploSalvar() {
		Profissao p = new Profissao(); 
		p.setNome("ANALISTA DE DADOS");
		
		ProfissaoDao dao = new ProfissaoDao();
		dao.save(p);
	}
	
	static void exemploAlterarById() {
				
		ProfissaoDao dao = new ProfissaoDao();
		
		Profissao p = dao.findById(1);
		p.setNome("ANALISTA DE SISTEMAS SR");
		dao.update(p);
	}
	
	static void exemploAlterar() {
		Profissao p = new Profissao(); 
		p.setId(1);
		p.setNome("PROGRAMADOR JAVA JR");
		ProfissaoDao dao = new ProfissaoDao();
		dao.update(p);
	}

}
