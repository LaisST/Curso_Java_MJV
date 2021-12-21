package bankApp.model;

public class Historico {
	private String data;
	private double valor;
	private String tipoOperacao;
	
	//Construtores
	
	public Historico() {}
	
	public Historico(String data, double valor, String tipoOperacao) {
		this.data = data;
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
	}
	
	//Getters
	public String getData() { return data;	}

	public double getValor() { return valor; }

	public String getTipoOperacao() { return tipoOperacao; }

	


}
