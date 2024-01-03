import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFilterExample {
    public static List<Student> getFemaleStudentsOnly(List<Student> studentList){
       return studentList.stream().filter(student -> student.getGender().equals("female")).collect(toList())
;
    }
    public static void main(String[] args) {
        // get the data from student database
        // 1. filter only the female students

        System.out.println(getFemaleStudentsOnly(StudentDataBase.getAllStudents()));
    }
}
