package mjv.spring.web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mjv.spring.web.mvc.model.Cadastro;
import mjv.spring.web.mvc.repository.CadastroRepository;

@Controller
@RequestMapping("/")
public class EasyJobController {
	@Autowired
	private CadastroRepository repository;
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("cadastros", repository.findall());
		
		return mv;
	}
	
	@PostMapping("/grava")
	public ModelAndView save(@Validated Cadastro cadastro) {
		repository.save(cadastro);
		//Tudo ok
		return index();
	}

}
