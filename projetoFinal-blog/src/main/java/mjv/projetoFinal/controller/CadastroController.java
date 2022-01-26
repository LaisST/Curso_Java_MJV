package mjv.projetoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.projetoFinal.model.Cadastro;
import mjv.projetoFinal.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	@Autowired
	private CadastroRepository repository;
	
	@GetMapping
	public List<Cadastro> getCadastros(){
		return repository.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Cadastro cadastro) {
		repository.save(cadastro);
	}

}
