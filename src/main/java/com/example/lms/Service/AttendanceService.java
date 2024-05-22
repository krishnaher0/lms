package com.example.lms.Service;

import com.example.lms.Entity.Attendance;
import com.example.lms.Entity.Student;
import com.example.lms.Pojo.AttendancePojo;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface AttendanceService {
    void takeAttendance(AttendancePojo attendancePojo);
    List<Attendance> getAll();
    Optional<Attendance> findById(Integer studentId);
}
