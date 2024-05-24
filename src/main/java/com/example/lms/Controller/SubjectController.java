package com.example.lms.Controller;

import com.example.lms.Entity.Student;
import com.example.lms.Entity.Subjects;
import com.example.lms.Pojo.StudentPojo;
import com.example.lms.Pojo.SubjectsPojo;
import com.example.lms.Service.StudentService;
import com.example.lms.Service.SubjectService;
import com.example.lms.Shared.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequiredArgsConstructor
@RequestMapping("/subjects")

public class SubjectController {
    private final SubjectService subjectService;



    @GetMapping("/get")
    public GlobalApiResponse<List<Subjects>> getData() {
        return GlobalApiResponse.
                <List<Subjects>>builder()
                .data(subjectService.getAll())
                .statusCode(200)
                .message("Data retrieved successfully!")
                .build();
    }

    @PostMapping("/save")
    public void save(@RequestBody SubjectsPojo subjectsPojo) {

        this.subjectService.addSubject(subjectsPojo);
    }

    @GetMapping("/get/{id}")
    public Optional<Subjects> getData(@PathVariable Integer id) {
        System.out.println("Hello");
        return subjectService.findById(id.longValue());
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        this.subjectService.deleteById(id.longValue());
    }

}
