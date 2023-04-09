package presenter;

import view.*;
import model.*;
import javax.swing.JOptionPane;

public class Presenter {
	Patient newPatient = new Patient();
	View view = new View();

	public Presenter() {

		String[] options = { "1 Crear una habitación", "2 Crear un paciente",
				"3 Mostrar el Historial de pacientes pot Habitación", "4 Generar XML", "5 Salir" };

		int selection = 0;

		while (selection < 1 || selection > 5) {
			String selectedOption = JOptionPane.showInputDialog(null,
					"       .....BIENVENIDOS A HOSPITAPP.....      "
							+ "\n1 - Crear una habitación\n2 - Crear un paciente"
							+ "\n3 - Mostrar el Historial de pacientes por Habitación" + "\n4 - Generar XML\n5 - Salir",
					"HOSPITAPP", JOptionPane.PLAIN_MESSAGE);

			try {
				selection = Integer.parseInt(selectedOption);
			} catch (NumberFormatException e) {
				selection = 0;
			}
			if (selection < 1 || selection > 5) {
				JOptionPane.showMessageDialog(null, "Opción no válida");
			}
		}
		switch (selection) {
		case 1:
			JOptionPane.showMessageDialog(null, "Has seleccionado la opción 1");
			String[] options1 = { "1 Ingrese ID", "2 Ingrese Numero de piso", "3 Ingrese el numero de habitación",
					"4 Ingrese el numero de camas", "5 Salir" };
			int selection1 = 0;

			while (selection1 < 1 || selection1 > 5) {
				String selectedOption1 = JOptionPane.showInputDialog(null,
						"       ...CREAR UNA HABITACION...      " + "\n1 - Ingrese ID\n2 - Ingrese número de piso"
								+ "\n3 - Ingrese el número de habitación"
								+ "\n4 - Ingrese el número de camas\n5 - Salir",
						"Menú crear Habitación", JOptionPane.PLAIN_MESSAGE);

				try {
					selection1 = Integer.parseInt(selectedOption1);
				} catch (NumberFormatException e) {
					selection1 = 0;
				}
				if (selection1 < 1 || selection1 > 5) {
					JOptionPane.showMessageDialog(null, "Opción no válida");
				}

			}
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Has seleccionado la opción 2");
			String[] options2 = { "1 Ingrese numero de habitacion", "2 Ingrese Nombre del paciente",
					"3 Ingrese el appellido del paciente", "4 Ingrese telefono de contacto", "5 Salir" };
			int selection2 = 0;

			while (selection2 < 1 || selection2 > 5) {
				String selectedOption2 = JOptionPane.showInputDialog(null, "       ...CREAR PACIENTE...      "
						+ "\n1 - Ingrese numero de habitacion\n2 - Ingrese nombre del paciente"
						+ "\n3 - Ingrese apellido del paciente" + "\n4 - Ingrese telefono de contacto\n5 - Salir",
						"Menú crear nuevo paciente", JOptionPane.PLAIN_MESSAGE);

				try {
					selection2 = Integer.parseInt(selectedOption2);
				} catch (NumberFormatException e) {
					selection1 = 0;
				}
				if (selection2 < 1 || selection2 > 5) {
					JOptionPane.showMessageDialog(null, "Opción no válida");
				}

			}
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Has seleccionado la opción 3");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Has seleccionado la opción 4");
		case 5:
			JOptionPane.showMessageDialog(null, "Sesion Finalizada!");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opción no válida");
			break;
		}

	}

	public static void main(String[] args) {
		new Presenter();
	}
}

