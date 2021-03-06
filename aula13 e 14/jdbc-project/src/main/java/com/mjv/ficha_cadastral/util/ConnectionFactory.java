package com.mjv.ficha_cadastral.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	   //Nome do usu?rio do mysql
	   private static final String USERNAME = "postgres";
	 
	   //Senha do mysql
	   private static final String PASSWORD = "postgres";
	 
	   //Dados de caminho, porta e nome da base de dados que ir? ser feita a conex?o
	   private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/tabelas_db";
	   /**
	   * Cria uma conex?o com o banco de dados MySQL utilizando o nome de usu?rio e senha fornecidos
	   * @param username
	   * @param senha
	   * @return uma conex?o com o banco de dados
	   * @throws Exception
	   */
	   public static Connection createConnection() throws Exception{
	      Class.forName("org.postgresql.Driver"); //Faz com que a classe seja carregada pela JVM
	 
	      //Cria a conex?o com o banco de dados
	      Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	 
	      return connection;
	   }
	   public static void main(String[] args) throws Exception{
	 
	      //Recupera uma conex?o com o banco de dados
	      Connection con = createConnection();
	 
	      //Testa se a conex?o ? nula
	      if(con != null){
	         System.out.println("Conex?o obtida com sucesso!" + con);
	         con.close();
	    }
	 
	}
}