package business.concretes;

import business.abstracts.InstructorService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager implements InstructorService{
    private final InstructorDao instructorDao;
    private final Logger logger;
    public InstructorManager(InstructorDao instructorDao, Logger logger) {
        this.instructorDao = instructorDao;
        this.logger = logger;
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        instructorDao.add(instructor);
    }

    @Override
    public List<Instructor> getAll() {
        return instructorDao.getAll();
    }
}