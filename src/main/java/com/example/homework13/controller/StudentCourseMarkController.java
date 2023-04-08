package com.example.homework13.controller;

import com.example.homework13.dto.StudentCourseMarkDTO;
import com.example.homework13.service.StudentCourseMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("studentCourseMark")
public class StudentCourseMarkController {
    @Autowired
    private StudentCourseMarkService studentCourseMarkService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody StudentCourseMarkDTO dto) {
        StudentCourseMarkDTO list = studentCourseMarkService.create(dto);
        return ResponseEntity.ok(list);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody StudentCourseMarkDTO dto) {
        return ResponseEntity.ok(studentCourseMarkService.update(id, dto));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(studentCourseMarkService.getById(id));
    }


    @GetMapping("/getByIdDetail/{id}")
    public ResponseEntity<?> getByIdDetail(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(studentCourseMarkService.getByIdDetail(id));
    }


    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        List<StudentCourseMarkDTO> list = studentCourseMarkService.getAll();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
       return ResponseEntity.ok(studentCourseMarkService.delete(id));
    }

    @GetMapping("/getGivenDate/{createDate}")
    public ResponseEntity<?> getGivenDate(@PathVariable("createDate") LocalDateTime createDate) {
        List<StudentCourseMarkDTO> list = studentCourseMarkService.getGivenDate(createDate);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/getBetweenDate")
    public ResponseEntity<?> getBetweenDate(@RequestParam("fromDate") LocalDateTime firstDate,@RequestParam("toDate") LocalDateTime secondDate) {
        List<StudentCourseMarkDTO> list = studentCourseMarkService.getBetweenDate(firstDate,secondDate);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/getAllByDateDESC/{id}")
    public ResponseEntity<?> getAllByDateDesc(@RequestParam("id")Integer id) {
        Object list = studentCourseMarkService.getAllByDateDesc(id);
        return ResponseEntity.ok(list);
    }

}
