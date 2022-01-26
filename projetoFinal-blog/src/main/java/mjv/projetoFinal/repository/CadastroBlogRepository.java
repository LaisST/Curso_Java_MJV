package mjv.projetoFinal.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mjv.projetoFinal.model.Cadastro;

@Repository
public class CadastroBlogRepository {
	private List<Cadastro> cadastros = new ArrayList<Cadastro>();
	public CadastroBlogRepository() {
	}
	public List<Cadastro> findAll(){
		return cadastros;
	}
	
	public void save(Cadastro cadastro) {
		cadastros.add(cadastro);
	}
	
}
