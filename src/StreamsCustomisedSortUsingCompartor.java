import data.Student;
import data.StudentDataBase;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCustomisedSortUsingCompartor {
    public static List<Student> getStudentNameinSortedOrder(List<Student> studentDatabaseList){
        return studentDatabaseList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }
    public static List<Student> getStudentGpaInSortedOrderAsc(List<Student> studentDatabaseList){
        return studentDatabaseList.stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
    }
    public static List<Student> getStudentGpaInSortedOrderDesc(List<Student> studentDatabaseList){
        return studentDatabaseList.stream().
                sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        // get the data from student database
        // 1. sort the data using student name
        // 2. sort the data using student gpa asc
        // 3. sort the data using student gpa desc
        System.out.println(getStudentNameinSortedOrder(StudentDataBase.getAllStudents()));
        System.out.println(getStudentGpaInSortedOrderAsc(StudentDataBase.getAllStudents()));
        System.out.println(getStudentGpaInSortedOrderDesc(StudentDataBase.getAllStudents()));
    }
}
