import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class ReduceExample {
    // reduce will compare the values against each other and return the single value
    public static Optional<Student> getHighestGPAStudent(List<Student> studentDatabaseList) {
        return studentDatabaseList.stream().reduce((student, student2) -> {
            if (student.getGpa() > student2.getGpa()) {
                return student;
            } else {
                return student2;
            }
        });
    }

    // reduce will compare the values against each other and return the single value using ternary operator
    public static Optional<Student> getHighestGPAStudentUsingTernary(List<Student> studentDatabaseList) {
        return studentDatabaseList.stream().reduce((student, student2) -> (student.getGpa() > student2.getGpa()) ? student:student2);
    }

    public static void main(String[] args) {
        // get the data from student database
        // use reduce functions to get highest gpa
        System.out.println(getHighestGPAStudent(StudentDataBase.getAllStudents()));
        System.out.println(getHighestGPAStudentUsingTernary(StudentDataBase.getAllStudents()));
    }

}