import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main (String args[]){
      List<Student> studentList=  StudentDataBase.getAllStudents();
        Predicate<Student> studentPredicateGpa=(student -> student.getGpa() >=3.5);
        Predicate<Student> studentPredicateGrade=(student -> student.getGradeLevel() >=3);
        // negate -> negative , does not match condition
        studentList.forEach(student -> {
            if(studentPredicateGpa.and(studentPredicateGrade).negate().test(student)){
                System.out.println(student.getName());
            }
        });
    }
}
