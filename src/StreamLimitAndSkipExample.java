import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamLimitAndSkipExample {
    public static int getStudentsWithTotalNotebooksLimit(List<Student> studentList){
        return studentList
                .stream()
                .limit(2) // only first 2 students data are considered.
                .filter(students -> students.getGpa() >=3.8)
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
                //   .reduce(0, Integer::max);
                //   .reduce(0, Integer::min);
                // identity is the default value
    }
    public static int getStudentsWithTotalNotebooksSkip(List<Student> studentList){
        return studentList
                .stream()
                .skip(2) // only first 2 students data are skipped.
                .filter(students -> students.getGpa() >=3.8)
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
        //   .reduce(0, Integer::max);
        //   .reduce(0, Integer::min);
        // identity is the default value
    }
    public static void main(String[] args) {
        System.out.println(getStudentsWithTotalNotebooksLimit(StudentDataBase.getAllStudents()));
        System.out.println(getStudentsWithTotalNotebooksSkip(StudentDataBase.getAllStudents()));

    }
}
