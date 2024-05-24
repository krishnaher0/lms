package com.example.lms.Service;

import com.example.lms.Entity.Subjects;
import com.example.lms.Pojo.SubjectsPojo;
import com.example.lms.Repo.SubjectRepo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Getter
@Setter

public class SubjectsImpl implements SubjectService{
    private final SubjectRepo subjectRepo;
    @Override
    public void addSubject(SubjectsPojo subjectsPojo) {
        Subjects subject=new Subjects();
        subject.setSubId(subjectsPojo.getSubId());
        subject.setSubjectName(subjectsPojo.getSubjectName());
        subject.setCredit(subjectsPojo.getCredits());
        System.out.println(subjectsPojo.getCredits());
        subject.setClassName(subjectsPojo.getClassName());
        subjectRepo.save(subject);

    }

    @Override
    public List<Subjects> getAll() {
        return subjectRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        subjectRepo.deleteById(id);

    }

    @Override
    public Optional<Subjects> findById(Long id) {
        return subjectRepo.findById(id);
    }
}
