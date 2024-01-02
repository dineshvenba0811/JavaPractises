import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static  void main(String args[]){

        BiPredicate<Integer,Double> biPredicate = (gradeLevel, gpa) ->  gradeLevel>=3.7 && gpa >=3.9;
        BiConsumer<String, List<String>> biConsumer=(name,activities) -> System.out.println(name+","+activities);

        List<Student> studentDatabase= StudentDataBase.getAllStudents();
        studentDatabase.forEach(student -> {
            if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
                biConsumer.accept(student.getName(),student.getActivities());
            }
                }

        );

    }
}
