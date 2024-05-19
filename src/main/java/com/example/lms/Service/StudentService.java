package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Student;
import com.example.lms.Pojo.StudentPojo;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service




public interface StudentService {



    void saveData(StudentPojo studentPojo);
    List<Student> getAll();

    void deleteById(Integer id);
     Optional<Student> findById(Integer id);

}


