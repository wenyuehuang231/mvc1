package com.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloHandler {

    @RequestMapping("/index")
    public String index(Model model,@ModelAttribute User user){
        System.out.println("执行index业务代码");
        model.addAttribute("user", "小a");
        return "xx";
    }

    /*@RequestMapping("/index")
    public String index(Map<String, Object> map){
        System.out.println("执行index业务代码");
        map.put("user", "小a");
        return "xx";
    }*/

    /*@RequestMapping("/index")
    public String index(ModelMap model){
        System.out.println("执行index业务代码");
        model.addAttribute("user", "小a");
        return "xx";
    }*/

    /*@RequestMapping("/index")
    public ModelAndView  index(ModelAndView model){
        System.out.println("执行index业务代码");
        model.addObject("user", "小a");
        //model.addAttribute("user", "小a");
        model.setViewName("xx");
        return model;
    }*/

}
