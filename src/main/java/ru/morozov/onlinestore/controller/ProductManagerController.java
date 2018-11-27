package ru.morozov.onlinestore.controller;

import ru.morozov.onlinestore.dao.ProductDAO;
import ru.morozov.onlinestore.entity.Product;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class ProductManagerController {

    @Inject
    private ProductDAO productDAO;

    public void removeProduct(Product product) {
        productDAO.removeProduct(product.getId());
    }

    public List<Product> getProducts() {
        return new ArrayList<>(productDAO.getListProduct());
    }

    public void addProduct() {
        productDAO.persist(new Product());
    }
}
