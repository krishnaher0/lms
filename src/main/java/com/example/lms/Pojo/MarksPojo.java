package com.example.lms.Pojo;

import com.example.lms.Entity.Subjects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MarksPojo {
private Integer marksId;
    private Integer fm;
    private Integer pm;
    private Integer om;
    private Subjects subId;
}
