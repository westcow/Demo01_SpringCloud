package com.bjb.ms.controller;

import com.bjb.ms.entity.Student;
import com.bjb.ms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */
@RestController
@RequestMapping("/user")
public class StudentController {
    @Autowired
    public StudentService studentService;
    /**
     * @explain 新增用户
	 * @return  成功/失败
	 * @author  XJT
	 * @time    2021年3月10日
     */
    @PostMapping("/insertUser")
    public int insertUser(Student student) {
        return studentService.addStudent(student);
    }
}
