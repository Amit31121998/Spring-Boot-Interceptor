package in.stock.amit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.stock.amit.entity.Product;
import in.stock.amit.interceptor.ProductInterceptor;
import in.stock.amit.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productSer;
	
	private Logger log = LoggerFactory.getLogger(ProductController.class);

	
	@PostMapping("/product")
	public String saveProduct(@RequestBody Product product) {
		
		log.info("controller save method called");
		
		String msg = productSer.createProduct(product);
		
		log.info(" save successfully");
		
		
		return msg;
	}

}
