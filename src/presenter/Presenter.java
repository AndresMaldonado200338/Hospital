package presenter;

import view.*;
import model.*;

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
					view.showGraphicMessage("Opcion 2");
					init();
					break;
				case 3:
					view.showGraphicMessage("Opcion 3");
					init();
					break;
				case 4:
					view.showGraphicMessage("Opcion 4");
					init();
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
		room.setId(validateId(view.readGraphicShort("Ingrese ID:")));
		room.setFloorNumber(validateFloorNumber(view.readGraphicShort("Ingrese número de piso:")));
		room.setRoomNumber(
				validateRoomNumber(view.readGraphicShort("Ingrese el número de habitación:"), room.getFloorNumber()));
		room.setBedNumbers(validateBedNumbers(view.readGraphicShort("Ingrese el número de camas:")));
		hospital.addRoom(room);
		view.showGraphicMessage(hospital.getRooms().toString());
		init();
	}

	/**
	 * Metodo que valida la id de una habitacion
	 * 
	 * @param id
	 * @return id si es valida, de lo contrario vuelve a solicitar un valor para la
	 *         id
	 */
	public short validateId(short id) {
		if (hospital.getRooms().isEmpty()) {
			return id;
		} else {
			boolean idExist = false;
			for (Room room : hospital.getRooms()) {
				if (room.getId() == id) {
					idExist = true;
					break;
				}
			}
			if (idExist) {
				view.showErrorMessage("ID YA EXISTE");
				return validateId(view.readGraphicShort("Ingrese ID:"));
			} else {
				return id;
			}
		}
	}

	/**
	 * Metodo que valida si el numero de piso es valido
	 * 
	 * @param floorNumber
	 * @return floorNumber si es valido, de lo contrario vuelve a solicitar un valor
	 *         para el piso
	 */
	public short validateFloorNumber(short floorNumber) {
		if (floorNumber > 0 && floorNumber <= 30) {
			return floorNumber;
		} else {
			view.showErrorMessage("NUMERO DE PISO NO VALIDO, INGRESE UN NUMERO ENTRE 1 Y 30");
			return validateFloorNumber(view.readGraphicShort("Ingrese número de piso:"));
		}
	}

	/**
	 * Metodo que valida si el numero de camas es valido
	 * 
	 * @param bedNumbers
	 * @return bedNumbers si es valido, de lo contrario vuelve a solicitar un valor
	 *         para el numero de camas
	 */
	public short validateBedNumbers(short bedNumbers) {
		if (bedNumbers > 0 && bedNumbers <= 5) {
			return bedNumbers;
		} else {
			view.showErrorMessage("NUMERO DE CAMAS NO VALIDO, INGRESE UN NUMERO ENTRE 1 Y 5");
			return validateBedNumbers(view.readGraphicShort("Ingrese el número de camas:"));
		}
	}

	/**
	 * Metodo que valida si el numero de habitacion es valido
	 * 
	 * @param roomNumber
	 * @return roomNumber si es valido, de lo contrario vuelve a solicitar un valor
	 */
	public short validateRoomNumber(short roomNumber, short floorNumber) {
		if (roomNumber <= 0 || roomNumber > 10) {
			view.showErrorMessage("NUMERO DE HABITACION NO VALIDO, INGRESE UN NUMERO ENTRE 1 Y 10");
			return validateRoomNumber(view.readGraphicShort("Ingrese el número de habitación:"), floorNumber);
		}
		if (hospital.getRooms().isEmpty()) {
			return roomNumber;
		}
		for (Room room : hospital.getRooms()) {
			if (room.getFloorNumber() == floorNumber && room.getRoomNumber() == roomNumber) {
				view.showErrorMessage("HABITACION YA EXISTENTE");
				return validateRoomNumber(view.readGraphicShort("Ingrese el número de habitación:"), floorNumber);
			}
		}
		return roomNumber;
	}



	public static void main(String[] args) {
		new Presenter();
	}
}
