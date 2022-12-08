//package com.example.shoppingcart.service;
//
//import com.example.shoppingcart.entity.Role;
//import com.example.shoppingcart.entity.User;
//import com.example.shoppingcart.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Set;
//import java.util.stream.Collectors;
//@Service
//public class UserService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("username not found");
//        } else {
//            return new CustomUserDetails(user);
//        }
///*
//        private Collection<? extends GrantedAuthority> mapRolesToAuthority (Set<Role> roles ) {
//            return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
//        }
//
//    }
//*/
//    }
//}
