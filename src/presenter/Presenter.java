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
					view.showGraphicMessage("opcion 1");
					init();
					break;
				case 2:
					view.showGraphicMessage("opcion 2");
					init();
					break;
				case 3:
					view.showGraphicMessage("opcion 3");
					init();
					break;
				case 4:
					view.showGraphicMessage("opcion 4");
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

	public static void main(String[] args) {
		new Presenter();
	}
}
