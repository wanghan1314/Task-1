package com.task5.controller;

import com.task5.pojo.Profession;
import com.task5.pojo.EliteStudents;
import com.task5.service.ProfessionService;
import com.task5.service.EliteStudentsService;
import com.task5.until.MemcachedUtils;
import com.task5.until.RedisUntil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping
public class EliteStudentsController {
    private static Logger logger = Logger.getLogger(EliteStudentsController.class);
    @Autowired
    private EliteStudentsService studentsService;
    @Autowired
    private ProfessionService professionService;
    @Autowired
    private RedisUntil redisUntil;

    //这里的home为tiles.xml中配置的视图名称，根据返回值，去匹配对应的jsp页面
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getAllStudents(Model model)throws Exception{
        logger.info("查询优秀师兄");
        List<EliteStudents>list = studentsService.getAllStudents();
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

//    @RequestMapping(value = "/profession",method = RequestMethod.GET)
//    public String getAllProfession(Model model) throws Exception {
//        List<Profession>professionList;
//        if (MemcachedUtils.get(String.valueOf(1)) == null){
//            professionList = professionService.getAllProfession();
//            logger.info("没有缓存，设置缓存");
//            MemcachedUtils.set(String.valueOf(1),professionList);
//        }
//        else{
//            logger.info("从缓存中拿数据");
//        professionList = (List<Profession>) MemcachedUtils.get(String.valueOf(1));
//        }
//        model.addAttribute("professionList",professionList);
//        return "profession";
//    }
//
//
//    @RequestMapping(value = "/profession",method = RequestMethod.GET)
//    public String getAllProfession(Model model) throws Exception {
//        List<Profession>professionList;
//        if (redisUntil.get("list")== null){
//            professionList = professionService.getAllProfession();
//            logger.info("没有缓存，设置缓存");
//            redisUntil.set("list",professionList);
//        }
//        else{
//            logger.info("从缓存中拿数据");
//            professionList = (List<Profession>) redisUntil.get("list");
//        }
//        model.addAttribute("professionList",professionList);
//        return "profession";
//    }

    @RequestMapping("/recommend")
    public String getRecommend(){
        return "recommend";
    }
}
