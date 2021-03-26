package com.bjb.ms.dao;

import com.bjb.ms.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentDao {

    public int addStudent(Student student);

    public Student queryById(Integer id);
}
