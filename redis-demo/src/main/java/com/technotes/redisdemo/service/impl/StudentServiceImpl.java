package com.technotes.redisdemo.service.impl;

import com.technotes.redisdemo.model.Student;
import com.technotes.redisdemo.service.StudentService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    @Cacheable(cacheNames = "student", key = "#p0")
    public Student findByName(String name) {
        //模拟查找
        Student student = new Student();
        student.setName(name);
        student.setAge(new Random().nextInt(40));
        return student;
    }
    @Override
    @Cacheable(cacheNames = "student", key = "#p0")
    public Student findByName2(String name) {
        //模拟查找
        Student student = new Student();
        student.setName(name);
        student.setAge(new Random().nextInt(40));
        return student;
    }
}
