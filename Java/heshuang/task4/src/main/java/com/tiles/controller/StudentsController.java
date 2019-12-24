package com.tiles.controller;

import com.tiles.pojo.Profession;
import com.tiles.pojo.Students;
import com.tiles.service.ProfessionService;
import com.tiles.service.StudentsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping
public class StudentsController {
    private static Logger logger = Logger.getLogger(StudentsController.class);
    @Autowired
    private StudentsService studentsService;
    @Autowired
    private ProfessionService professionService;

    //这里的home为tiles.xml中配置的视图名称，根据返回值，去匹配对应的jsp页面
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getAllStudents(Model model)throws Exception{
        logger.info("查询优秀师兄");
        List<Students>list = studentsService.getAllStudents();
        int i = studentsService.getStudyNumber();
        int j = studentsService.getWorkNumber();
        model.addAttribute("list",list);
        model.addAttribute("i",i);
        model.addAttribute("j",j);
        return "home";
    }

    @RequestMapping(value = "/profession",method = RequestMethod.GET)
    public String getAllProfession(Model model) throws Exception {
        List<Profession>professionList = professionService.getAllProfession();
        model.addAttribute("professionList",professionList);
        return "profession";
    }

    @RequestMapping("/recommend")
    public String getRecommend(){
        return "recommend";
    }

    @RequestMapping("/login")
    public String login(){
//        List<Password> list = password.
        return "login";
    }
}
