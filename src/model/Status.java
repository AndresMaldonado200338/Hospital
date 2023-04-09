package model;

public enum Status {
    ACTIVE ("Activo"), INACTIVE ("Inactivo");

    private String name;

    private Status(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
