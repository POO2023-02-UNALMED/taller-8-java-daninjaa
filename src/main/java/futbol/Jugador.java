package futbol;

public class Jugador extends Futbolista {
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
	
	@Override
	public int compareTo(Object f){
        Futbolista f1=(Futbolista)f;
        return Math.abs(super.getEdad()-f1.getEdad());
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
	
	public  String toString(){
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
}
