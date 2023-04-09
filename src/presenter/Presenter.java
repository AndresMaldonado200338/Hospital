package presenter;

import view.*;
import model.*;
import java.lang.NumberFormatException;

public class Presenter {
	Hospital hospital = new Hospital();
	View view = new View();

	public Presenter() {
		init();
	}

	public void init() {
		String menu = "       .....BIENVENIDOS A HOSPITAPP.....      "
				+ "\n1 - Crear una habitación\n2 - Crear un paciente"
				+ "\n3 - Mostrar el Historial de pacientes por Habitación" + "\n4 - Generar XML\n5 - Salir";
		try {
			int option = view.readGraphicInt(menu + "\nSeleccione una opción:");
			switch (option) {
				case 1:
					createRoom();
					break;
				case 2:
					createPatient();
					break;
				case 3:
					showHistorial();
					break;
				case 4:
					createXML();
					break;
				case 5:
					view.showGraphicMessage("----Adios----");
					break;
				default:
					view.showErrorMessage("OPCION NO VALIDA");
					init();
					break;
			}
		} catch (Exception e) {
			view.showErrorMessage("OPCION NO VALIDA");
			init();
		}

	}

	public void createRoom() {
		String menu = "       ...CREAR UNA HABITACION...      " + "\n1 - Ingrese ID\n2 - Ingrese número de piso"
				+ "\n3 - Ingrese el número de habitación"
				+ "\n4 - Ingrese el número de camas\n5 - Salir";
		Room room = new Room();
		try {
			int option = view.readGraphicInt(menu + "\nSeleccione una opción:");
			switch (option) {
				case 1:
					createRoom();
					break;
				case 2:
					createRoom();
					break;
				case 3:
					createRoom();
					break;
				case 4:
					createRoom();
					break;
				case 5:
					break;
				default:
					view.showErrorMessage("OPCION NO VALIDA");
					createRoom();
					break;
			}
		} catch (Exception e) {
			view.showErrorMessage("OPCION NO VALIDA");
			createRoom();
		}
	}

	public void createPatient() {
		String menu = "       ...CREAR PACIENTE...      "
				+ "\n1 - Ingrese numero de habitacion\n2 - Ingrese nombre del paciente"
				+ "\n3 - Ingrese apellido del paciente" + "\n4 - Ingrese telefono de contacto\n5 - Salir";
	}

	public void showHistorial() {

	}

	public void createXML() {

	}

	public static void main(String[] args) {
		new Presenter();
	}
}
