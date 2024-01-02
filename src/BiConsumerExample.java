import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static  void main (String args[]){
        List<Student> studentDatabase= StudentDataBase.getAllStudents();
        // both attributes combined .
        BiConsumer<String,List<String>> biConsumer=(name,activities) -> System.out.println(name+";"+activities);
        studentDatabase.forEach(studentDatabaseObj ->
                biConsumer.accept(studentDatabaseObj.getName(),studentDatabaseObj.getActivities()));
    }
}
