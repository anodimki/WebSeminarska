package mk.ukim.finki.webseminarska_186034.bootstrap;

import lombok.Getter;
import mk.ukim.finki.webseminarska_186034.model.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Getter
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts = new ArrayList<>();

}
