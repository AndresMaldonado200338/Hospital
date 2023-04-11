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
					view.showGraphicMessage("Opcion 1");
					init();
					break;
				case 2:
					createPatient();
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

	public void createPatient() {
		String menu = "       ...CREAR PACIENTE...      "
				+ "\n1 - Ingrese numero de habitacion\n2 - Ingrese nombre del paciente"
				+ "\n3 - Ingrese apellido del paciente" + "\n4 - Ingrese telefono de contacto\n5 - Salir";
		view.showGraphicMessage(menu);
		Patient patient = new Patient();
		short floorNumber = view.readGraphicShort("Ingrese numero de piso");
		short roomNumber = view.readGraphicShort("Ingrese numero de habitacion:");
		Room roomToPatient = validatePatientRoomNumber(floorNumber, roomNumber);
		validateBedForPatients(roomToPatient);
		patient.setFirstName(view.readGraphicString("Ingrese nombre del paciente:"));
		patient.setLastName(view.readGraphicString("Ingrese apellido del paciente:"));
		patient.setContactPhoneNumber(view.readGraphicString("Ingrese telefono de contacto:"));
		patient.setStatus(Status.ACTIVE);
		roomToPatient.addPatient(patient);
		view.showGraphicMessage("PACIENTE CREADO");
		view.showGraphicMessage(roomToPatient.getPatients().toString());
		init();
	}

	/**
	 * Metodo que valida si existe la habitacion donde se va a ingresar el paciente
	 * 
	 * @param floorNumber
	 * @param roomNumber
	 * @return room si existe, de lo contrario vuelve a menu principal
	 */
	public Room validatePatientRoomNumber(short floorNumber, short roomNumber) {
		for (Room room : hospital.getRooms()) {
			if (room.getFloorNumber() == floorNumber && room.getRoomNumber() == roomNumber) {
				return room;
			}
		}
		view.showErrorMessage("HABITACION NO EXISTE");
		init();
		return null;
	}

	/**
	 * Metodo que valida si la habitacion tiene camas disponibles
	 * @param room
	 */
	public void validateBedForPatients(Room room) {
		if (room.getBedNumbers() > room.getPatients().size()) {
			view.showGraphicMessage("HABITACION DISPONIBLE");
		} else {
			view.showErrorMessage("HABITACION LLENA");
			init();
		}
	}

	public static void main(String[] args) {
		new Presenter();
	}
}
