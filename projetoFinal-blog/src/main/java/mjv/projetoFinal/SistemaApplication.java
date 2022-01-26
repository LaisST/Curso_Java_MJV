package mjv.projetoFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import mjv.projetoFinal.repository.CadastroRepository;

public class SistemaApplication implements CommandLineRunner {
	
	@Autowired
	private CadastroRepository repository;
	@Override
	public void run(String...args) throws Exception {
	
	}

}
