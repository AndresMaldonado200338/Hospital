package model;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Room> rooms;

    public Hospital() {
        rooms = new ArrayList<Room>();
    }

    /**
     * Metodo que agrega una habitacion a una lista de habitaciones
     * 
     * @param room
     */
    public void addRoom(Room room) {
        rooms.add(room);
    }

    /**
     * Metodo que muestra las habitaciones de un hospital
     * 
     * @return habitaciones
     */
    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    @Override
    public String toString() {
        return "Habitaciones:\n" + getRooms() + "";
    }
}
