package com.task5.controller;

import com.task5.pojo.Page;
import com.task5.pojo.Student;
import com.task5.service.StudentService;
import org.apache.log4j.Logger;
import org.softamis.cluster4spring.rmi.RmiUrlListProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/u")
public class StudentController {
    private static Logger logger = Logger.getLogger(StudentController.class);
    @Autowired
    @Qualifier("studentService")
    private RmiUrlListProxyFactoryBean rmiProxyFactoryStudentBean;
    private StudentService studentService;
    //查询
    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
    public String getStudentById(@PathVariable("id") long id, Model model) throws Exception{
        logger.info("客户端请求查询id为："+id+"的学生信息");
        studentService = (StudentService) rmiProxyFactoryStudentBean.getObject();
        Student student =studentService.getStudentById(id);
        model.addAttribute("student" ,student);
        logger.info("由id="+id+"查询到的信息如下："+"/n"+"姓名："+student.getName()+"学号："+student.getOnline_id());
        return "studentEdit";
    }
    //分页显示
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public String getStudentByPage(@RequestParam(value = "currentPage",defaultValue = "1",required = false) int currentPage, Model model)
            throws Exception{
        logger.info("进入分页显示···");
        studentService = (StudentService) rmiProxyFactoryStudentBean.getObject();
        Page<Student> page=studentService.findByPage(currentPage);
        model.addAttribute("pagemsg",page);
        logger.info("共查询到："+page.getTotalCount()+"条结果。"+"当前页数：currentPage="+currentPage+",每页显示数量："+page.getPageSize());
        return "studentList";
    }
    //新增
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public String saveStudent() throws Exception{
        logger.info("请求新增学生信息，跳转到studentIput页面");
        return "studentInput";
    }
    @RequestMapping(value = "/student",method = RequestMethod.PUT)
    public String saveStudent(Student student) throws Exception{
        studentService = (StudentService) rmiProxyFactoryStudentBean.getObject();
        Long createTime=System.currentTimeMillis();
        student.setCreate_at(createTime);
//        student.setName(RandomUntil.getRandomChinese(""));
//        student.setQq(RandomUntil.getRandNumberCode(9));
//        student.setProfessional(RandomUntil.getProfessional());
//        student.setStart_time(RandomUntil.getStartTime());
//        student.setUniversity(RandomUntil.getUniversity());
//        student.setOnline_id(Integer.valueOf(RandomUntil.getOnlineId(4)));
//        student.setDaily_url(RandomUntil.getDailyUrl());
//        student.setOath(RandomUntil.getOath());
//        student.setCounselor(RandomUntil.getRandomChinese(""));
//        student.setCity(RandomUntil.getCity());
        studentService.saveStudent(student);
        return "redirect:/u/students";
    }
    //更新
    @RequestMapping(value = "/Student",method = RequestMethod.PUT)
    public String updateStudent(Student student) throws Exception{
        studentService = (StudentService) rmiProxyFactoryStudentBean.getObject();

        studentService.updateStudent(student);
        logger.info("用户请求更新学生信息，获取到更新信息"+student.toString()+'\n'+"更新完成");
        return "redirect:/u/students";
    }
    //删除
    @RequestMapping(value = "/student/{id}",method = RequestMethod.DELETE)
    public String deleteStudent(@PathVariable("id") long id) throws Exception{
        studentService = (StudentService) rmiProxyFactoryStudentBean.getObject();
      studentService.deleteStudentById(id);
        logger.info("正在返回分页查询···"+'\n'+"成功删除id为："+id +"的学生信息");
        return "redirect:/u/students";
    }

    //通过姓名查询
    @RequestMapping(value = "/Students",method = RequestMethod.GET)
    public String getStudentsByName1(String name,Model model) throws Exception{
        studentService = (StudentService) rmiProxyFactoryStudentBean.getObject();
        List<Student> list = studentService.getStudentsListByName(name);
        model.addAttribute("list",list);
        return "studentSearch";
    }
}
