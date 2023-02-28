package dataAccess.concretes.category;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.List;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile eklendi: " + category.getName());
    }

    @Override
    public List<Category> getAll() {
        return List.of(
                new Category(1, "Java"),
                new Category(2, "C#")
        );
    }
}
