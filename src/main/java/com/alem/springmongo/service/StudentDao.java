package com.alem.springmongo.service;

import com.alem.springmongo.entity.Student;
import com.alem.springmongo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StudentDao implements StudentService{
    private final StudentRepository studentRepository;
    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
