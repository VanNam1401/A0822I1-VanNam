package com.example.demo_module4_spring_boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "classroom")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_class", columnDefinition = "VARCHAR(50)")
    private String nameClass;
}
