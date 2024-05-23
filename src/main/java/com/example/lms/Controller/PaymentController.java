package com.example.lms.Controller;


import com.example.lms.Entity.Payment;
import com.example.lms.Entity.Student;

import com.example.lms.Pojo.PaymentPojo;
import com.example.lms.Service.PaymentService;
import com.example.lms.Shared.GlobalApiResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Getter
@Setter

@RequiredArgsConstructor
@RequestMapping("/payment")


public class PaymentController {

private final PaymentService paymentService;
    @GetMapping("/get")
    public GlobalApiResponse<List<Payment>> getData() {
        return GlobalApiResponse.
                <List<Payment>>builder()
                .data(paymentService.getAll())
                .statusCode(200)
                .message("Data retrieved successfully!")
                .build();
    }

    //
    @PostMapping("/save")
    public void save(@RequestBody PaymentPojo paymentPojo) {
        System.out.println("Kushal brother is mine brother");
        System.out.println(paymentPojo.getStudent());
        System.out.println(paymentPojo.getTotal());
        System.out.println(paymentPojo.isStatus());
        this.paymentService.setPayment(paymentPojo);
    }
    @GetMapping("/get/{paymentId}")
    public Optional<Payment> getData(Student student) {
        System.out.println("Hello");
        return paymentService.findById(student.getStudentId().longValue());
    }
    @DeleteMapping("/delete/{paymentId}")
    public void delete( Student student) {
        this.paymentService.deleteById(student.getStudentId().longValue());
    }


}
