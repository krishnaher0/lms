package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Attendance;
import com.example.lms.Entity.Payment;
import com.example.lms.Pojo.PaymentPojo;
import com.example.lms.Repo.PaymentRepo;
import com.example.lms.Service.PaymentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Setter
@Getter
@RequiredArgsConstructor
@Service

public class PaymentImpl implements PaymentService {
    private final PaymentRepo paymentRepo;


    @Override
    public void setPayment(PaymentPojo paymentPojo) {
        Payment payment = new Payment();
        System.out.println("Attendance Date: " + paymentPojo.getDate());
        payment.setPaymentId(paymentPojo.getPaymentId());
        payment.setStudentId(paymentPojo.getStudentId());
        payment.setTotal(paymentPojo.getTotal());
        payment.setPaid(paymentPojo.getPaid());
        payment.setDue(paymentPojo.getDue());
        // Use the date from attendancePojo instead of always using LocalDate.now()
        if (paymentPojo.getDate() != null) {
            payment.setDate(paymentPojo.getDate());
        } else {
            payment.setDate(LocalDate.now());
        }
        payment.setStatus(paymentPojo.isStatus());
        System.out.println("Attendance before save: " + payment);
        paymentRepo.save(payment);
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepo.findAll();
    }

    @Override
    public Optional<Payment> findById(Long paymentId) {
        return paymentRepo.findById(paymentId);
    }
}
