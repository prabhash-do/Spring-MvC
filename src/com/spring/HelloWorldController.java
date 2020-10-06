package com.spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "hello-world-form";
    }

    @RequestMapping("/getForm")
    public String getForm(){
        return "hello-world";
    }

    @RequestMapping("/getFormnew")
    public String changeToUpperCase(HttpServletRequest request, Model model){
        String name=request.getParameter("name");
        name=name.toUpperCase();
        String result="Hey! "+ name;
        model.addAttribute("message",result);
        return "hello-world";
    }

    @RequestMapping("/getFormtwo")
    public String upperCase(
            @RequestParam("name") String name,
                            Model model){
        name=name.toUpperCase();
        String result="Hello! "+ name;
        model.addAttribute("message",result);
        return "hello-world";
    }

}
