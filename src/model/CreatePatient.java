package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatePatient {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Patient> patients = new ArrayList<Patient>();

        System.out.print("Ingrese pacientes: ");
        int numPatients = console.nextInt();
        console.nextLine();

        for (int i = 0; i < numPatients; i++) {
            System.out.println("Ingresando los datos del paciente " + (i + 1));
            System.out.print("Nombre de paciente: ");
            String name = console.nextLine();

            System.out.print("Apellido del paciente: ");
            String lastName = console.nextLine();

            System.out.print("Numero de contacto: ");
            String contactNumber = console.nextLine();

            System.out.print("Estado: ");
            Status status = Status.ACTIVE.getName();
            console.nextLine();

            Patient patient = new Patient();
            patient.setfirstName(name);
            patient.setLastName(lastName);
            patient.setContactPhoneNumber(Id);
            patient.setStatus(status);

            rooms.add(room);
            System.out.println("\nLista de habitaciones:");
            for (Room room1 : rooms) {
                System.out.println(room1.toString());
            }
        }
    }
}
