package model;

public class Patient {
    private String contactPhoneNumber;
    private String firstName;
    private String lastName;
    private Status status;

    /**
     * Metodo que muestra el numero de contacto de un paciente
     * 
     * @return numero de contacto del paciente
     */
    public String getContactPhoneNumber() {
        return this.contactPhoneNumber;
    }

    /**
     * Metodo que muestra el nombre de un paciente
     * 
     * @return nombre del paciente
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Metodo que muestra el apellido de un paciente
     * 
     * @return apellido del paciente
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Metodo que muestra el estado de un paciente
     * 
     * @return
     */
    public Status getStatus() {
        return this.status;
    }

    /**
     * Metodo que crea el numero de contacto de un paciente
     * 
     * @param contactPhoneNumber
     */
    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    /**
     * Metodo que crea el nombre de un paciente
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Metodo que crea el apellido de un paciente
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Metodo que crea el estado de un paciente
     * 
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nNombre: " + getFirstName() + "\nApellido: " + getLastName() + "\nNumero de telefono: "
                + getContactPhoneNumber() + "\nEstado: " + getStatus().getName();
    }
}
