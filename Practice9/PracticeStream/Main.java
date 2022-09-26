package Practice9.PracticeStream;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentImplement studentMain = new StudentImplement();

        System.out.println("Student list: ");
        ArrayList<Student> studentList = studentMain.addStudent();
        System.out.println(studentList);

        System.out.println("Show students have average < 5: ");
        var studentLess5 = studentMain.showStudentLess5(studentList);
        System.out.println(studentLess5);

        System.out.println("Show students have math score > 5, history < 7: ");
        var studentLessHistory = studentMain.showStudentOverMath(studentList);
        System.out.println(studentLessHistory);

        System.out.println("Show students skip the first 2 and last 2: ");
        var skip4Student = studentMain.skip4Student(studentList);
        System.out.println(skip4Student);

        System.out.println("Show student skip the first 2 and last 2 and <20, >25: ");
        var skipAgeStudent = studentMain.skipAgeStudent(studentList);
        System.out.println(skipAgeStudent);
    }
}
