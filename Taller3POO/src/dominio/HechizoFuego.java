package dominio;

public class HechizoFuego extends Hechizo {

	private int duracionQuemadura;

	// Crea un hechizo de fuego
	public HechizoFuego(String nombre, int daño, int duracionQuemadura) {
		super(nombre, "Fuego", daño);
		this.duracionQuemadura = duracionQuemadura;
	}

	public int getDuracionQuemadura() {
		return duracionQuemadura;
	}

	public void setDuracionQuemadura(int duracionQuemadura) {
		this.duracionQuemadura = duracionQuemadura;
	}

	@Override
	public double calcularPuntaje() {
		return getDaño() * duracionQuemadura;
	}

	@Override
	public String convertirATexto() {
		return getNombre() + ";Fuego;" + getDaño() + ";" + duracionQuemadura;
	}

}