package entities;

public class Course {
    public int id;
    public String name;
    public String instructor;
    public String description;
    public double price;

    public Course() {
    }

    public Course(int id, String name,String instructor, String description, double price) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.description = description;
        this.price = price;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
