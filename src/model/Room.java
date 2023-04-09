package model;

import java.util.ArrayList;

public class Room {
    private short bedNumbers;
    private short floorNumbers;
    private short id;
    private ArrayList<Patient> patients;
    private short roomNumber;

    public Room() {
        patients = new ArrayList<Patient>();
    }

    /**
     * Metodo que agrega un paciente a una lista de pacientes
     * 
     * @param patient
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    /**
     * Metodo que muestra una cama
     * 
     * @return numero de cama
     */
    public short getBedNumbers() {
        return this.bedNumbers;
    }

    /**
     * Metodo que muestra el numero de piso
     * 
     * @return piso del hospital
     */
    public short getFloorNumber() {
        return this.floorNumbers;
    }

    /**
     * Metodo que muestra el id de una habitacion
     * 
     * @return id de la habitacion
     */
    public short getId() {
        return this.id;
    }

    /**
     * Metodo que muestra los pacientes de una habitacion
     * 
     * @return pacientes de la habitacion
     */
    public ArrayList<Patient> getPatients() {
        return this.patients;
    }

    /**
     * Metodo que muestra una habitacion
     * 
     * @return numero de habitacion
     */
    public short getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * Metodo que crea una cama
     * 
     * @param bedNumbers
     */
    public void setBedNumbers(short bedNumbers) {
        this.bedNumbers = bedNumbers;
    }

    /**
     * Metodo que crea un piso
     * 
     * @param floorNumbers
     */
    public void setFloorNumber(short floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    /**
     * Metodo que crea un id
     * 
     * @param id
     */
    public void setId(short id) {
        this.id = id;
    }

    /**
     * Metodo que crea una habitacion
     * 
     * @param roomNumber
     */
    public void setRoomNumber(short roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Habitacion " + getFloorNumber() + "0" + getRoomNumber() + "\nID: " + getId() + "\nTotal camas: "
                + getBedNumbers() + "\nPacientes:\n" + getPatients() + "\n";
    }
}
