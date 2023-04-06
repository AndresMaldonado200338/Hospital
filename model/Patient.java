package co.uptc.edu.HospitalService.model;

public class Patient {
	private String contactPhoneNumber;
	private String firstName;
	private String lastName;
	private Status status;

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Status getStatus() {
		return status;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
