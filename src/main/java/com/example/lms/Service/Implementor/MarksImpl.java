package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Marks;
import com.example.lms.Entity.Subjects;
import com.example.lms.Pojo.MarksPojo;
import com.example.lms.Repo.MarksRepo;
import com.example.lms.Service.MarksService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Getter
@RequiredArgsConstructor

public class MarksImpl implements MarksService {
    private final MarksRepo marksRepo;
    @Override
    public void saveMarks(MarksPojo marksPojo) {
        Marks marks=new Marks();

        marks.setSubId(marksPojo.getSubId());
        marks.setFm(marksPojo.getFm());
        marks.setPm(marksPojo.getPm());
        marks.setOm(marksPojo.getOm());
        marks.setMarksid(marksPojo.getMarksId());
        marksRepo.save(marks);

    }

    @Override
    public List<Marks> getAll() {
        return marksRepo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        marksRepo.deleteById(id.longValue());

    }

    @Override
    public Optional<Marks> findById(Integer id) {
        return marksRepo.findById(id.longValue());
    }
}
