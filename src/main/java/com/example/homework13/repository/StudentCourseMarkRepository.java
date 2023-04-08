package com.example.homework13.repository;

import com.example.homework13.dto.StudentCourseMarkDTO;
import com.example.homework13.entity.StudentCourseMarkEntity;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface StudentCourseMarkRepository extends CrudRepository<StudentCourseMarkEntity,Integer> {
    List<StudentCourseMarkEntity> getByCreateDate(LocalDateTime createDate);
    List<StudentCourseMarkEntity> getByCreateDateBetween(LocalDateTime firstDate, LocalDateTime secondDate);
    Iterable<StudentCourseMarkEntity> findAllByStudentIdOrderByCreateDateDesc(Integer id);
}
