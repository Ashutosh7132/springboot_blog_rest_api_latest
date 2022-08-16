package com.springboot.blog.service.auth;

import com.springboot.blog.dto.user.LoginDto;
import com.springboot.blog.dto.user.RegisterDto;
import com.springboot.blog.entity.Role;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface AuthService {

    ResponseEntity<?> login(LoginDto dto);
    ResponseEntity<?> register(RegisterDto dto);
    void createRole(Role role);
    Optional<Role> findByRole(String roleType);
    void addRoleToUser(String email, String roleType);

}
