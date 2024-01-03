import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> getAllStudentNameList(List<Student> allStudents){

        return allStudents.stream().map(Student::getName).collect(Collectors.toList());
    }

    public static Set<String> getAllStudentNameSet(List<Student> allStudents){
        return allStudents.stream().map(Student::getName).collect(Collectors.toSet());

    }
    public static void main(String[] args) {
        // using student database,
        // 1. get the list of student name
        // 2. return the list of student name in set
        System.out.println(getAllStudentNameList(StudentDataBase.getAllStudents()));
        System.out.println(getAllStudentNameSet(StudentDataBase.getAllStudents()));
    }
}
