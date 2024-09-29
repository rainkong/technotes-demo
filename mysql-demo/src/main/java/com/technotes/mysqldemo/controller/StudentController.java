package com.technotes.mysqldemo.controller;

import com.technotes.mysqldemo.mybatis.model.Student;
import com.technotes.mysqldemo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;


    @ResponseBody
    @RequestMapping("/add")
    public Student add(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        studentService.save(student);
        return student;
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<Student> list() {
        return studentService.list();
    }
}
