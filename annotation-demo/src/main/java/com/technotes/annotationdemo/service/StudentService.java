package com.technotes.annotationdemo.service;

import com.technotes.annotationdemo.model.Student;


public interface StudentService {

    Student findByName(String name);

    Student findByName2(String name);
}
