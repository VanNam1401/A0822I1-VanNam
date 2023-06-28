package com.example.demo_module4_spring_boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_student", columnDefinition = "integer")
    private Integer codeStudent;
    @Column(name = "name_student", columnDefinition = "VARCHAR(100)", nullable = false)
    private String nameStudent;
    private Double point;
    private Integer gender;

    @ManyToOne
    @JoinColumn(name = "id_classroom")
    private ClassRoom classRoom;
}
