import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleOne {
    public static void main(String args[]){

        // to get all the data from the student database
        // consumer method can be reused to print the statemets.
        List<Student> studentDatabase= StudentDataBase.getAllStudents();
        //Consumer<Student> student=(studentobject) -> System.out.println(studentobject);
        Consumer<Student> studentNames=(studentobject) -> System.out.print(studentobject.getName());
        Consumer<Student> studentActivites=(studentobject) -> System.out.println(studentobject.getActivities());

        studentDatabase.forEach(studentGrade -> {
            if(studentGrade.getGradeLevel() >3 && studentGrade.getGpa() >= 3.8){
                studentNames.andThen(studentActivites).accept(studentGrade);
            }
        });
        //studentDatabase.forEach(studentNames.andThen(studentActivites));

    }

}
