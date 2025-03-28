package sonicpack3;

import sonicpack2.IConexionBD;

public class ConexionMySQL implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conecto a Sonic Forces");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de Sonic Forces");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
}