package in.stock.amit.service;

import java.util.List;

import in.stock.amit.entity.Product;

public interface ProductService {

	public String createProduct(Product product);

	List<Product> getProduct();
	
}
