package ejercicio3;

public interface Vehiculo {
	
	public String getModelo();
    
    public void setModelo(String modelo);
    
    public String getColor();
    
    public void setColor(String color);
    
    public String getMotor();
    
    public void setMotor(String motor);
    
    public void mostrarDatos();
    
    public default void agradecer() {
        System.out.println("Gracias por su compra");
    }
}
