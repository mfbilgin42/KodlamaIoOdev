package business.concretes;

import business.abstracts.CategoryService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import dataAccess.concretes.category.HibernateCategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    private final CategoryDao categoryDao;
    private final List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception {
        List<Category> categories = categoryDao.getAll();

        for (Category existCategory : categories) {
            if (existCategory.getName().equals(category.getName())){
                throw new Exception("Category already exists");
            }
        }
        HibernateCategoryDao categoryDao = new HibernateCategoryDao();
        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getName() + " added");
        }
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}
