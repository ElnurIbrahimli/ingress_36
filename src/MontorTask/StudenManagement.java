package MontorTask;

import java.util.Objects;

public class StudenManagement {
    private static final Student[] STUDENTS = new Student[10];//constant

    public static void printAllStudents() {
        for (Student student : STUDENTS)
            System.out.println(student);
    }

    public static void addStudent(Student student) {
        if (Objects.nonNull(student)) ;
        for (int i = 0; i < STUDENTS.length; i++) {
            if (Objects.isNull(STUDENTS[i])) {
                STUDENTS[i] = student;
                break;
            }
        }

    }







    //TODO: bali 70den yuxari olan butun telebeleri ekrana capa veren method hazirla
    //new methods

    public static void main(String[] args) {
        addStudent(new Student("test-name", 100));
        printAllStudents();
        //TODO: yeni yazilan methodu buradan cagir


    }

}



