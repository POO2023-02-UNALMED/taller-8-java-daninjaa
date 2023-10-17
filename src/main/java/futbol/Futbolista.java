package futbol;

public abstract class Futbolista implements Comparable<Object> {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this("Maradona", 30 , "delantero");
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return String.format("El futbolista %s tiene %d, y juega de posicion %s", this.nombre, this.edad, this.posicion); 
	}
	
	public boolean equals(Futbolista f) {
		if (this.nombre != f.nombre) {
			return false;
		}
		
		else if (this.edad != f.edad){
			return false;
		}
		
		else if(this.posicion != f.posicion){
			return false;
		}
		else{ 
			return true;
		}
	}
	
	public abstract boolean jugarConLasManos();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getPosicion() {
		return posicion;
	}
}
