package com.codegym.mapper.resource;

import com.codegym.mapper.model.StudentResponse;
import com.codegym.mapper.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class StudentResource {
    @Autowired
    StudentService studentService;

    @GetMapping
    public StudentResponse getStudent() {
        return studentService.getStudent();
    }

    @PostMapping
    public void saveStudent(@RequestBody StudentResponse student) {
        System.out.println(student);
    }
}
