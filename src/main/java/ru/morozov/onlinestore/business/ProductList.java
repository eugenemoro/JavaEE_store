package ru.morozov.onlinestore.business;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	private List<String> products;
	public ProductList() {
		this.products = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			this.products.add("<a href=\"ipad.jsp\">\n" +
							"                    <img src = \"img/iPad.jpg\"\n" +
							"                    alt = \"iPad 32 Gb\"\n" +
							"                    title = \"iPad 32 Gb\"\n" +
							"                    width = \"173\" height = \"200\"\n" +
							"                    /><br>\n" +
							"                    iPad 32 Gb</a>\n");
		}
	}
	public List<String> getProducts() {
		return products;
	}
}
