package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    //AppRole findByRolename(Long userId) ;
   // Set<AppRole> findByUserId(Long id);
    List<Role> findByRolename(Long userId) ;
}
