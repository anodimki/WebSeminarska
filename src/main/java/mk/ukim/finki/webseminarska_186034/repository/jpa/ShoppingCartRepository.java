package mk.ukim.finki.webseminarska_186034.repository.jpa;

import mk.ukim.finki.webseminarska_186034.model.ShoppingCart;
import mk.ukim.finki.webseminarska_186034.model.User;
import mk.ukim.finki.webseminarska_186034.model.enumerations.ShoppingCartStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    Optional<ShoppingCart> findByUserAndStatus(User user, ShoppingCartStatus status);
}

