import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsExample {

    public static List<String> getAllStudentActivityList(List<Student> allStudents){

        return allStudents.stream().
                map(Student::getActivities). // Stream <List<String>
                        flatMap(List::stream). // expected output is Stream<Strings> // conversion happens here.
                        distinct().sorted().
                        collect(Collectors.toList());
    }

    public static long getAllStudentActivityListUniqueCount(List<Student> allStudents){

        return allStudents.stream().map(Student::getActivities).flatMap(List::stream).distinct().count();

    }
    public static void main(String[] args) {
        // using student database
        // get all the data
        //  convert the list of activities into flatmap
        // 1.get only the unique activities
        // 2.get the count of activities
        System.out.println(getAllStudentActivityList(StudentDataBase.getAllStudents()));
        System.out.println(getAllStudentActivityListUniqueCount(StudentDataBase.getAllStudents()));
    }
}
