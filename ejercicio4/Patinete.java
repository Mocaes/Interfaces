package ejercicio4;

public class Patinete implements Vehiculo{
	
	private String modelo;
	private String motor;
	private String color;
	
	public Patinete (String modelo, String motor, String color) {
		this.modelo=modelo;
		this.motor=motor;
		this.color=color;
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
	System.out.println("El modelo del patinete es " + getModelo() + " el motor del patinete es " + getMotor()+ " el color de el patinete es " + getColor());
		
	}
	@Override
	public void agradecer() {
	
	System.out.println("Esperamos que su próximo patinete, lo compre con nosotros");
	}
	
	
	
}
