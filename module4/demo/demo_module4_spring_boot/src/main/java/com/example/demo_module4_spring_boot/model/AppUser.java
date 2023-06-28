package com.example.demo_module4_spring_boot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "app_user", uniqueConstraints = {
        @UniqueConstraint(name = "APP_USER_UK", columnNames = "user_name")
})
@Data
public class AppUser {
    @Id
    @GeneratedValue
    private Long userId;

    @Column(name = "user_name", length = 36, nullable = false)
    private String userName;
    @Column(name = "encryted_password", length = 128, nullable = false)
    private String encrytedPassword;
    @Column(name = "enable", length = 1, nullable = false)
    private boolean enable;
}
