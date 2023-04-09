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
					System.exit(0);
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
				+ "\n4 - Ingrese el número de camas";
		view.showGraphicMessage(menu);
		Room room = new Room();
		room.setId(view.readGraphicShort("Ingrese ID:"));
		if (hospital.getRooms().isEmpty()) {
			room.setFloorNumber(view.readGraphicShort("Ingrese número de piso:"));
			room.setRoomNumber(view.readGraphicShort("Ingrese el número de habitación:"));
			room.setBedNumbers(view.readGraphicShort("Ingrese el número de camas:"));
			hospital.addRoom(room);
			view.showGraphicMessage(hospital.getRooms().toString());
			init();
		} else{
			for (int i = 0; i < hospital.getRooms().size(); i++) {
				if (hospital.getRooms().get(i).getId() != room.getId()) {
					room.setFloorNumber(view.readGraphicShort("Ingrese número de piso:"));
					room.setRoomNumber(view.readGraphicShort("Ingrese el número de habitación:"));
					room.setBedNumbers(view.readGraphicShort("Ingrese el número de camas:"));
					hospital.addRoom(room);
					init();
				} else {
					view.showErrorMessage("ID YA EXISTENTE");
					init();
				}
			}
		}
		init();
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
