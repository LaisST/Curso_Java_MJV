package cadastroprofissional.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	
	
	private String profissao;
	private String nome;
	private String sexo;
	private Double salarioMaximo;
	private Double salarioMinimo;
	private LocalDate dataNacimento;
	private String cpf;
	private String rg;
	private String logradouro;
	private	String numeroResidencial;
	private	String bairro;
	private	String municipio;
	private String uf; 
	private String cep; 
	private	String naturalidade;
	private	String pais;
	private String telefone; //adicionar ddd + numero
	private String celular; //ficou faltando adicionei
	private String email;
	

	List<Cadastro> cadastro = new ArrayList<Cadastro>();
	
	public List<Cadastro> getCadastro() {
		return cadastro;
	}

	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Double getSalarioMaximo() {
		return salarioMaximo;
	}
	public void setSalarioMaximo(Double salarioMaximo) {
		this.salarioMaximo = salarioMaximo;
	}
	public Double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public LocalDate getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(LocalDate data) {
		this.dataNacimento = data;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumeroResidencial() {
		return numeroResidencial;
	}
	public void setNumeroResidencial(String numeroResidencial) {
		this.numeroResidencial = numeroResidencial;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
		


}
