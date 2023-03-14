package ejercicio4;

public class Bicicleta implements Vehiculo {
	
	private String modelo;
	private String motor;
	private String color;
	
	public Bicicleta (String modelo, String motor, String color) {
		this.modelo=modelo;
		this.color=color;
		this.motor=motor;
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
	public String getMotor() {
		return motor;
	}
	@Override
	public void setMotor(String motor) {
		this.motor = motor;
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
    public void mostrarDatos() {
        System.out.println("El modelo de la bicicleta es " + getModelo() + ", el color es " + getColor() + ", el motor es " + getMotor());
    }

    @Override
    public void agradecer() {
        System.out.println("Esperamos que su próxima Bicicleta, lo compre con nosotros");
    }
	
	
}
