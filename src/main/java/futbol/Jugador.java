package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	
	public int compareTo(Futbolista futbolista) {
		return Math.abs(super.getEdad() - futbolista.getEdad());
	}
	
	@Override
	public boolean jugarConLasManos() {
		return false;
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
}
