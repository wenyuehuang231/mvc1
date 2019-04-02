package entity;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private static final long serialVersionUID = -6818783992338987868L;

    private String name;
    private String addr;
    private int age;
    private List<Teacher> teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public Student(String name, String addr, int age, List<Teacher> teacher) {
        this.name = name;
        this.addr = addr;
        this.age = age;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}
