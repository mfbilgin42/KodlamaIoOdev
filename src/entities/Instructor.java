package entities;

public class Instructor {
    public int id;
    public String firstName;
    public String surname;
    public String email;
    public double salary;

    public Instructor(int id, String name, String surname, String email, double salary) {
        this.id = id;
        this.firstName = name;
        this.surname = surname;
        this.email = email;
        this.salary = salary;
    }

    public Instructor() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
