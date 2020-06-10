package com.springangular.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    private Long courseId;
    @OneToMany
    private Collection<Student> student;
@Column
    private String courseName;

}
