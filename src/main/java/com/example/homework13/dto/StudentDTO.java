package com.example.homework13.dto;
import com.example.homework13.enums.GenderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class StudentDTO {
    private Integer id;
    private String name;
    private String surname;
    private Integer level;
    private Integer age;
    private GenderStatus gender;
    private LocalDateTime createDate = LocalDateTime.now();

}
