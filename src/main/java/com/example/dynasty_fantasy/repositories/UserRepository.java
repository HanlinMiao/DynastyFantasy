package com.example.dynasty_fantasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dynasty_fantasy.models.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
