package business.concretes;

import business.abstracts.InstructorService;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager implements InstructorService{
    private final InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
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