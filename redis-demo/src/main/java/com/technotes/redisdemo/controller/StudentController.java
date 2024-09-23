package com.technotes.redisdemo.controller;

import com.technotes.redisdemo.model.Student;
import com.technotes.redisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;



    @ResponseBody
    @RequestMapping("/find")
    public Student findByName(@RequestParam(required = false) String name) {
        return studentService.findByName(name);
    }

    @ResponseBody
    @RequestMapping("/find2")
    public Student findByName2(@RequestParam(required = false) String name) {
        return studentService.findByName2(name);
    }
}
