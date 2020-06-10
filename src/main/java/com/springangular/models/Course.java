package com.springangular.models;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Course {
    @Id
    private Long courseId;
    @ManyToOne
    private Student student;

}
