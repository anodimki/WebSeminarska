package mk.ukim.finki.webseminarska_186034.service;

import mk.ukim.finki.webseminarska_186034.model.Product;
import mk.ukim.finki.webseminarska_186034.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    List<Product> listAllProductsInShoppingCart(Long cartId);
    ShoppingCart getActiveShoppingCart(String username);
    ShoppingCart addProductToShoppingCart(String username, Long productId);
}

