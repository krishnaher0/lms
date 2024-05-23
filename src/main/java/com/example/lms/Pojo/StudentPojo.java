package com.example.lms.Pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentPojo {
    private Long studentId;
    private String studentName;
    private String Password;
    private String Email;
    private Integer Contacts;
    private Integer RollNo;
    private String Section;
    private Date DateOfBirth;
    private Date AdmissionDate;
    private Integer Age;

}
