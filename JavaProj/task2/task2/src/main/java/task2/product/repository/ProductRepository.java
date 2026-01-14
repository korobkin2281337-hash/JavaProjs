package task2.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task2.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
