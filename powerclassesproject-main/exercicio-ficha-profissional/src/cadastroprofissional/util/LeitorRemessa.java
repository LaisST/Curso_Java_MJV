package cadastroprofissional.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cadastroprofissional.model.Cadastro;


public class LeitorRemessa {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");	
	public List<Cadastro> cadastros() throws FileNotFoundException{
		
		FileInputStream entradaArquivo = new FileInputStream(
				new File("D:\\desafioEddward\\powerclassesproject\\dados-profissionais.txt"));
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
	

		
		List<Cadastro> cadastro  = new ArrayList<Cadastro>();

		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {
				
				String[] dados = linha.split(";");
								
				Cadastro cadastros = new Cadastro();
				
				cadastros.setProfissao(dados[0]);
				cadastros.setNome(dados[1]);
				cadastros.setSexo(dados[2]);
				cadastros.setSalarioMinimo(Double.parseDouble(dados[3]));
				cadastros.setSalarioMaximo(Double.parseDouble(dados[4]));
								cadastros.setCpf(dados[6]);
				cadastros.setRg(dados[7]);
				cadastros.setLogradouro(dados[8]);
				cadastros.setNumeroResidencial(dados[9]);
				cadastros.setBairro(dados[10]);
				cadastros.setMunicipio(dados[11]);
				cadastros.setUf(dados[12]);
				cadastros.setCep(dados[13]);
				cadastros.setNaturalidade(dados[14]);
				cadastros.setPais(dados[15]);
				cadastros.setTelefone(dados[16]);
				cadastros.setCelular(dados[17]);
				cadastros.setEmail(dados[18]);

				String DataNacimento = dados[5];
				
				LocalDate data = LocalDate.parse(DataNacimento,formatter);
				cadastros.setDataNacimento(data);
				
				cadastro.add(cadastros);
				
					}	
			}
		return cadastro;
				
				}
}