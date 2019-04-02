package factory;

import entity.Student;
import entity.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstanceStudentFactory {
    private Map<Integer, Student> studentMap;

    public InstanceStudentFactory() {
        studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,new Student("小绿","b",22,new ArrayList<Teacher>()));
    }

    public Student getStu(int num) {
        return studentMap.get(1);
    }

}
