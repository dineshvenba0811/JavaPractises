import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamMatchExamples {

    public static boolean getStudentsAllMatch(List<Student> studentList){
        return studentList
                .stream()
                .allMatch( student -> student.getGpa() >=3.8);
    }

    public static boolean getStudentsAnyMatch(List<Student> studentList){
        return studentList
                .stream()
                .anyMatch( student -> student.getGpa() >=3.8);
    }

    public static boolean getStudentsNoneMatch(List<Student> studentList){
        return studentList
                .stream()
                .noneMatch( student -> student.getGpa() >=3.8);
    }
    public static void main(String[] args) {
        // all match method
        System.out.println(getStudentsAllMatch(StudentDataBase.getAllStudents()));
        System.out.println(getStudentsAnyMatch(StudentDataBase.getAllStudents()));
        System.out.println(getStudentsNoneMatch(StudentDataBase.getAllStudents()));

    }
}
