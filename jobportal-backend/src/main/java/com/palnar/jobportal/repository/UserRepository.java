package com.palnar.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.palnar.jobportal.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
