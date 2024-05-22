package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Student;
import com.example.lms.Entity.Teacher;
import com.example.lms.Repo.TeacherRepo;
import com.example.lms.Pojo.TeacherPojo;
import com.example.lms.Service.TeacherService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
@Getter
@Setter

public class TeacherImpl implements TeacherService {
    private final TeacherRepo teacherRepo;

    public void saveData(TeacherPojo teacherPojo) {
        if (teacherPojo.getTeacherName() == null) {
            System.out.println("teacherName is null");
        } else {
            System.out.println("teacherName: " + teacherPojo.getTeacherName());
        }

        Teacher teacher = new Teacher();
        teacher.setId(teacherPojo.getId());
        teacher.setTeacherName(teacherPojo.getTeacherName());
        teacher.setPassword(teacherPojo.getPassword());
        teacher.setEmail(teacherPojo.getEmail());
        teacher.setContacts(teacherPojo.getContacts());
        teacher.setDateOfBirth(teacherPojo.getDateOfBirth());
        teacher.setJoinDate(teacherPojo.getJoinDate());
        teacher.setAge(teacherPojo.getAge());
        teacherRepo.save(teacher);
    }


    @Override
    public List<Teacher> getAll() {
        System.out.println("My name is krishna");
        return teacherRepo.findAll();
    }



    public void deleteById(Integer id) {
        System.out.println("My name is krishna bhandari");
        teacherRepo.deleteById(Long.valueOf(id));
    }


    public Optional<Teacher> findById(Integer id) {
        System.out.println("My name is krishna bh");
        return teacherRepo.findById(id.longValue());
    }
}
