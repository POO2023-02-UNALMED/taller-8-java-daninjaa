package futbol;
public class Portero extends Futbolista implements<Portero>{
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		return String.format("El futbolista %s tiene %d, y juega de %s con el dorsal %d. Le han marcado %d.", super.getNombre(), super.getEdad(), super.getPosicion(), this.dorsal, this.golesRecibidos); 
	}
	
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	public String getNombre() {
		return super.getNombre();
	}
	
	public void setEdad(int edad) {
		super.setEdad(edad);
	}
	
	public int getEdad() {
		return super.getEdad();
	}
	
	public String getPosicion() {
		return super.getPosicion();
	}
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	
	public int compareTo(Portero futbolista) {
		if (futbolista instanceof Portero) {
			Portero portero = (Portero) futbolista;
			return Math.abs(this.golesRecibidos - portero.golesRecibidos);
		}
		
		else {
			return 0;
		}
	}

}
