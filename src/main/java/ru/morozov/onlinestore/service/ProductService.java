package ru.morozov.onlinestore.service;

import ru.morozov.onlinestore.dto.ProductRecord;
import ru.morozov.onlinestore.dao.*;
import ru.morozov.onlinestore.entity.Product;
import ru.morozov.onlinestore.enums.ProductType;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

@Path("/productService")
@WebService
public class ProductService {

	@Inject
	private ProductDAO productDAO;
	@Inject
	private CategoryDAO categoryDAO;

	@GET
	@Path("/getListProduct")
	@WebMethod
	@Produces({MediaType.APPLICATION_JSON})
	public List<ProductRecord> getListProduct() {
		return ProductRecord.toList(productDAO.getListProduct());
	}

	@GET
	@Path("/createProductByName")
	@WebMethod
	@Produces({MediaType.APPLICATION_JSON})
	public ProductRecord createProductByName(
					@QueryParam(value = "name")
					@WebParam(name = "name", partName = "name")
					String name
	) {
		final Product product = new Product();
		product.setName(name);
		product.setDescription("");
		product.setProductType(ProductType.COMPUTER);
		productDAO.merge(product);
		return new ProductRecord(product);
	}

	@GET
	@Path("/getProductById")
	@WebMethod
	@Produces({MediaType.APPLICATION_JSON})
	public ProductRecord getProductById(
					@QueryParam(value = "id")
					@WebParam(name = "id", partName = "id")
					String id
	) {
		final Product product = productDAO.getProductById(id);
		if (product == null) return null;
		return new ProductRecord(product);
	}

	@GET
	@Path("/getProductByName")
	@WebMethod
	@Produces({MediaType.APPLICATION_JSON})
	public ProductRecord getProductByName(
					@QueryParam(value = "name")
					@WebParam(name = "name", partName = "name")
					String name
	) {
		final Product product = productDAO.getProductByName(name);
		if (product == null) return null;
		return new ProductRecord(product);
	}

	@GET
	@Path("/removeProductById")
	@WebMethod
	@Produces({MediaType.APPLICATION_JSON})
	public void removeProductById(
					@QueryParam(value = "id")
					@WebParam(name = "id", partName = "id")
					String id
	) {
		productDAO.removeProduct(id);
	}

	@GET
	@Path("/getProductsByCategory")
	@WebMethod
	@Produces({MediaType.APPLICATION_JSON})
	public List<Product> getProductsByCategory(
					@QueryParam(value = "category")
					@WebParam(name = "category", partName = "category")
					String category
	) {
		return categoryDAO.getCategoryById(category).getProducts();
	}
}
