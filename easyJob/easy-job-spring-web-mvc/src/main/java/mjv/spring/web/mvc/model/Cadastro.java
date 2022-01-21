package mjv.spring.web.mvc.model;

public class Cadastro {
	private String nome;
	private String profissao;
	
	//Construtor
	
	public Cadastro () {}
	
	public Cadastro(String nome, String profissao) {
		super();
		this.nome = nome;
		this.profissao = profissao;
	}
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}
