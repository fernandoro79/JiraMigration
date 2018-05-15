package ar.com.indra.JiraMigration.Connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.JiraClient;

public class Connection {
	
	String user;
	String password;
	String url;
	BasicCredentials creds;
	JiraClient jira;
	
	
	public Connection() {
		readParameters();
        creds = new BasicCredentials(user, password);
         jira = new JiraClient(url, creds);
	}
	
	public JiraClient getJira() {
		return jira;
	}
	
	
	private void readParameters() {
		
		  try {
			   
			  //Creamos un Objeto de tipo Properties
			     Properties propiedades = new Properties();
			      
			     //Cargamos el archivo desde la ruta especificada
			     propiedades
			       .load(new FileInputStream(
			         "src/main/resources/parameters.properties"));
			   
			     //Obtenemos los parametros definidos en el archivo
			     user = propiedades.getProperty("user");
			     password = propiedades.getProperty("password");
			     url = propiedades.getProperty("url");
			   
			         
			      
			    } catch (FileNotFoundException e) {
			     System.out.println("Error, El archivo no fue encontrado");
			    } catch (IOException e) {
			     System.out.println("Error, No se puede leer el archivo");
			    }
		  
		  
	}
}
