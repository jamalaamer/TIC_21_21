package MiCodigo;

public class manejavehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehiculo miBarquito;
		coche micoche;
		CocheElectrico micochePilas;
		miBarquito=new vehiculo("Titanic II","acuatico");
		micoche=new coche("Delorian","terrestre");
		micochePilas=new CocheElectrico("Tesla","terrestre");
		System.out.println("Mi coche es un "+micochePilas.getIdentificador());
	}

}
