package com.example.lms.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Classes")
@Getter
@Setter

public class ClassSchool {
    @Id
    @Column(name="ClassName")
    private String className;

    @Column(name="Fees")
    private Long fees;

}
