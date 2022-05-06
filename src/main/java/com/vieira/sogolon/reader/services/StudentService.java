package com.vieira.sogolon.reader.services;

import com.vieira.sogolon.reader.model.Student;
import com.vieira.sogolon.reader.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(String email) {
        return studentRepository.findStudentByEmail(email);
    }
}
