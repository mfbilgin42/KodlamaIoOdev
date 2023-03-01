package business.concretes;

import business.abstracts.CourseService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager implements CourseService {
    private final CourseDao courseDao;
    private final List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
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
        for (Logger logger : loggers) {
            logger.log(course.getName() + " added");
        }
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll();
    }

}
