package com.spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String registration(Model model){
        Student theStudent =new Student();
        model.addAttribute("student",theStudent);
        return "student-form";
    }

    @RequestMapping("/processform")
    public String showDetails(
            @ModelAttribute("student") Student student
    ){
        System.out.println("the Student :" +student.getFirstName());
        return "student-confirm";
    }
}
