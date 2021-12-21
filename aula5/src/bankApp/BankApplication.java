package bankApp;

import bankApp.model.Conta;
import bankApp.service.ContaService;

public class BankApplication {
	public static void main (String[] args) {
		Conta contaLais = new Conta();
		Conta contaClaudia = new Conta();
		Conta contaGustavo = new Conta();
		
		ContaService terminal = new ContaService();
		//Deposito
		terminal.depositar(contaLais, 40.0);
		terminal.depositar(contaClaudia, 50.0);
		terminal.depositar(contaGustavo, 60.0);
		
		//Saque
		terminal.sacar(contaLais, 10.0);
		terminal.sacar(contaClaudia, 10.0);
		terminal.sacar(contaGustavo, 10.0);
		
		//Mostrar Saldo
		//System.out.println("=== Saldo ===");
		contaLais.setNome("Lais");
		contaClaudia.setNome("Claudia");
		contaGustavo.setNome("Gustavo");
		//terminal.mostrarSaldoAtual(contaLais);
		//terminal.mostrarSaldoAtual(contaClaudia);
		//terminal.mostrarSaldoAtual(contaGustavo);
		
		
		//Exibir Extrato
		terminal.exibirExtrato(contaLais);
		System.out.println("Saldo atual:" +contaLais.getSaldo());
		
	}
}
