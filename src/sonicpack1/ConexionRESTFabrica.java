package sonicpack1;

import sonicpack2.FabricaAbstracta;
import sonicpack2.IConexionBD;
import sonicpack2.IConexionREST;
import sonicpack3.ConexionRESTCompras;
import sonicpack3.ConexionRESTNoArea;
import sonicpack3.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}