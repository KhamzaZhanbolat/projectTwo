package kz.bitlab.project.Service;

import kz.bitlab.project.Model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Database {
    @Getter
    private static List<Student> students = new ArrayList<>();

    static{
        students.add(new Student(1L,"Nurbol","Sultanov",86,"B"));
        students.add(new Student(2L,"Ernur","Aizharykov",50,"D"));
        students.add(new Student(3L,"Arman","Nasiev",47,"F"));
        students.add(new Student(4L,"Sultan","Sydykov",75,"B"));
        students.add(new Student(5L,"Nurbek","Bisenbayev",100,"A"));
        students.add(new Student(6L,"Amandyk","Karim",40,"F"));
        students.add(new Student(7L,"Berik","Tleukhanov",80,"B"));
        students.add(new Student(8L,"Serik","Mustafin",75,"B"));

    }

    private static String calculateMark(int exam) {
        if (exam >= 90) {
            return "A";
        } else if (exam >= 75) {
            return "B";
        } else if (exam >= 60) {
            return "C";
        } else if (exam >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void addStudent(Student student) {
        String studentMark = calculateMark(student.getExam());
        student.setMark(studentMark);
        student.setId((long) (students.size() + 1L));
        students.add(student);
    }
}