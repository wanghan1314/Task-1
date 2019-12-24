package com.opt.service;


import com.opt.model.Page;
import com.opt.model.Profession;
import org.oasisopen.sca.annotation.Remotable;
import org.springframework.stereotype.Service;

import java.util.List;
@Remotable
@Service
public interface ProfessionService {


    int findAllCount();

    Page<Profession> findByPage(int nowpage, int pagesize);

    List<Profession> findAll();


}
