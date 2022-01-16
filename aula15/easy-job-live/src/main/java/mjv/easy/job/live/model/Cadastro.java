package mjv.easy.job.live.model;

//Imports
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Mapeamento
@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 70, nullable = false) //varchar de 70 caracteres
	private String nome;
	private LocalDate aniversario;
	/*
	private Double altura;
	private boolean estrangeiro;
	*/
	
	//getters and setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getAniversario() {
		return aniversario;
	}
	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}
	public Integer getId() {
		return id;
	}
	

	
}