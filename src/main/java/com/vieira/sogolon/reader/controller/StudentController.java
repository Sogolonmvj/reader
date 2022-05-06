package com.vieira.sogolon.reader.controller;

import com.vieira.sogolon.reader.model.Student;
import com.vieira.sogolon.reader.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> fetchAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{email}")
    public ResponseEntity<Optional<Student>> fetchStudent(@PathVariable("email") String email) {
        Optional<Student> studentEmail = studentService.getStudent(email);

        return ResponseEntity.ok(studentEmail);

    }
}
