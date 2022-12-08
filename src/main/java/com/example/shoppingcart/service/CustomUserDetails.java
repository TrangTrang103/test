//package com.example.shoppingcart.service;
//
//import com.example.shoppingcart.entity.Role;
//import com.example.shoppingcart.entity.User;
//import com.example.shoppingcart.repository.RoleRepository;
//import com.example.shoppingcart.repository.UserRepository;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.Set;
//
//@Service
//@NoArgsConstructor
//public class CustomUserDetails implements UserDetails {
//
//    private User user ;
//
//    @Autowired
//    private RoleRepository roleRepository ;
//
//    public CustomUserDetails(User user) {
//        this.user = user ;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        Set<Role> roles = user.getRoles() ;
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        for (Role role:
//             roles) {
//            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
//        }
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getEncrytedPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return user.isEnable();
//    }
//    public User getUser() {
//        return user;
//    }
//}
