package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatePatient {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Patient> patients = new ArrayList<Patient>();

		System.out.print("Ingrese el numero de pacientes: ");
		int numPatients = console.nextInt();
		console.nextLine();

		for (int i = 0; i < numPatients; i++) {
			System.out.println("Ingresando los datos del paciente " + (i + 1));
			System.out.print("Numero de telefono: ");
			String contactPhoneNumber = console.nextLine();

			System.out.print("Nombre: ");
			String firstName = console.nextLine();

			System.out.print("Apellido: ");
			String lastName = console.nextLine();

			System.out.print("Estado: ACTIVO\n");
			Status status = Status.ACTIVE;

			Patient patient = new Patient();
			patient.setContactPhoneNumber(contactPhoneNumber);
			patient.setFirstName(firstName);
			patient.setLastName(lastName);
			patient.setStatus(status);

			patients.add(patient);
		}

		System.out.println("\nLista de pacientes:");
		for (Patient patient : patients) {
			System.out.println(
					"Numero de Telefono: " + patient.getContactPhoneNumber() + " | Nombre: " + patient.getFirstName()
							+ " | Apellido: " + patient.getLastName() + " | Estado: " + patient.getStatus().getName());
		}
	}
}