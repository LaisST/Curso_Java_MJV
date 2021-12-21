package bankApp.service;

import bankApp.model.Conta;
import bankApp.model.Historico;

public class ContaService {
	public void depositar (Conta conta, double valorDepositado) {
		conta.setSaldo(conta.getSaldo() + valorDepositado);
		conta.getHistoricos().add(new Historico("20/12", valorDepositado, "DEPOSITO"));	
	}
	
	public void sacar (Conta conta, double valorSaque) {
		conta.setSaldo(conta.getSaldo() - valorSaque);
		conta.getHistoricos().add(new Historico("21/12", valorSaque, "SAQUE"));
	}
	
	public void mostrarSaldoAtual (Conta conta) {
		System.out.println(conta.getNome() + " seu saldo é: " + conta.getSaldo());
	}
	
	public void exibirExtrato (Conta conta) {
		System.out.println("Histórico da Conta: "+ conta.getNome());
		for (Historico hst: conta.getHistoricos()) {
			System.out.println(hst.getData() + " - " + hst.getTipoOperacao() + " - " + hst.getValor());
		}
	}
	
	

}
