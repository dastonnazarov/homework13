package com.example.homework13.repository;

import com.example.homework13.dto.StudentDTO;
import com.example.homework13.entity.StudentEntity;
import com.example.homework13.enums.GenderStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
    List<StudentEntity> getByName(String name);

    List<StudentEntity> getBySurname(String surname);

    List<StudentEntity> getByLevel(Integer level);

    List<StudentEntity> getByGender(GenderStatus gender);

    List<StudentEntity> getByCreateDate(LocalDateTime createDate);

    List<StudentEntity> getByCreateDateBetween(LocalDateTime a, LocalDateTime b);
}

