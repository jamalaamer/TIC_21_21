package MiCodigo;

public class ManejaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiParejaNumeros misNumeros;//Declaro el objeto
		MiParejaNumeros misNumeros2;
		int suma;
		int suma2;
		misNumeros=new MiParejaNumeros(5,8);//instancio
		misNumeros2=new MiParejaNumeros(6,8);
		suma=misNumeros.devuelveSuma();
		suma2=misNumeros2.devuelveSuma();
		System.out.println("La suma vale ");
		System.out.print(suma);
		System.out.print(suma2);
		System.out.println("\nLa resta vale ");
		System.out.print(misNumeros.devuelveResta());
	}

}
