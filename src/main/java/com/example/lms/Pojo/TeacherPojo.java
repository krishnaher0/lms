package com.example.lms.Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TeacherPojo {
    private Long id;
    private String teacherName;
    private String password;
    private String email;
    private Integer contacts;
    private LocalDate dateOfBirth;
    private LocalDate joinDate;
    private Integer age;
}
