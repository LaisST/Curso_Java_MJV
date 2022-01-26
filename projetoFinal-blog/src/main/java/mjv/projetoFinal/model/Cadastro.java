package mjv.projetoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 70, nullable = false)
	private String nome;
	@Column(length = 70, nullable = false)
	private String email;
	private String mensagem;
	
	//Getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Integer getId() {
		return id;
	}
	
	
	public Cadastro(String nome, String email, String mensagem) {
		super();
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}
	
	public Cadastro () {}

	
}
