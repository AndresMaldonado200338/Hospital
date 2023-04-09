package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateRoom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Room> rooms = new ArrayList<Room>();

        System.out.print("Ingrese el numero de habitaciones: ");
        int numRooms = console.nextInt();
        console.nextLine();

        for (int i = 0; i < numRooms; i++) {
            System.out.println("Ingresando los datos de la habitacion " + (i + 1));
            System.out.print("Numero de piso: ");
            short floorNumber = console.nextShort();
            console.nextLine();

            System.out.print("Numero de habitacion: ");
            short roomNumber = console.nextShort();
            console.nextLine();

            System.out.print("ID de habitacion: ");
            short Id = console.nextShort();
            console.nextLine();

            System.out.print("Numero de camas: ");
            short bedNumbers = console.nextShort();
            console.nextLine();

            Room room = new Room();
            room.setRoomNumber(roomNumber);
            room.setFloorNumber(floorNumber);
            room.setId(Id);
            room.setBedNumbers(bedNumbers);

            rooms.add(room);
            System.out.println("\nLista de habitaciones:");
            for (Room room1 : rooms) {
                System.out.println(room1.toString());
            }
        }
    }
}
