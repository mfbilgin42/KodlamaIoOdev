package business.concretes;

import business.abstracts.InstructorService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager implements InstructorService{
    private final InstructorDao instructorDao;
    private final List<Logger> loggers;
    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName() + " " + instructor.getSurname() + " added");
        }
    }

    @Override
    public List<Instructor> getAll() {
        return instructorDao.getAll();
    }
}