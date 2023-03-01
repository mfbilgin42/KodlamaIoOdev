package business.concretes;

import business.abstracts.CategoryService;
import core.logging.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    private final CategoryDao categoryDao;
    private final Logger logger;

    public CategoryManager(CategoryDao categoryDao, Logger logger) {
        this.categoryDao = categoryDao;
        this.logger = logger;
    }
    public void add(Category category) throws Exception {
        List<Category> categories = categoryDao.getAll();

        for (Category existCategory : categories) {
            if (existCategory.getName().equals(category.getName())){
                throw new Exception("Category already exists");
            }
        }
        categoryDao.add(category);
        logger.log("Category added: " + category.getName());
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}
