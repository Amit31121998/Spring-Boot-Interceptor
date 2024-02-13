package in.stock.amit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.stock.amit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
