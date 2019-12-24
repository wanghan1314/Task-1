package com.fml.service;

import com.fml.pojo.Student;
import org.oasisopen.sca.annotation.Remotable;

import java.util.List;

@Remotable
public interface StudentService {
    /**新增学员*/
    boolean add(Student student);
    /**根据ID删除*/
    boolean deleteById(long id);
    /**删除全部学员*/
    boolean deleteAll();
    /**更新学员信息   实际中只会更新部分，比如密码  不可能更新全部信息*/
    boolean update(Student student);
    /**根据ID查找*/
    Student getById(long id);
    /**根据用户名查找*/
    Student getByUserName(String username);
    /**根据手机号查找*/
    Student getByPhone(String phone);
    /**根据邮箱查找*/
    Student getByEmail(String email);
    /**判断是用户名/邮箱/手机登录，执行登录判断*/
    boolean login(Student entity);
    /**查找学员中的大牛  status=4*/
    List<Student> getByStatus();
    /**查找总学员数*/
    int getTotalCount();
    /**查找已经就业的学员   status=3 or 4*/
    int getWorkCount();
    /**查找每门课程各学员数*/
    List<Integer> getStudentByLesson();
}
