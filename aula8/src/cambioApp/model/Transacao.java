package cambioApp.model;

import java.time.LocalDate;

public class Transacao {
	@Override
	public String toString() {
		return "Transacao [dataTransacao=" + dataTransacao + ", cpf=" + cpf + ", nome=" + nome + ", moedaVenda="
				+ moedaVenda + ", valorVendido=" + valorVendido + ", taxaCambio=" + taxaCambio + ", moedaCompra="
				+ moedaCompra + ", valorComprado=" + valorComprado + "]";
	}
	//Variaveis 
	private String dataTransacao;
	private String cpf;
	private String nome;
	private Moeda moedaVenda;
	private Double valorVendido;
	private Double taxaCambio;
	private Moeda moedaCompra;
	private Double valorComprado;
	
	//Getters and Setters
	public String getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Moeda getMoedaVenda() {
		return moedaVenda;
	}
	public void setMoedaVenda(Moeda moedaVenda) {
		this.moedaVenda = moedaVenda;
	}
	public Double getValorVendido() {
		return valorVendido;
	}
	public void setValorVendido(Double valorVendido) {
		this.valorVendido = valorVendido;
	}
	public Double getTaxaCambio() {
		return taxaCambio;
	}
	public void setTaxaCambio(Double taxaCambio) {
		this.taxaCambio = taxaCambio;
	}
	public Moeda getMoedaCompra() {
		return moedaCompra;
	}
	public void setMoedaCompra(Moeda moedaCompra) {
		this.moedaCompra = moedaCompra;
	}
	public Double getValorComprado() {
		return valorComprado;
	}
	public void setValorComprado(Double valorComprado) {
		this.valorComprado = valorComprado;
	}
	

}
