package com.stu.service;


import com.stu.model.Page;
import com.stu.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    User findById(int id);

    User findByName(String name);

    User findByPhone(long phone);

    User findByEmail(String email);

    int findAllCount();

    List<User> findByUser(User user);

    int updateOne(User user);

    int insertOne(User user);

    int deleteOne(int id);

    Page<User> findByPage(int nowpage, int pagesize);


}
