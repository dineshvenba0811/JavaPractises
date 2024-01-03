import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {

    public static void main(String[] args){
// converts list into map
        BiPredicate<Integer,Double> biPredicate=(bipredicateGrade, bipredicateGpa)->bipredicateGrade>=3 && bipredicateGpa>=2.5;
// one input and one output
        Function<List<Student>, Map<String,Double>> studentFunction= (students) -> {
            Map<String,Double> studentMap=new HashMap<>();

            students.forEach(student -> {
                if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
                    studentMap.put(student.getName(),student.getGpa());
                }
            });
            return studentMap;
        };

        studentFunction.apply( StudentDataBase.getAllStudents());
    }
}
