package in.stock.amit.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.stock.amit.entity.Product;
import in.stock.amit.service.ProductService;

@RestController
public class OrdererController {

	@Autowired
	private ProductService productRepository;

	private Logger log = LoggerFactory.getLogger(OrdererController.class);

	@GetMapping("/get")
	public List<Product> saveProduct() {

		log.info("controller save method called");

		List<Product> product = productRepository.getProduct();
		log.info(" save successfully");

		return product;
	}

}
