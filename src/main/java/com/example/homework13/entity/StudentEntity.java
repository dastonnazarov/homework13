package com.example.homework13.entity;

import com.example.homework13.enums.GenderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "level")
    private Integer level;

    @Column(name = "age")
    private Integer age;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "gender")
    private GenderStatus gender;

    @Column(name = "create_date")
    private LocalDateTime createDate;
}
