package com.example.lms.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer marksId;
    @Column(name="Fm", nullable = false)
    private Double fm;
    @Column(name="Pm", nullable = false)
    private Double pm;

    @Column(name="Om", nullable = false)
    private Double om;

}
