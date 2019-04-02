package MVC.Controller;

import MVC.Service.BoxService;
import entity.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoxController {
    @Autowired
    private BoxService boxService;

    public Box getBoxById(int id) {
        return boxService.getBoxById(id);
    }

}
