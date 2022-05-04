package com.vieira.sogolon.reader.services;

import com.vieira.sogolon.reader.model.Student;
import com.vieira.sogolon.reader.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
