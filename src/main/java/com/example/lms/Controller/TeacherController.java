package com.example.lms.Controller;

import com.example.lms.Entity.Student;
import com.example.lms.Entity.Teacher;
import com.example.lms.Pojo.StudentPojo;
import com.example.lms.Pojo.TeacherPojo;
import com.example.lms.Service.StudentService;
import com.example.lms.Service.TeacherService;
import com.example.lms.Shared.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {

        private final TeacherService teacherService;



        @GetMapping("/get")
        public GlobalApiResponse<List<Teacher>> getData() {
            return GlobalApiResponse.
                    <List<Teacher>>builder()
                    .data(teacherService.getAll())
                    .statusCode(200)
                    .message("Data retrieved successfully!")
                    .build();
        }

        //
        @PostMapping("/save")
        public void save(@RequestBody TeacherPojo teacherPojo) {
            this.teacherService.saveData(teacherPojo);
        }

        @GetMapping("/get/{id}")
        public Optional<Teacher> getData(@PathVariable Integer id) {
            System.out.println("Hello");
            return teacherService.findById(id);
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable Integer id) {
            this.teacherService.deleteById(id);
        }
    }



