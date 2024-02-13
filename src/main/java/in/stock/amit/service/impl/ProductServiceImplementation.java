package in.stock.amit.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.stock.amit.entity.Product;
import in.stock.amit.interceptor.ProductInterceptor;
import in.stock.amit.repo.ProductRepository;
import in.stock.amit.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService {

	private Logger log = LoggerFactory.getLogger(ProductInterceptor.class);

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public String createProduct(Product product) {
		productRepo.save(product);
		log.info("service method called successfully");
		return "Saved";
	}

	@Override
	public List<Product> getProduct() {
		return productRepo.findAll();
	}

}
