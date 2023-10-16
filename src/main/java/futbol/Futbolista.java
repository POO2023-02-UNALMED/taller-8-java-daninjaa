package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
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
	@Override
	public int compareTo(Futbolista f) {
		int comparar_edad = Math.abs(this.edad - f.edad);
		if (comparar_edad != 0) {
			return comparar_edad;
		}
		
		int comparar_nombre = this.nombre.compareTo(f.nombre);
		if (comparar_nombre != 0) {
			return comparar_nombre;
		} 
		
		return this.posicion.compareTo(f.posicion);
	}
	
	public boolean equals(Futbolista f) {
		if (this.compareTo(f) == 0) {
			return true;
		}
		
		else { 
			return false;
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
