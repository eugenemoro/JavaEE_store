package ru.morozov.onlinestore.business;

import ru.morozov.onlinestore.dao.CategoryDAO;
import ru.morozov.onlinestore.dao.ProductDAO;
import ru.morozov.onlinestore.entity.Product;

import javax.ejb.Stateful;
import javax.inject.Inject;
import java.util.HashMap;

@Stateful
public class ShoppingCart {
	private HashMap<Product, Integer> productList;
	@Inject
	ProductDAO productDAO;

	private boolean containsProduct(Product product) {
		return productList.containsKey(product);
	}

	public void addToCart(String id) {
		Product product = productDAO.getProductById(id);
		if (!containsProduct(product)) {
			productList.put(product, 1);
		} else {
			productList.put(product, productList.get(product) + 1);
		}
	}

	public void addOneToCart(String id) {
		Product product = productDAO.getProductById(id);
		productList.put(product, productList.get(product) + 1);
	}

	public void removeOneFromCart(String id) {
		Product product = productDAO.getProductById(id);
		productList.put(product, productList.get(product) - 1);
		if (productList.get(product) == 0) {
			productList.remove(product);
		}
	}

	public HashMap<Product, Integer> getProductList() {
		return productList;
	}

}
