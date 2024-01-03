import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
    public static List<String> getAllStudentActivityList(List<Student> allStudents){

        return allStudents.stream().
                map(Student::getActivities). // Stream <List<String>
                flatMap(List::stream). // expected output is Stream<Strings> // conversion happens here.
                collect(Collectors.toList());
    }
    public static void main(String[] args) {
        // using student database
        // get all the data
        //  convert the list of activities into flatmap
        System.out.println(getAllStudentActivityList(StudentDataBase.getAllStudents()));
    }
}
