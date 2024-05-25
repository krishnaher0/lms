package com.example.lms.Controller;

import com.example.lms.Entity.Student;
import com.example.lms.Pojo.StudentPojo;
import com.example.lms.Service.StudentService;
import com.example.lms.Shared.GlobalApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")

@RequiredArgsConstructor


public class StudentController {
    private final StudentService studentService;



        @GetMapping("/get")
        public GlobalApiResponse<List<Student>> getData() {
            return GlobalApiResponse.
                    <List<Student>>builder()
                    .data(studentService.getAll())
                    .statusCode(200)
                    .message("Data retrieved successfully!")
                    .build();
        }

    @PostMapping("/save")
    public void save(@RequestBody StudentPojo studentPojo) {

            this.studentService.saveData(studentPojo);
    }

        @GetMapping("/get/{id}")
        public Optional<Student> getData(@PathVariable Integer id) {
            System.out.println("Hello");
            return studentService.findById(id.longValue());
        }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable Integer id, @RequestBody StudentPojo studentPojo) {
        if (!studentService.existsById(id)) {
            return new ResponseEntity<>("Students id" + id + " not found", HttpStatus.NOT_FOUND);
        }

        // Update the existing ground with the provided ID
        studentService.updateData(id, studentPojo);

        return ResponseEntity.ok("Student with ID " + id + " updated successfully");
    }


    @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable Integer id) {
            this.studentService.deleteById(id.longValue());
        }
    }

