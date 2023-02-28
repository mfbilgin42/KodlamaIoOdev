package dataAccess.concretes.course;

import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.List;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile eklendi: " + course.getName());
    }

    @Override
    public List<Course> getAll() {
        return List.of(
                new Course(1, "Java ile backend geliştirme", "Engin Demiroğ", "Java ile backend geliştirme", 0),
                new Course(2, "C# ile backend geliştirme", "Engin Demiroğ", "C# ile backend geliştirme", 0)
        );
    }
}
