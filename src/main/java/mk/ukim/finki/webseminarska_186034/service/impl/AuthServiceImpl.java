package mk.ukim.finki.webseminarska_186034.service.impl;

import mk.ukim.finki.webseminarska_186034.model.User;
import mk.ukim.finki.webseminarska_186034.model.exceptions.*;
import mk.ukim.finki.webseminarska_186034.repository.jpa.*;
import mk.ukim.finki.webseminarska_186034.service.*;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(InvalidUserCredentialsException::new);
    }

}

