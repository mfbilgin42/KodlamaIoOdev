package business.concretes;

import business.abstracts.CategoryService;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    private final CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
    public void add(Category category) throws Exception {
        List<Category> categories = categoryDao.getAll();

        for (Category existCategory : categories) {
            if (existCategory.getName().equals(category.getName())){
                throw new Exception("Category already exists");
            }
        }
        categoryDao.add(category);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}
