package entities;

public class Course {
    public int id;
    public int categoryId;
    public String name;
    public String instructor;
    public String description;
    public double price;

    public Course(int id,int categoryId, String name,String instructor, String description, double price) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.instructor = instructor;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
