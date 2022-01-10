package cadastroprofissional.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import cadastroprofissional.model.Cadastro;

public class Imprimir {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");	
	public void imprimirFichaProfissional(Cadastro cadastro) {

		StringBuilder dadosFichaProfissional = new StringBuilder();
		

		dadosFichaProfissional.append("===================== FICHA PROFISSIONAL =====================\n");
		dadosFichaProfissional.append("\nProfissão: " + cadastro.getProfissao()); // TÁ EM NEGRITO ASSIM COMO FICHA
		dadosFichaProfissional.append("\nNome: " + cadastro.getNome());
		dadosFichaProfissional.append("\nSalário Requerido: Mínimo R$ " + cadastro.getSalarioMinimo() + " Máximo R$ "
				+ cadastro.getSalarioMinimo());
		dadosFichaProfissional.append("\nData de Nasc.: " + cadastro.getDataNacimento() + " CPF: " + cadastro.getCpf()
				+ " RG: " + cadastro.getRg());
		dadosFichaProfissional.append("\nEndereço: " + cadastro.getLogradouro());
		dadosFichaProfissional.append("\nN°: " + cadastro.getNumeroResidencial() + " Bairro: " + cadastro.getBairro()
				+ " Município: " + cadastro.getMunicipio() + " UF: " + cadastro.getUf());
		dadosFichaProfissional.append("\nCep: " + cadastro.getCep() + " Naturalidade: " + cadastro.getNaturalidade()
				+ " País: " + cadastro.getPais());
		dadosFichaProfissional.append("\nTelefone: " + cadastro.getTelefone() + " Celular: " + cadastro.getCelular()); // adicionar
																														// ddd
																														// +
																														// numero
		dadosFichaProfissional.append("\nE-Mail: " + cadastro.getEmail());
		dadosFichaProfissional.append("\n");
		
		
		System.out.println(dadosFichaProfissional);

	}

}
