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
		
		System.out.println("Puntaje primer hechizo: " + sistema.getHechizos().get(0).calcularPuntaje());
		
		System.out.println("Puntaje primer mago: " + sistema.getMagos().get(0).calcularPuntaje());
		
		System.out.println();
		 
		sistema.top10Hechizos();

		System.out.println();

		sistema.top3Magos();
	}

}