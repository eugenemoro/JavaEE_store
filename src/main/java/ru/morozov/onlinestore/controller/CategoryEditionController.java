package ru.morozov.onlinestore.controller;

import ru.morozov.onlinestore.dao.CategoryDAO;
import ru.morozov.onlinestore.entity.Category;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class CategoryEditionController extends AbstractController{

	private final String id = getParamString("id");

	@Inject
	private CategoryDAO categoryDAO;

	private Category category;

	@PostConstruct
	private void init() {
		category = categoryDAO.getCategoryById(id);
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String save() {
		categoryDAO.merge(category);
		return "test";
	}
}
