package mk.ukim.finki.webseminarska_186034.service;

import mk.ukim.finki.webseminarska_186034.model.Category;

import java.util.List;

public interface CategoryService {

    Category create(String name, String description);

    Category update(String name, String description);

    void delete(String name);

    List<Category> listCategories();

    List<Category> searchCategories(String searchText);

}

