package com.xyw55.springMVC.controller;

import com.xyw55.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xiayiwei on 16/8/18.
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(Student student, ModelMap modelMap) {
        if (student.getName().length() < 5) {
            throw new SpringException("name is short.");
        } else {
            modelMap.addAttribute("name", student.getName());
        }
        modelMap.addAttribute("age", student.getAge());
        modelMap.addAttribute("id", student.getId());
        return "result";
    }

    @RequestMapping(value = "redirect", method = RequestMethod.GET)
    public String redirect(){
        return "redirect:student";
    }

    @RequestMapping(value = "static", method = RequestMethod.GET)
    public String staticpage(){
        return "redirect:static/staticpage.html";
    }



}
