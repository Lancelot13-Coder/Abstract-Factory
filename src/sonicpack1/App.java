package sonicpack1;

import sonicpack2.FabricaAbstracta;
import sonicpack2.IConexionBD;
import sonicpack2.IConexionREST;

public class App {

	public static void main(String[] args) {
		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.youtube.com/@segahardlight");
	}

}

