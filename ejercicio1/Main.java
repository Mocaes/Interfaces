package ejercicio1;

public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
	Libro libro = new Libro("El señor de los anillos", "Novela de aventura", 30.00,"Tolkien");
	Electrodomestico elec = new Electrodomestico("Refrigerador","Refrigerador de marca LG", 500.0, "LG");
	
	libro.MostrarInformacion();
	System.out.println();
	elec.MostrarInformacion();
	System.out.println();
}
}