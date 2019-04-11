package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther : Mr.Huang
 * @date : 2019/4/9 10:42
 */

@Controller
public class HandController {

    @RequestMapping(value="/jsonType")
    @ResponseBody
    public User jsonType(@RequestBody User user){
        //修改年龄
        user.setAge(user.getAge()+10);
        //返回前端
        return user;
    }

}
