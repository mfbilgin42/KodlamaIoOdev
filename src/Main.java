import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import core.logging.concretes.DatabaseLogger;
import core.logging.concretes.FileLogger;
import core.logging.concretes.MailLogger;
import dataAccess.concretes.category.HibernateCategoryDao;
import dataAccess.concretes.category.JdbcCategoryDao;
import dataAccess.concretes.course.HibernateCourseDao;
import dataAccess.concretes.instructor.HibernateInstructorDao;
import dataAccess.concretes.instructor.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        //Define Categories
        Category category = new Category(1, "Category 1");
        Category category2 = new Category(2, "Category 2");
        //Define CategoryManagers
        CategoryManager categoryManagerWithHibernate = new CategoryManager(new HibernateCategoryDao(), new FileLogger());
        CategoryManager categoryManagerWithJdbc = new CategoryManager(new JdbcCategoryDao(), new FileLogger());
        //Add Categories
        categoryManagerWithHibernate.add(category);
        categoryManagerWithJdbc.add(category2);
        System.out.println("--------------------------------------------------");
        //Define Courses
        Course course = new Course(1, 1, "Course 1", "Instructor", "Description", 0);
        Course course2 = new Course(2, 1, "Course 2", "Instructor", "Description", 0);
        //Define CourseManagers
        CourseManager courseManagerWithHibernate = new CourseManager(new HibernateCourseDao(), new MailLogger());
        CourseManager courseManagerWithJdbc = new CourseManager(new HibernateCourseDao(), new DatabaseLogger());
        //Add Courses
        courseManagerWithHibernate.add(course);
        courseManagerWithJdbc.add(course2);
        System.out.println("--------------------------------------------------");
        //Define Instructors
        Instructor instructor = new Instructor(1, "Ahmet", "Yılmaz","ahmet@yılmaz.com",20000);
        Instructor instructor2 = new Instructor(2, "Mehmet", "Yılmaz","mehmet@yılmaz.com",20000);
        //Define InstructorManagers
        InstructorManager instructorManagerWithHibernate = new InstructorManager(new HibernateInstructorDao(), new MailLogger());
        InstructorManager instructorManagerWithJdbc = new InstructorManager(new JdbcInstructorDao(), new DatabaseLogger());
        //Add Instructors
        instructorManagerWithHibernate.add(instructor);
        instructorManagerWithJdbc.add(instructor2);

    }
}