package com.example.lms.Controller;

import com.example.lms.Entity.Attendance;
import com.example.lms.Entity.Student;
import com.example.lms.Pojo.AttendancePojo;
import com.example.lms.Pojo.StudentPojo;
import com.example.lms.Service.AttendanceService;
import com.example.lms.Service.StudentService;
import com.example.lms.Shared.GlobalApiResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Getter
@Setter

@RequestMapping("/attendance")

@RequiredArgsConstructor

public class AttendanceController {
    @Autowired
    private  final AttendanceService attendanceService;
    @GetMapping("/get")
    public GlobalApiResponse<List<Attendance>> getData() {
        return GlobalApiResponse.
                <List<Attendance>>builder()
                .data(attendanceService.getAll())
                .statusCode(200)
                .message("Data retrieved successfully!")
                .build();
    }

    //
    @PostMapping("/save")
    public GlobalApiResponse<String> save(  AttendancePojo attendancePojo) {
        this.attendanceService.takeAttendance(attendancePojo);
        return GlobalApiResponse.
                <String>builder()
                .statusCode(200)
                .data("ok")
                .message("Member saved Successfully!")
                .build();
    }
    @GetMapping("/get/{id}")
    public Optional<Attendance> getData( Student student) {
        System.out.println("Hello");
        return attendanceService.findById(student.getId().intValue());
    }

}
