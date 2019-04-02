package Student;

import entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void getName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student stu = (Student) applicationContext.getBean("stu");
        System.out.println(stu.getTeacher().toString());
    }

    @Test
    public void staticStudent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student stu1 = (Student) applicationContext.getBean("stu1");
        System.out.println(stu1);
    }

    @Test
    public void instanceStudent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student stu2 = (Student) applicationContext.getBean("stu2");
        System.out.println(stu2);
    }


}