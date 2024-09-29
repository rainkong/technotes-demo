package com.technotes.mysqldemo.service.impl;

import com.technotes.mysqldemo.mybatis.model.Student;
import com.technotes.mysqldemo.mybatis.dao.StudentMapper;
import com.technotes.mysqldemo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Rain
 * @since 2024-09-29
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
