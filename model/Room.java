package co.uptc.edu.HospitalService.model;

import java.util.List;

public class Room {
	private int bedNumbers;
	private int floorNumber;
	private int id;
	private List<Patient> patients;
	private int roomNumber;

	public void addPatient(Patient patient) {	
	}
	
	public int getBedNumbers() {
		return bedNumbers;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public int getId() {
		return id;
	}
	public List<Patient> getPatients() {
		return getPatients();
	}	
		public int getRoomNumber() {
			return roomNumber;
	}
	public void setBedNumbers(int bedNumbers) {
		this.bedNumbers = bedNumbers;
	}
	
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	}
	


