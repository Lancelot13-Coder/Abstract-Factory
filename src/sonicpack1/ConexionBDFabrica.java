package sonicpack1;

import sonicpack2.FabricaAbstracta;
import sonicpack2.IConexionBD;
import sonicpack2.IConexionREST;
import sonicpack3.ConexionMySQL;
import sonicpack3.ConexionOracle;
import sonicpack3.ConexionPostgreSQL;
import sonicpack3.ConexionSQLServer;
import sonicpack3.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta{

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}

