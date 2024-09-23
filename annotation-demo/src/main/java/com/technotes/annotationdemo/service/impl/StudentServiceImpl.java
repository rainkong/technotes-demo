package com.technotes.annotationdemo.service.impl;

import com.technotes.annotationdemo.annotation.CustomLog;
import com.technotes.annotationdemo.model.Student;
import com.technotes.annotationdemo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    @CustomLog
    public Student findByName(String name) {
        //模拟查找
        Student student = new Student();
        student.setName(name);
        student.setAge(new Random().nextInt(40));
        return student;
    }
    @Override
    @CustomLog
    public Student findByName2(String name) {
        //模拟查找
        Student student = new Student();
        student.setName(name);
        student.setAge(new Random().nextInt(40));
        return student;
    }
}
