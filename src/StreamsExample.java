import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        // filter the students with gpa greater than 3 along with their activities.

        Predicate<Student> studentGpaPredicate = (student ->student.getGpa()>=3 );
        Predicate<Student> studentGradeLevelPredicate = (student ->student.getGradeLevel()>=3 );

        Map<String, List<String>> studentMap=StudentDataBase.getAllStudents().stream() // stream operation
                .filter(studentGpaPredicate) // intermediate operation
                .filter(studentGradeLevelPredicate) // intermediate operation
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); // terminal operation

        System.out.println(studentMap);

        // debugging the streams
        Map<String, List<String>> studentMapDebug=StudentDataBase.getAllStudents().stream() // stream operation
                .peek(student -> System.out.println(student) )
                .filter(studentGpaPredicate) // intermediate operation
                .filter(studentGradeLevelPredicate) // intermediate operation
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); // terminal operation

        System.out.println(studentMap);

    }
}
