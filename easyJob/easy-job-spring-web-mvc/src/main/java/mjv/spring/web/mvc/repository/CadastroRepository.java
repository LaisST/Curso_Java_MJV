package mjv.spring.web.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mjv.spring.web.mvc.model.Cadastro;


@Repository
public class CadastroRepository {
	private List<Cadastro> cadastros = new ArrayList<Cadastro>();
	public CadastroRepository() {
		cadastros.add(new Cadastro("Lais", "Estagiaria"));
		cadastros.add(new Cadastro("Gleyson", "Instrutor"));
	}
	
	public List<Cadastro> findall(){
		return cadastros;
	}
	
	public void save(Cadastro cadastro) {
		cadastros.add(cadastro);
	}
	

}
