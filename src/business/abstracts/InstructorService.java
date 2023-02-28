package business.abstracts;

import entities.Instructor;

import java.util.List;

public interface InstructorService {
    void add(Instructor instructor) throws Exception;
    List<Instructor> getAll();
}
