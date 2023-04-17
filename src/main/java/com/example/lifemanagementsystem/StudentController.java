package com.example.lifemanagementsystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    HashMap<Integer, Student> hashMap = new HashMap<>();

    @PostMapping("/register-student")
    public void addStudent(@RequestBody Student student) {

        int key = student.getRollNo();

        hashMap.put(key, student);
    }

    @GetMapping("/get-student-info")
    public Student getStudent(@RequestParam("rollNo") Integer rollNo) {

        Student student = hashMap.get(rollNo);

        return student;
    }
}
