package mjv.easy.job.live;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.easy.job.live.model.Cadastro;
import mjv.easy.job.live.repository.CadastroRepository;

@Component
public class SistemaApplication implements CommandLineRunner {
	@Autowired
	private CadastroRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception{
		// TODO Auto-generated method stub
		String nome = "Caroline Costa";
		Cadastro lais = new Cadastro();
		lais.setAniversario(LocalDate.of(1989, 07, 25));
		lais.setNome(nome);
		
		boolean exists = repository.existsByNome(nome);
		if(exists)
			System.out.println("Já existe um registro na base com este nome");
		else
			repository.save(lais);
	}
	
}
