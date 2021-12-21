package bankApp.model;

import java.util.ArrayList;
import java.util.List;

//poo
//modificadores de acesso
//padrão java beans

public class Conta {
	private int numeroConta;
	private double saldo;
	private String nome;
	private List<Historico> historicos = new ArrayList();
	
	//Todo é composto por: Tipo de retorno
	//nome declarativo
	//parametros
	
	//getters and Setters
	public double getSaldo () {
		return saldo;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Historico> getHistoricos(){
		return historicos;
	}


	
	
	
}
