package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student karl = new Student("Karl");
        karl.addGrade(100);
        karl.addGrade(50);
        karl.addGrade(85);
        System.out.println(karl.getGradeAverage());
        Student ezra = new Student("Ezra");
        ezra.addGrade(90);
        ezra.addGrade(98);
        ezra.addGrade(93);
        System.out.println(ezra.getGradeAverage());
        Student rob = new Student("Rob");
        rob.addGrade(70);
        rob.addGrade(50);
        rob.addGrade(85);
        System.out.println(rob.getGradeAverage());

        students.put("Kaaaarrrlll", karl);
        students.put("Ezzy", ezra);
        students.put("Robby", rob);

        Input in = new Input();
        System.out.println("Hello\nHere is the student list:");
        String studentList = "";
        for (HashMap.Entry<String, Student> student : students.entrySet()){
            studentList += (" | " + student.getKey());
        }
        System.out.println(studentList);
    }
}
