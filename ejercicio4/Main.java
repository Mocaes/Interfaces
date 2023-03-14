package ejercicio4;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Seat", "Rojo", "1200");
        Moto moto = new Moto("Honda", "verde", "1300");
        Moto moto1 = new Moto("Yamaha", "rojo", "1300");
        Patinete patinete= new Patinete("Xiaomi","Verde","Electrico");
        Bicicleta bicicleta= new Bicicleta("Mountain","Sin motor","Azul");
        
        coche1.mostrarDatos();
        coche1.agradecer();
        
        System.out.println();
        moto.mostrarDatos();
        moto.agradecer();
        
        System.out.println();
        moto1.mostrarDatos();
        moto1.agradecer();
        
        System.out.println();
        patinete.mostrarDatos();
        patinete.agradecer();
        
        System.out.println();
        bicicleta.mostrarDatos();
        bicicleta.agradecer();
        
        }

}
