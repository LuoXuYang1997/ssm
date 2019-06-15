package com.scce.controller;

import com.scce.pojo.Stu;
import com.scce.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: IdeaProjects
 * @description:
 * @author: Lxy
 * @create: 2019-06-15 10:14
 **/
@Controller
public class StuController {
    @Autowired
    private StuService stuService;

    @RequestMapping("/getStu")
    public ModelAndView getStu() {
        ModelAndView md = new ModelAndView();
        List<Stu> stuList = stuService.getStu();
        System.out.println(stuList);
        md.addObject("stuList", stuList);
        md.setViewName("index");
        return md;
    }
}
