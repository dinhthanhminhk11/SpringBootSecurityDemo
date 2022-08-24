package com.example.springsecurity.service;

import com.example.springsecurity.domain.Role;
import com.example.springsecurity.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String user, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
