package cadastroprofissional.app;

import java.io.FileNotFoundException;
import java.util.List;

import cadastroprofissional.model.Cadastro;
import cadastroprofissional.util.Imprimir;
import cadastroprofissional.util.LeitorRemessa;

public class CadastroApplication {

		
	public static void main(String[] args) throws FileNotFoundException {
		
		Imprimir imprimirDados = new Imprimir();
		
		LeitorRemessa leitorRemessa = new LeitorRemessa();
		List<Cadastro> registros = leitorRemessa.cadastros();
		/*for (Cadastro registro : registros) {
		System.out.println(registro);
		}*/
		
		for(Cadastro c: registros) {
			imprimirDados.imprimirFichaProfissional(c);
		}
		
		
	}

}

	
