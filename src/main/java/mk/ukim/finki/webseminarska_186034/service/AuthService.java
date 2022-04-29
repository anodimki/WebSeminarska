package mk.ukim.finki.webseminarska_186034.service;

import mk.ukim.finki.webseminarska_186034.model.User;

public interface AuthService {
    User login(String username, String password);
}

