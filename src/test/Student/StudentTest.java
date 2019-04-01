package Student;

import entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student stu = (Student) applicationContext.getBean("stu");
        System.out.println(stu.getTeacher().toString());
    }
}