package sonicpack3;

import sonicpack2.IConexionREST;

public class ConexionRESTCompras implements IConexionREST{

	@Override
	public void leerURL(String url) {		
		System.out.println("Conectandose a " + url);
	}

}

