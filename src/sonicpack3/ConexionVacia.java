package sonicpack3;

import sonicpack2.IConexionBD;

public class ConexionVacia implements IConexionBD{

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}
