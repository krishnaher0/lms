package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Notices;
import com.example.lms.Pojo.NoticesPojo;
import com.example.lms.Repo.NoticeRepo;
import com.example.lms.Service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class NoticesImpl implements NoticeService {
    private final NoticeRepo noticeRepo;
    @Override
    public void publishNotice(NoticesPojo noticesPojo) {
        Notices notices=new Notices();
        notices.setNoticeId(noticesPojo.getNoticeId());
        notices.setTitle(noticesPojo.getTitle());
        notices.setDescription(noticesPojo.getDescription());
        if (noticesPojo.getUploadDate() != null) {
            notices.setUploadedDate(noticesPojo.getUploadDate());
        } else {
            notices.setUploadedDate(LocalDate.now());
        }


            noticeRepo.save(notices);


    }

    @Override
    public List<Notices> getAll() {
        return noticeRepo.findAll();
    }

    @Override
    public void deleteById(Integer noticeId) {
        noticeRepo.deleteById(noticeId.longValue());

    }

    @Override
    public Optional<Notices> findById(Integer noticeId) {
        return noticeRepo.findById(noticeId.longValue());
    }
}
