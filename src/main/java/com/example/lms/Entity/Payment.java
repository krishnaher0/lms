package com.example.lms.Entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor


@Table(name="PaymentTable1")
public class Payment {
    @Id
    private Long id;

    @Column(name="Date")
    private LocalDate date;
    @Column(name="Total")
    private Long Total;

    @Column(name="Paid")
    private Long paid;

    @Column(name="Due")
    private Long due;

    @Column(name="status")
    private boolean status;

    @JoinColumn(name="student_id")
    @OneToOne()
    private Student student;



}

