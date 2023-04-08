package com.example.homework13.controller;

import com.example.homework13.dto.StudentDTO;
import com.example.homework13.enums.GenderStatus;
import com.example.homework13.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody StudentDTO studentDTO) {
        StudentDTO dto = studentService.create(studentDTO);
        return ResponseEntity.ok(dto);
    }
    @GetMapping("/getList")
    public ResponseEntity<?> getList() {
        List<StudentDTO> list = studentService.getList();
        return ResponseEntity.ok(list);
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {
        StudentDTO dto = studentService.getById(id);
        return ResponseEntity.ok(dto);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody StudentDTO studentDTO) {
        return ResponseEntity.ok(studentService.update(id, studentDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(studentService.delete(id));
    }


    @GetMapping("/getByName/{name}")
    public ResponseEntity<?> getByName(@PathVariable("name") String name) {
        List<StudentDTO> list = studentService.getByName(name);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/getBySurname/{surname}")
    public ResponseEntity<?> getBySurname(@PathVariable("surname") String surname) {
        List<StudentDTO> list = studentService.getBySurname(surname);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/getByLevel/{level}")
    public ResponseEntity<?> getByLevel(@PathVariable("level") Integer level) {
        List<StudentDTO> list = studentService.getByLevel(level);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/getByAge/{age}")
    public ResponseEntity<?> getByAge(@PathVariable("age") Integer age) {
        List<StudentDTO> list = studentService.getByAge(age);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/getByGender/{gender}")
    public ResponseEntity<?> getByGender(@PathVariable("gender") GenderStatus gender) {
        return ResponseEntity.ok(studentService.getByGender(gender));
    }

    @GetMapping("/getByCreateDate/{createDate}")
    public ResponseEntity<?> getByCreateDate(@PathVariable("createDate") LocalDateTime createDate) {
        return ResponseEntity.ok(studentService.getByCreateDate(createDate));
    }

    @GetMapping("/getBetweenDate")
    public ResponseEntity<?> getStudentByBetweenDate(@RequestParam("fromDate") LocalDateTime a, @RequestParam("toDate") LocalDateTime b) {
        return ResponseEntity.ok(studentService.getBetWeenDate(a, b));
    }


}
