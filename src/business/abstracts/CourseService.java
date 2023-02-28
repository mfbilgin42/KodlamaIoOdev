package business.abstracts;

import entities.Course;

import java.util.List;

public interface CourseService {
    void add(Course course) throws Exception;
    List<Course> getAll();
}
