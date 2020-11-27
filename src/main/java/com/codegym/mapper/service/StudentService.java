package com.codegym.mapper.service;

import com.codegym.mapper.model.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentResponse getStudent() {
        StudentResponse student = new StudentResponse();
        student.setName("E");
        student.setClazz("C06");
        student.setCityName("HaNoi");
        return student;
    }
}
