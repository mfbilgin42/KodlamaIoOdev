package dataAccess.abstracts;

import entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    List<Course> getAll();
}
