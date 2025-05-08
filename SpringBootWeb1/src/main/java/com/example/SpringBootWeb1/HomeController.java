package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("Inside home page controller ");
        return "index";
       }

       @RequestMapping("add")
       public ModelAndView add(int num1 , int num2 , ModelAndView mv  ){

//        System.out.println("In add method controller ");
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2 ;
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv ;
    }
}
