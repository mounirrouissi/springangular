package com.springangular.models;

import org.hibernate.annotations.GeneratorType;

import javax.annotation.processing.Generated;
import javax.persistence.Id;

public class Student {
    @javax.persistence.Id
    @GeneratorType(type = true)
    private Long Id;
}
