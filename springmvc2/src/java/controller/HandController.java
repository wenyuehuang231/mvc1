package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther : Mr.Huang
 * @date : 2019/4/9 10:42
 */

@Controller
public class HandController {

    @RequestMapping("/index")
    public String index(@RequestParam("name") String name) {
        String str = this.getClass().getClassLoader().getResource("/").getPath();
        System.out.println(name+"...."+str);
        return "index";
    }

}
