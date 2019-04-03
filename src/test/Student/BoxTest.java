package Student;

import MVC.Controller.BoxController;
import entity.Box;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoxTest {
    @Test
    public void getbox() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BoxController boxController = (BoxController) applicationContext.getBean("bos");
        Box box = boxController.getBoxById(1);
        System.out.println(box);
    }

}
