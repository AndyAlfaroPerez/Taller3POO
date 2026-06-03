package dominio;

import java.util.ArrayList;

public class Mago implements Calculable {

	private String nombre;

	// Hechizos dominados por el mago
	private ArrayList<Hechizo> hechizos;

	public Mago(String nombre) {
		this.nombre = nombre;
		hechizos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Hechizo> getHechizos() {
		return hechizos;
	}

	// Agrega un hechizo al repertorio del mago
	public void agregarHechizo(Hechizo hechizo) {
		hechizos.add(hechizo);
	}

	@Override
	public double calcularPuntaje() {
		double total = 0;

		// Suma los puntajes de cada hechizo
		for (Hechizo hechizo : hechizos) {
			total += hechizo.calcularPuntaje();
		}

		return total;
	}
	

}