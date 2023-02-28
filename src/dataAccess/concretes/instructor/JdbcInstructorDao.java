package dataAccess.concretes.instructor;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.List;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile eklendi : " + instructor.getFirstName());
    }

    @Override
    public List<Instructor> getAll() {
        return List.of(
                new Instructor(1, "Engin", "Demiroğ", "engin@demirog.com", 100000),
                new Instructor(2, "Murat", "Korkmaz", "murat@korkmaz.com", 75000),
                new Instructor(3, "Ahmet", "Yılmaz", "ahmet@yilmaz.com", 50000)
        );
    }
}
