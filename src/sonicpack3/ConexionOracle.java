package sonicpack3;

import sonicpack2.IConexionBD;

public class ConexionOracle implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conecto a Sonic Dash");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de Sonic Dash");
	}

	@Override
	public String toString() {
		return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}