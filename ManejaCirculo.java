package MiCodigo;

public class ManejaCirculo {

	public static void main(String[] args) {
		circulo circulito1;
		circulo circulito2;
		circulito1=new circulo(7,9,4.5);{
			
		}
		circulito2=new circulo(6,3,3.5);{
			
		}
		System.out.println("CIRCULITO 1: ");
		System.out.println("Coordenada X del centro: "+circulito1.getCoordX());
		System.out.println("Coordenada Y del centro: "+circulito1.getCoordY());
		System.out.println("Radio: "+circulito1.getRadio());
		System.out.println("CIRCULITO 2: ");
		System.out.println("Coordenada X del centro: "+circulito2.getCoordX());
		System.out.println("Coordenada Y del centro: "+circulito2.getCoordY());
		System.out.println("Radio: "+circulito2.getRadio());
		System.out.print("Area del circulo1 es: ");
		System.out.println(circulito1.devuelveArea());
		System.out.print("Area del circulo2 es: ");
		System.out.println(circulito2.devuelveArea());
		
	}

}
