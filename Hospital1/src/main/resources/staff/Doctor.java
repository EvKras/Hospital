package staff;

class Doctor extends Person {

    String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Doctor(String name, String surname, String role) {
        super(name, surname);
        this.role = role;
    }

}
