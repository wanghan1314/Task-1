package com.ptteng.controller;


import com.ptteng.entity.Work;
import com.ptteng.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
public class WorkController {
    @Autowired
    private WorkService service;

    @RequestMapping(value = "/a/u/work/list", method = RequestMethod.GET)
    public ModelAndView getWork(Integer page, Integer size, String keyword, Long classifyId) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("哈哈哈！我来了");
        System.out.println("page===" + page + ",size===" + size + ",keyword===" + keyword+",classifyId==" + classifyId);
        if (page == null) {
            page = 1;
        }
        if (size == null) {
            size = 10;
        }
        try {
            List<Work> works = service.findPageWork(page, size, keyword, classifyId);
            System.out.println(works);
            modelAndView.addObject("data",works);
            modelAndView.addObject("code", 0);
        } catch (Exception e) {
            modelAndView.addObject("code", -1);
        }
        long total=service.countWork();
        modelAndView.addObject("page",page);
        modelAndView.addObject("total",total);
        modelAndView.setViewName("work");
        return modelAndView;
    }

    @RequestMapping(value = "/a/u/work/{id}", method = RequestMethod.GET)
    public ModelAndView findById(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("哈哈哈！我来了");
        System.out.println(id);
        Work work = service.findById(id);
        HashMap<String,Object> hashMap=new HashMap<>();
        hashMap.put("star",work);
        if (work == null) {
            modelAndView.addObject("code", -1);
        } else {
            modelAndView.addObject("data",hashMap);
            modelAndView.addObject("code", 0);
        }
        modelAndView.setViewName("work");

        return modelAndView;
    }

    @RequestMapping(value = "/a/u/work/{id}", method = RequestMethod.DELETE)
    public ModelAndView deleteById(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("哈哈哈！我来了");
        System.out.println(id);
        Boolean row = service.deleteById(id);
        if (row = true) {
            modelAndView.addObject("code", 0);
        } else {
            modelAndView.addObject("code", -1);
        }
        modelAndView.setViewName("work");
        return modelAndView;
    }

    @RequestMapping(value = "/a/u/work",method = RequestMethod.PUT)
    public ModelAndView updateWork(Work work) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("哈哈哈！我来了");
        System.out.println(work);
        Boolean row = service.updateWork(work);
        if (row = true) {
            modelAndView.addObject("code", 0);
        } else {
            modelAndView.addObject("code", -1);
        }
        modelAndView.setViewName("work");
        return modelAndView;
    }

    @RequestMapping(value = "/a/u/work",method = RequestMethod.POST)
    public ModelAndView insertWork(Work Work){
        ModelAndView modelAndView=new ModelAndView();
        System.out.println("哈哈哈！我来了");
        System.out.println(Work);
        try{
            service.insertWork(Work);
            modelAndView.addObject("code",0);
        }
        catch(Exception e){
            modelAndView.addObject("code",-1);
        }
        modelAndView.setViewName("work");
        return modelAndView;
    }








}
