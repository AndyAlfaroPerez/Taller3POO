package dominio;

public class HechizoAgua extends Hechizo {

	private int cantidadHeal;
	private int presionAgua;

	// Crea un hechizo de agua
	public HechizoAgua(String nombre, int daño, int cantidadHeal, int presionAgua) {
		super(nombre, "Agua", daño);
		this.cantidadHeal = cantidadHeal;
		this.presionAgua = presionAgua;
	}

	public int getCantidadHeal() {
		return cantidadHeal;
	}

	public void setCantidadHeal(int cantidadHeal) {
		this.cantidadHeal = cantidadHeal;
	}

	public int getPresionAgua() {
		return presionAgua;
	}

	public void setPresionAgua(int presionAgua) {
		this.presionAgua = presionAgua;
	}

	@Override
	public double calcularPuntaje() {
		return (getDaño() + cantidadHeal + presionAgua) * 2;
	}

	@Override
	public String convertirATexto() {
		return getNombre() + ";Agua;" + getDaño() + ";" + cantidadHeal + "," + presionAgua;
	}

}