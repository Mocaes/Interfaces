package ejercicio4;

public class Moto implements Vehiculo {

    private String modelo;
    private String color;
    private String motor;

    public Moto(String modelo, String color, String motor) {
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getMotor() {
        return motor;
    }

    @Override
    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El modelo de la moto es " + getModelo() + ", el color es " + getColor());
        System.out.println("Gracias por comprar la motomami");
    }

  
    public void agradecer() {
        System.out.println("Esperamos que su próxima moto, la compre con nosotros");
    }

}