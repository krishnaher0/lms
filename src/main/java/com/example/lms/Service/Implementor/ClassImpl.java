package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Attendance;
//import com.example.lms.Entity.Class;
import com.example.lms.Entity.ClassSchool;
import com.example.lms.Pojo.AttendancePojo;
import com.example.lms.Pojo.ClassPojo;
import com.example.lms.Repo.ClassRepo;
import com.example.lms.Service.ClassService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Getter
@Setter
@Service
@RequiredArgsConstructor

public class ClassImpl implements ClassService {
    private  final ClassRepo classRepo;
    public void addClass(ClassPojo classPojo) {
        ClassSchool classes = new ClassSchool();
        System.out.println("Attendance Date: " + classPojo.getClassName());
        classes.setClassName(classPojo.getClassName());
        classes.setFees(classPojo.getFees());
        classRepo.save(classes);
    }

    @Override
    public List<ClassSchool> getAll() {
        return classRepo.findAll();
    }

    @Override
    public Optional<ClassSchool> findById(String className) {
        return classRepo.findById(className);
    }
}
