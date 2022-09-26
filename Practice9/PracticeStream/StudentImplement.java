package Practice9.PracticeStream;

import java.util.ArrayList;

public class StudentImplement implements IStudent {
    @Override
    public ArrayList<Student> addStudent() {
        return new ArrayList<>(){
            {
                add(new Student("James", 20, 9, 7));
                add(new Student("Laura", 22, 8, 7));
                add(new Student("Philip", 24, 6, 8));
                add(new Student("Jessica", 26, 9, 9));
                add(new Student("Stark", 28, 10, 6));
                add(new Student("Maya", 27, 7, 6));
                add(new Student("Jay", 25, 4, 3));
                add(new Student("Stark", 23, 5, 4));
            }
        };
    }

    @Override
    public ArrayList<Student> showStudentLess5(ArrayList<Student> studentList) {
        ArrayList<Student> students = new ArrayList<>();
        studentList.forEach(student -> {
            if(student.getAverage() < 5) {
                students.add(student);
            }
        });
        return students;
    }

    @Override
    public ArrayList<Student> showStudentOverMath(ArrayList<Student> studentList) {
        ArrayList<Student> students = new ArrayList<>();
        studentList.forEach(student -> {
            if(student.getMathScore() > 5 && student.getHistoryScore() <7) {
                students.add(student);
            }
        });
        return students;
    }

    @Override
    public ArrayList<Student> skip4Student(ArrayList<Student> studentList) {
        var students = new ArrayList<Student>();
        studentList.stream()
                   .limit(studentList.size() -2)
                   .skip(2)
                   .forEach(students::add);
        return students;
    }



    @Override
    public ArrayList<Student> skipAgeStudent(ArrayList<Student> studentList) {
        var students = new ArrayList<Student>();
        studentList.stream()
                   .limit(studentList.size() - 2)
                   .skip(2)
                   .filter(student -> student.getAge() > 20)
                   .filter(student -> student.getAge() < 25)
                   .forEach(students::add);
        return students;
    }
}
