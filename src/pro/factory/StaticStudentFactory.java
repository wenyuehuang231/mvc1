package factory;

import entity.Student;
import entity.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticStudentFactory {
    private static Map<Integer, Student> studentMap;
    private static List<Teacher> teacherList = new ArrayList<Teacher>();

    static {
        Student stu = new Student("小黄","a",11,teacherList);
        studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, stu);
    }

    public static Student getStu(int num) {
        return studentMap.get(num);
    }
}
