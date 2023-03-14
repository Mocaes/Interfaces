package ejercicio5;

public class Main {
	public static void main(String[] args) {
		
		Calculadora miCalculadora = new Calculadora();
		 System.out.println("la suma es "+ miCalculadora.sumar(5, 3));
		 System.out.println("la resta es "+ miCalculadora.restar(5, 3));
		 System.out.println("la multiplicacion es " + miCalculadora.multiplicacion(5, 3));
		 System.out.println("la division es " + miCalculadora.division(5, 3));
		 System.out.println("la potencia es " + miCalculadora.potencia(5, 3));
		 System.out.println("la raiz es " + miCalculadora.raiz(12));
		}
}
