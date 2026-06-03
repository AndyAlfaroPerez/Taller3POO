package logica;

import java.io.*;
import java.util.*;

import dominio.Hechizo;
import dominio.Mago;
import dominio.HechizoAgua;
import dominio.HechizoFuego;
import dominio.HechizoPlanta;
import dominio.HechizoTierra;

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

	// Busca un hechizo por nombre
	public Hechizo buscarHechizo(String nombre) {

		for (Hechizo hechizo : hechizos) {

			if (hechizo.getNombre().equalsIgnoreCase(nombre)) {
				return hechizo;
			}
		}

		return null;
	}

	// Lee todos los hechizos desde el archivo
	public void cargarHechizos() {

		try {

			Scanner lector = new Scanner(new File("Hechizos.txt"));

			while (lector.hasNextLine()) {

				String linea = lector.nextLine();

				// Separa los datos de la línea
				String[] partes = linea.split(";");

				String nombre = partes[0];
				String tipo = partes[1];
				int daño = Integer.parseInt(partes[2]);

				if (tipo.equalsIgnoreCase("Fuego")) {

					int duracionQuemadura = Integer.parseInt(partes[3]);

					hechizos.add(new HechizoFuego(nombre, daño, duracionQuemadura));
				}

				else if (tipo.equalsIgnoreCase("Tierra")) {

					int mejoraDefensa = Integer.parseInt(partes[3]);

					hechizos.add(new HechizoTierra(nombre, daño, mejoraDefensa));
				}

				else if (tipo.equalsIgnoreCase("Planta")) {

					String[] extras = partes[3].split(",");

					int duracionStun = Integer.parseInt(extras[0]);

					int cantPlantas = Integer.parseInt(extras[1]);

					hechizos.add(new HechizoPlanta(nombre, daño, duracionStun, cantPlantas));
				}

				else if (tipo.equalsIgnoreCase("Agua")) {

					String[] extras = partes[3].split(",");

					int cantidadHeal = Integer.parseInt(extras[0]);

					int presionAgua = Integer.parseInt(extras[1]);

					hechizos.add(new HechizoAgua(nombre, daño, cantidadHeal, presionAgua));
				}
			}

			lector.close();
		}

		catch (FileNotFoundException e) {

			System.out.println("No se encontró Hechizos.txt");
		}
	}

	// Busca un mago por nombre
	public Mago buscarMago(String nombre) {

		for (Mago mago : magos) {

			if (mago.getNombre().equalsIgnoreCase(nombre)) {
				return mago;
			}
		}

		return null;
	}

	// Lee los magos y asocia sus hechizos
	public void cargarMagos() {

		try {

			Scanner lector = new Scanner(new File("Magos.txt"));

			while (lector.hasNextLine()) {

				String linea = lector.nextLine();

				String[] partes = linea.split(";");

				String nombreMago = partes[0];

				Mago mago = new Mago(nombreMago);

				String[] nombresHechizos = partes[1].split("\\|");

				for (String nombreHechizo : nombresHechizos) {

					Hechizo hechizo = buscarHechizo(nombreHechizo);

					if (hechizo != null) {

						mago.agregarHechizo(hechizo);
					}
				}

				magos.add(mago);
			}

			lector.close();
		}

		catch (FileNotFoundException e) {

			System.out.println("No se encontró Magos.txt");
		}
	}
}