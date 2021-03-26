package com.bjb.ms.service.impl;

import com.bjb.ms.dao.StudentDao;
import com.bjb.ms.entity.Student;
import com.bjb.ms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author XJT
 * @CreateDate
 * @Return
 * @Version
 */
@Component
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Student queryUserById(Integer id) {
        return null;
    }
}
