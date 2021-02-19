package dev.saranda.springsecurity.smallsecuredapp.repository;

import dev.saranda.springsecurity.smallsecuredapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByUsername(String u);
}