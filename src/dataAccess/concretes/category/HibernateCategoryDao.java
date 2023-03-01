package dataAccess.concretes.category;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile eklendi : " + category.getName());
    }

    @Override
    public List<Category> getAll() {
        return List.of(
                new Category(1, "Yazılım"),
                new Category(2, "Dil")
        );
    }
}
