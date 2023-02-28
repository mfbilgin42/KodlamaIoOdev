package business.abstracts;

import entities.Category;

import java.util.List;

public interface CategoryService {
    void add(Category category) throws Exception;
    List<Category> getAll();

}
