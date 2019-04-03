package MVC.Controller;

import MVC.Service.BoxService;
import entity.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller(value = "bos")
public class BoxController {
    /*@Autowired
    @Qualifier("ss")*/
    @Resource(name = "ss")
    private BoxService boxService;

    public Box getBoxById(int id) {
        return boxService.getBoxById(id);
    }

}
