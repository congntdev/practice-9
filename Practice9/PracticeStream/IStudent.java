package Practice9.PracticeStream;

import java.util.ArrayList;

public interface IStudent {
    ArrayList<Student> addStudent();

    // Show students have average < 5.
    ArrayList<Student> showStudentLess5(ArrayList<Student> studentList);

    // Show students have math score > 5, history < 7.
    ArrayList<Student> showStudentOverMath(ArrayList<Student> studentList);

    // Show students skip the first 2 and last 2
    ArrayList<Student> skip4Student(ArrayList<Student> studentList);

    // Show student skip the first 2 and last 2 and <20, >25
    ArrayList<Student> skipAgeStudent(ArrayList<Student> studentList);
}
