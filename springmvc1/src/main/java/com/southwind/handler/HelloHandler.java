package com.southwind.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther : Mr.Huang
 * @date : 2019/4/4 15:20
 */
@Controller
public class HelloHandler {

    @RequestMapping("/index")
    public String index(Model model) {
        System.out.println("执行index代码");
        model.addAttribute("user", "张三");
        return "xx";
    }
}
