package dataAccess.abstracts;

import entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);
    List<Instructor> getAll();
}
