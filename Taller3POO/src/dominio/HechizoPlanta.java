package dominio;

public class HechizoPlanta extends Hechizo {

	private int duracionStun;
	private int cantPlantas;

	// Crea un hechizo de planta
	public HechizoPlanta(String nombre, int daño, int duracionStun, int cantPlantas) {
		super(nombre, "Planta", daño);
		this.duracionStun = duracionStun;
		this.cantPlantas = cantPlantas;
	}

	public int getDuracionStun() {
		return duracionStun;
	}

	public void setDuracionStun(int duracionStun) {
		this.duracionStun = duracionStun;
	}

	public int getCantPlantas() {
		return cantPlantas;
	}

	public void setCantPlantas(int cantPlantas) {
		this.cantPlantas = cantPlantas;
	}

	@Override
	public double calcularPuntaje() {
		return getDaño() + (duracionStun * cantPlantas);
	}

	@Override
	public String convertirATexto() {
		return getNombre() + ";Planta;" + getDaño() + ";" + duracionStun + "," + cantPlantas;
	}

}