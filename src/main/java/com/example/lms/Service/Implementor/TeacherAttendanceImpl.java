package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Attendance;
import com.example.lms.Entity.TeacherAttendance;
import com.example.lms.Pojo.TeacherAttendancePojo;
import com.example.lms.Repo.TeacherAttendanceRepo;
import com.example.lms.Service.TeacherAttendanceService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Getter
@Setter

@Service

public class TeacherAttendanceImpl implements TeacherAttendanceService {
    private final TeacherAttendanceRepo teacherAttendanceRepo;
    @Override
    public void takeTeacherAttendance(TeacherAttendancePojo teacherAttendancePojo) {
        TeacherAttendance teacherAttendance = new TeacherAttendance();
        System.out.println("Attendance Date: " + teacherAttendancePojo.getDateNow());
        teacherAttendance.setId(teacherAttendancePojo.getId());
        teacherAttendance.setIdentity(teacherAttendancePojo.getIdentity());
        // Use the date from attendancePojo instead of always using LocalDate.now()
        if (teacherAttendancePojo.getDateNow() != null) {
            teacherAttendance.setDateNow(teacherAttendancePojo.getDateNow());
        } else {
            teacherAttendance.setDateNow(LocalDate.now());
        }
        teacherAttendance.setStatusUpdate(teacherAttendancePojo.isStatusUpdate());
        System.out.println("Attendance before save: " + teacherAttendance);
        teacherAttendanceRepo.save(teacherAttendance);

    }

    @Override
    public List<TeacherAttendance> getAll() {
        return teacherAttendanceRepo.findAll();
    }

    @Override
    public Optional<TeacherAttendance> findById(Integer id) {
        return teacherAttendanceRepo.findById(id.longValue());
    }
}
