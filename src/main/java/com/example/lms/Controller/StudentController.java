package com.example.lms.Controller;

import com.example.lms.Entity.Student;
import com.example.lms.Pojo.StudentPojo;
import com.example.lms.Service.StudentService;
import com.example.lms.Shared.GlobalApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")

@RequiredArgsConstructor


public class StudentController {
    private final StudentService studentService;



        @GetMapping("/get")
        public GlobalApiResponse<Student> getData() {
            return GlobalApiResponse.
                    <Student>builder()
                    .data("saved")
                    .statusCode(200)
                    .message("Data retrieved successfully!")
                    .build();
        }

//
    @PostMapping("/save")
    public void save(@RequestBody StudentPojo studentPojo) {
        this.studentService.saveData(studentPojo);
    }

        @GetMapping("/get/{id}")
        public Optional<Student> getData(@PathVariable Integer id) {
            System.out.println("Hello");
            return studentService.findById(id);
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable Integer id) {
            this.studentService.deleteById(id);
        }
    }

