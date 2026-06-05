package logica;

import java.util.Scanner;

import dominio.HechizoAgua;
import dominio.HechizoFuego;
import dominio.HechizoPlanta;
import dominio.HechizoTierra;

public class Main {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	Sistema sistema = new Sistema();

    	sistema.cargarHechizos();
    	sistema.cargarMagos();
    	
    	int opcion;
    	do {
    	    System.out.println("-MENU-");
    	    System.out.println("1. Administrador");
    	    System.out.println("2. Analista");
    	    System.out.println("3. Salir");

    	    opcion = scan.nextInt();

    	    switch(opcion) {

    	        case 1:
    	        	int opcionAdmin;

    	        	do {

    	        	    System.out.println("1. Agregar Mago");
    	        	    System.out.println("2. Modificar Mago");
    	        	    System.out.println("3. Eliminar Mago");
    	        	    System.out.println("4. Agregar Hechizo");
    	        	    System.out.println("5. Modificar Hechizo");
    	        	    System.out.println("6. Eliminar Hechizo");
    	        	    System.out.println("7. Volver");

    	        	    opcionAdmin = scan.nextInt();
    	        	    switch(opcionAdmin) {

    	        	    case 1:

    	        	        scan.nextLine();

    	        	        System.out.print("Nombre del mago: ");
    	        	        String nombre = scan.nextLine();

    	        	        sistema.agregarMago(nombre);

    	        	        break;
    	        	        
    	        	    case 2:

    	        	        scan.nextLine();
    	        	        
    	        	        sistema.mostrarMagos();

    	        	        System.out.print("Nombre actual: ");
    	        	        String nombreActual = scan.nextLine();

    	        	        System.out.print("Nuevo nombre: ");
    	        	        String nuevoNombre = scan.nextLine();

    	        	        sistema.modificarMago(nombreActual, nuevoNombre);

    	        	        break;
    	        	        
    	        	    case 3:

    	        	        scan.nextLine();
    	        	        
    	        	        sistema.mostrarMagos();

    	        	        System.out.print("Nombre del mago: ");

    	        	        String nombreEliminar = scan.nextLine();

    	        	        if (sistema.eliminarMago(nombreEliminar)) {

    	        	            System.out.println("Mago eliminado correctamente");
    	        	        }

    	        	        else {

    	        	            System.out.println("Mago no encontrado");
    	        	        }

    	        	        break;
    	        	        
    	        	    case 4:
    	        	    	scan.nextLine();

    	        	    	System.out.print("Nombre: ");
    	        	    	String nombreHechizo = scan.nextLine();

    	        	    	System.out.println("Tipo:");
    	        	    	System.out.println("1. Fuego");
    	        	    	System.out.println("2. Tierra");
    	        	    	System.out.println("3. Planta");
    	        	    	System.out.println("4. Agua");

    	        	    	int tipo = scan.nextInt();

    	        	    	System.out.print("Daño: ");
    	        	    	int daño = scan.nextInt();
    	        	    	
    	        	    	if (tipo == 1) {

    	        	    	    System.out.print("Duracion quemadura: ");

    	        	    	    int duracion = scan.nextInt();

    	        	    	    sistema.agregarHechizo(new HechizoFuego(nombreHechizo, daño, duracion));
    	        	    	
    	        	    	}
    	        	    	else if (tipo == 2) {

    	        	    	    System.out.print("Mejora defensa: ");

    	        	    	    int defensa =scan.nextInt();

    	        	    	    sistema.agregarHechizo(new HechizoTierra(nombreHechizo,daño,defensa));
    	        	    	}
    	        	    	
    	        	    	else if (tipo == 3) {

    	        	    	    System.out.print("Duracion stun: ");

    	        	    	    int stun = scan.nextInt();

    	        	    	    System.out.print("Cantidad plantas: ");

    	        	    	    int plantas =scan.nextInt();

    	        	    	    sistema.agregarHechizo(new HechizoPlanta(nombreHechizo,daño,stun,plantas));
    	        	    	}
    	        	    	else if (tipo == 4) {

    	        	    	    System.out.print(
    	        	    	            "Cantidad heal: ");

    	        	    	    int heal =
    	        	    	            scan.nextInt();

    	        	    	    System.out.print(
    	        	    	            "Presion agua: ");

    	        	    	    int presion =
    	        	    	            scan.nextInt();

    	        	    	    sistema.agregarHechizo(new HechizoAgua(nombreHechizo,daño,heal,presion));
    	        	    	}
    	        	    	break;
    	        	   
    	        	    case 5:

    	        	        scan.nextLine();

    	        	        sistema.mostrarHechizos();

    	        	        System.out.print("Nombre del hechizo: ");

    	        	        String nombreActualHechizo = scan.nextLine();

    	        	        System.out.print("Nuevo nombre: ");

    	        	        String nuevoNombreHechizo = scan.nextLine();

    	        	        System.out.print("Nuevo daño: ");

    	        	        int nuevoDaño =scan.nextInt();

    	        	        sistema.modificarHechizo(nombreActualHechizo,nuevoNombreHechizo,nuevoDaño);

    	        	        break;
    	        	    	
    	        	    case 6:
    	        	    	scan.nextLine();

    	        	        sistema.mostrarHechizos();

    	        	        System.out.print("Nombre del hechizo: ");

    	        	        String hechizoEliminar =
    	        	                scan.nextLine();

    	        	        if (sistema.eliminarHechizo(
    	        	                hechizoEliminar)) {

    	        	            System.out.println(
    	        	                    "Hechizo eliminado correctamente"
    	        	            );
    	        	        }

    	        	        else {

    	        	            System.out.println(
    	        	                    "Hechizo no encontrado"
    	        	            );
    	        	        }

    	        	        break;
    	        	    	
    	        	}
	    	        	   
    	     	    
    	        	} while(opcionAdmin != 7);
    	        	break;

    	        case 2:
    	        	int opcionAnalisis;

    	        	do {
    	        	    System.out.println("1. Top 10 Mejores Hechizos");
    	        	    System.out.println("2. Top 3 Mejores Magos");
    	        	    System.out.println("3. Mostrar todos los Hechizos");
    	        	    System.out.println("4. Mostrar todos los Magos");
    	        	    System.out.println("5. Mostrar todos los Hechizos junto a su puntuacion");
    	        	    System.out.println("6. Mostrar todos los Magos junto a su puntuacion");
    	        	    System.out.println("7. Volver");

    	        	    opcionAnalisis = scan.nextInt();
    	        	    switch(opcionAnalisis) {
    	        		case 1:

    	        			sistema.top10Hechizos();

    	        			break;
    	        			
    	        		case 2:

    	        		    sistema.top3Magos();

    	        		    break;
    	        		case 3:

    	        		    sistema.mostrarHechizos();

    	        		    break;
    	        		case 4:

    	        		    sistema.mostrarMagos();

    	        		    break;
    	        		case 5:

    	        		    sistema.mostrarHechizosConPuntaje();

    	        		    break;
    	        		case 6:

    	        		    sistema.mostrarMagosConPuntaje();

    	        		    break;
    	        	    }
    	        	} while(opcionAnalisis != 7);
    	        	break;
    	        	
    	        case 3:
    	            System.out.println("Programa finalizado");
    	            break;

    	        default:
    	            System.out.println("Opcion invalida");
    	    }

    	} while(opcion != 3);

        
    }
}