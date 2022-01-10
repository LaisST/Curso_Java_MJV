package cambioApp.app;

import java.util.List;

import cambioApp.model.Transacao;
import cambioApp.util.LeitorRemessa;

public class CambioApp {
	public static void main(String [] args) {
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<Transacao> transacoes = leitor.converter("C:\\Program Files\\Java\\eclipse-jee-2021-06-R-win32-x86_64\\eclipse\\MJV_Java\\aula8\\DELREMESSA.txt");
		
		for (Transacao t: transacoes) {
			System.out.println(t);
		}
	}
	

}
