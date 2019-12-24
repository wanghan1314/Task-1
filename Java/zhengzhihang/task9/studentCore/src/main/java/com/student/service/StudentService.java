package com.student.service;

import com.student.model.Student;
import org.oasisopen.sca.annotation.Remotable;

import java.util.List;

@Remotable
public interface StudentService {
    int deleteByPrimaryKey(Long id);

    int insert(Student student);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student student);

    List<Student> getAll();

    List<Student> randomSelectStudent();

    Long selectIdByName(String name);

    Student selectByName(String name);



//    Long smsVerification(String cellphone);
}