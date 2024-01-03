import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class StreamFindExample {

    public static Optional<Student> getStudentsFindAny(List<Student> studentList){
        return studentList
                .stream()
                .filter(student -> student.getGpa()>=3.5)
                .findAny();
    }

    public static Optional<Student> getStudentsFindFirst(List<Student> studentList){
        return studentList
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        System.out.println(getStudentsFindAny(StudentDataBase.getAllStudents()));
        System.out.println(getStudentsFindFirst(StudentDataBase.getAllStudents()));
    }
}
