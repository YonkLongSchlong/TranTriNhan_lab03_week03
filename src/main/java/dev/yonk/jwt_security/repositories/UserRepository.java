package dev.yonk.jwt_security.repositories;

import dev.yonk.jwt_security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> getUserByUsername(String username);

    Optional<User> findByEmail(String email);
}
