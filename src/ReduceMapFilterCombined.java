import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class ReduceMapFilterCombined {
    public static int getStudentsWithTotalNotebooks(List<Student> studentList){
       return studentList
               .stream()
               .filter(students -> students.getGpa() >=3.8)
               .map(Student::getNoteBooks)
               .reduce(0, Integer::sum);

    }
    public static void main(String[] args) {
        // get the students with the total no of notebooks
        System.out.println(getStudentsWithTotalNotebooks(StudentDataBase.getAllStudents()));
    }
}
