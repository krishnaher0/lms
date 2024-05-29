package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Attendance;
import com.example.lms.Entity.Student;
import com.example.lms.Pojo.AttendancePojo;
import com.example.lms.Pojo.StudentPojo;
import com.example.lms.Repo.AttendanceRepo;
import com.example.lms.Repo.StudentRepo;
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
        Attendance attendance = new Attendance();
        System.out.println("Attendance Date: " + attendancePojo.getDateNow());
        attendance.setAttendanceId(attendancePojo.getAttendanceId());
        attendance.setStudentId(attendancePojo.getStudentId());
        // Use the date from attendancePojo instead of always using LocalDate.now()
        if (attendancePojo.getDateNow() != null) {
            attendance.setDateNow(attendancePojo.getDateNow());
        } else {
            attendance.setDateNow(LocalDate.now());
        }
        attendance.setStatusUpdate(attendancePojo.isStatusUpdate());
        System.out.println("Attendance before save: " + attendance);
        attendanceRepo.save(attendance);
    }
    @Override
    public List<Attendance> getAll() {
        return attendanceRepo.findAll();
    }

    @Override
    public Optional<Attendance> findById(Integer attendanceId) {
        return attendanceRepo.findById(attendanceId.longValue());
    }
}
