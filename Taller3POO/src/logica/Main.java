package logica;

public class Main {

	public static void main(String[] args) {
		// Crea el sistema principal
		Sistema sistema = new Sistema();

		// Carga los hechizos disponibles
		sistema.cargarHechizos();

		// Carga los magos registrados
		sistema.cargarMagos();

		System.out.println("Hechizos cargados: " + sistema.getHechizos().size());

		System.out.println("Magos cargados: " + sistema.getMagos().size());
	}

}