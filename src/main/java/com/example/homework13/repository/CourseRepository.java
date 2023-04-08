package com.example.homework13.repository;


import com.example.homework13.dto.CourseDTO;
import com.example.homework13.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<CourseEntity,Integer> {
    List<CourseEntity> getByName(String name);
    List<CourseEntity> getByPrice(Double price);
    List<CourseEntity> getByCreateDate(LocalDateTime localDateTime);
    List<CourseEntity> getByCreateDateBetween(LocalDateTime a, LocalDateTime b);
}
