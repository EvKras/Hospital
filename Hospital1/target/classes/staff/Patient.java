package staff;

class Patient extends Person {
    int age;
    String sex;
    String status;
    String diagnosis;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient(String name, String surname, String sex, String status, String diagnosis, int age) {
        super(name, surname);
        this.sex = sex;
        this.status = status;
        this.diagnosis = diagnosis;
        this.age = age;
    }

    class Treatments {
        String procedure;
        String medicine;

        public String getProcedure() {
            return procedure;
        }

        public void setProcedure(String procedure) {
            this.procedure = procedure;
        }

        public String getMedicine() {
            return medicine;
        }

        public void setMedicine(String medicine) {
            this.medicine = medicine;
        }

    }
}
