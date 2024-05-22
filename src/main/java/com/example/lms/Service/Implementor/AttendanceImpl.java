package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Attendance;
import com.example.lms.Entity.Student;
import com.example.lms.Pojo.AttendancePojo;
import com.example.lms.Repo.AttendanceRepo;
import com.example.lms.Service.AttendanceService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
@Getter
@Setter

public class AttendanceImpl implements AttendanceService {
    private  final AttendanceRepo attendanceRepo;
    @Override
    public void takeAttendance(AttendancePojo attendancePojo) {
        Attendance attendance=new Attendance();
        System.out.println(attendancePojo.getDateNow());
        attendance.setId(attendancePojo.getId());
        attendance.setStudentId(attendancePojo.getStudentId());
        attendance.setDateNow(LocalDate.now());
        attendance.setStatusUpdate(attendancePojo.isStatusUpdate());
        attendanceRepo.save(attendance);
    }

    @Override
    public List<Attendance> getAll() {
        return attendanceRepo.findAll();
    }

    @Override
    public Optional<Attendance> findById(Integer studentId) {
        return attendanceRepo.findById(studentId.longValue());
    }
}
