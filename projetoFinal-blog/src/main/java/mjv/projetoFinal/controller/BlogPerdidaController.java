package mjv.projetoFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mjv.projetoFinal.model.Cadastro;
import mjv.projetoFinal.repository.CadastroBlogRepository;

@Controller
@RequestMapping("/")
public class BlogPerdidaController {
	@Autowired
	private CadastroBlogRepository repository;
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("cadastros", repository.findAll());
		return mv;
	}
	
	@PostMapping("/grava")
	public ModelAndView save(@Validated Cadastro cadastro) {
		repository.save(cadastro);
		return index();
	}

}
