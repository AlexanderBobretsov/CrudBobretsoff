package ru.bobretsoff.springbootdemo.repository;

import ru.bobretsoff.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
