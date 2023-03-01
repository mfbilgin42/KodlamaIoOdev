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

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
}
