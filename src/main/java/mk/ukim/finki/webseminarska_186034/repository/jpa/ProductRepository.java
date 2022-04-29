package mk.ukim.finki.webseminarska_186034.repository.jpa;

import mk.ukim.finki.webseminarska_186034.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);
    void deleteByName(String name);
}
