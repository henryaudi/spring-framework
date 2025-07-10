package com.shangjie.demo.rest;

import com.shangjie.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostContruct to load the student data (only once)
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Paul", "Ronald"));
        theStudents.add(new Student("Nicholas", "Rossi"));
        theStudents.add(new Student("Marry", "Schmidt"));
    }

    // define endpoint for "students" - return a list of students.
    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    // define endpoint "/students/{studentid}" to return single student at index.
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // Check student ID against list size
        if (studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudents.get(studentId);
    }


}




