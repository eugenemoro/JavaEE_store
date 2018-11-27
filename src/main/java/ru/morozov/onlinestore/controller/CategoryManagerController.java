package ru.morozov.onlinestore.controller;

import ru.morozov.onlinestore.dao.CategoryDAO;
import ru.morozov.onlinestore.entity.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class CategoryManagerController {
	@Inject
	private CategoryDAO categoryDAO;

	public void removeCategory(Category category) {
		categoryDAO.removeCategory(category.getId());
	}

	public List<Category> getCategories() {
		return new ArrayList<>(categoryDAO.getListCategory());
	}

	public void addCategory() {
		categoryDAO.persist(new Category());
	}
}
