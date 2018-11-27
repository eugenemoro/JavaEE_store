package ru.morozov.onlinestore.dao;

import ru.morozov.onlinestore.entity.Category;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Stateless
public class CategoryDAO extends AbstractDAO{

	public Collection<Category> getListCategory() {
		return em.createQuery("select e from Category e", Category.class).getResultList();
	}

	public void persist(Category category) {
		if (category == null) return;
		em.persist(category);
	}

	public Category getCategoryById(String id) {
		if (id == null) return null;
		return em.find(Category.class, id);
	}

	public void merge(Category category) {
		if (category == null) return;
		em.merge(category);
	}

	public void removeCategory(String categoryId) {
		if (categoryId == null) return;
		Category category = getCategoryById(categoryId);
		em.remove(category);
	}
}
