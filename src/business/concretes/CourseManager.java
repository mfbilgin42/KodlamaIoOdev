package business.concretes;

import business.abstracts.CourseService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager implements CourseService {
    private final CourseDao courseDao;
    private final Logger logger;

    public CourseManager(CourseDao courseDao, Logger logger) {
        this.courseDao = courseDao;
        this.logger = logger;
    }

    @Override
    public void add(Course course) throws Exception {
        List<Course> courses = courseDao.getAll();
        for (Course existingCourse : courses) {
            if (existingCourse.getName().equals(course.getName())) {
                throw new Exception("Course already exists");
            }
        }
        if (course.getPrice() < 0) {
            throw new Exception("Course price cannot be negative");
        }
        courseDao.add(course);
        logger.log("Course added: " + course.getName());
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll();
    }

}
