package com.example.springsecurity.repo;

import com.example.springsecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String username);
}
