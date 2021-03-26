package com.bjb.ms.service;


import com.bjb.ms.entity.Student;

public interface StudentService {

    /**
     * 新增用户
     */
    public int addStudent(Student student);

    /**
     * 根据id查询用户
     */
    public Student queryUserById(Integer id);
}
