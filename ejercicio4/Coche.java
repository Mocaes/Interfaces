package ejercicio4;

public class Coche implements Vehiculo {

    private String modelo;
    private String color;
    private String motor;

    public Coche(String modelo, String color, String motor) {
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
        System.out.println("El modelo del coche es " + getModelo() + ", el color es " + getColor() + ", el motor es " + getMotor());
    }

    @Override
    public void agradecer() {
        System.out.println("Esperamos que su próximo coche, lo compre con nosotros");
    }

}
