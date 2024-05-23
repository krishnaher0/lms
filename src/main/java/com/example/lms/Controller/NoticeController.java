package com.example.lms.Controller;

import com.example.lms.Entity.Notices;
import com.example.lms.Entity.Student;
import com.example.lms.Pojo.AttendancePojo;
import com.example.lms.Pojo.NoticesPojo;
import com.example.lms.Pojo.StudentPojo;
import com.example.lms.Service.NoticeService;
import com.example.lms.Shared.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/notice")
public class NoticeController {
    private final NoticeService noticeService;


    @GetMapping("/get")
    public GlobalApiResponse<List<Notices>> getData() {
        return GlobalApiResponse.
                <List<Notices>>builder()
                .data(noticeService.getAll())
                .statusCode(200)
                .message("Data retrieved successfully!")
                .build();
    }

    //
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody NoticesPojo noticesPojo) {
        // Add validation or logging here if necessary
        if (noticesPojo.getNoticeId() == null) {
            // Handle the missing student_id case
            return ResponseEntity.badRequest().body("Notice Id ID is required");
        }
        noticeService.publishNotice(noticesPojo);
        return ResponseEntity.ok("Notices saved successfully");
    }
    @GetMapping("/get/{id}")
    public Optional<Notices> getData(@PathVariable Integer id) {
        System.out.println("Hello");
        return noticeService.findById(id);
    }

    @DeleteMapping("/delete/{identity}")
    public void delete(@PathVariable Integer id) {
        this.noticeService.deleteById(id);
    }
}
