package dataAccess.abstracts;

import entities.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    List<Category> getAll();
}
