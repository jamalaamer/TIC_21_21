package MiCodigo;

public class circulo {
	int coordX;
	int coordY;
	double radio;
	/**
	 * @param coordX
	 * @param coordY
	 * @param radio
	 */
	public circulo(int coordX, int coordY, double radio) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
		this.radio = radio;
	}
	/**
	 * @return the coordX
	 */
	public int getCoordX() {
		return coordX;
	}
	/**
	 * @param coordX the coordX to set
	 */
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	/**
	 * @return the coordY
	 */
	public int getCoordY() {
		return coordY;
	}
	/**
	 * @param coordY the coordY to set
	 */
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double devuelveArea(){
		double area;
		area=(double) (Math.PI*radio*radio);
		return area;
	}
	public double devuelveLongitud(){
		double longitud;
		longitud=(double) (2*Math.PI*radio);
		return longitud;
	}
}