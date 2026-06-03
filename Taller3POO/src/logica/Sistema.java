package logica;

import java.util.ArrayList;

import dominio.Hechizo;
import dominio.Mago;

public class Sistema {

	private ArrayList<Mago> magos;
	private ArrayList<Hechizo> hechizos;

	// Inicializa las listas principales
	public Sistema() {
		magos = new ArrayList<>();
		hechizos = new ArrayList<>();
	}

	public ArrayList<Mago> getMagos() {
		return magos;
	}

	public ArrayList<Hechizo> getHechizos() {
		return hechizos;
	}

}