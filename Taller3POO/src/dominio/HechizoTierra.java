package dominio;

public class HechizoTierra extends Hechizo {

	private int mejoraDefensa;

	// Crea un hechizo de tierra
	public HechizoTierra(String nombre, int daño, int mejoraDefensa) {
		super(nombre, "Tierra", daño);
		this.mejoraDefensa = mejoraDefensa;
	}

	public int getMejoraDefensa() {
		return mejoraDefensa;
	}

	public void setMejoraDefensa(int mejoraDefensa) {
		this.mejoraDefensa = mejoraDefensa;
	}

	@Override
	public double calcularPuntaje() {
		return (getDaño() * mejoraDefensa) / 2.0;
	}

	@Override
	public String convertirATexto() {
		return getNombre() + ";Tierra;" + getDaño() + ";" + mejoraDefensa;
	}

}