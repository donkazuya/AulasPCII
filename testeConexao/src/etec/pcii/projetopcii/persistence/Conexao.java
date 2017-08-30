package etec.pcii.projetopcii.persistence;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
	
	public Connection getMysqlConnection() throws Exception{
	
	String stringDeConexao = "jdbc:mysql://localhost/escola";
	Connection connection = DriverManager.getConnection(stringDeConexao,"root","");
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println(connection);
	return connection;
	
	}

}
