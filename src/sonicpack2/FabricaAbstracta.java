package sonicpack2;

public interface FabricaAbstracta {

	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
	
}
