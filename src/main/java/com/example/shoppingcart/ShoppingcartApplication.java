package com.example.shoppingcart;

import com.example.shoppingcart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ShoppingcartApplication {
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    PasswordEncoder passwordEncoder;
    public static void main(String[] args) {
        SpringApplication.run(ShoppingcartApplication.class, args);
    }

}
