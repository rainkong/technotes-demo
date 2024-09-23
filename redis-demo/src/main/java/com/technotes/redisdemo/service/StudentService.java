package com.technotes.redisdemo.service;

import com.technotes.redisdemo.model.Student;


public interface StudentService {

    Student findByName(String name);

    Student findByName2(String name);
}
