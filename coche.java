package MiCodigo;

public class coche extends vehiculo{
	private String marca;
	public coche(String identificador, String medio) {
		super(identificador, medio);
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
