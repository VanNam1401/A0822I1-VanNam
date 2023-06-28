package com.example.demo_module4_spring_boot.repository;

import com.example.demo_module4_spring_boot.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String username);
}
