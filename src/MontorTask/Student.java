package MontorTask;
import java.util.UUID;

public class Student {
    String name;
    String id;
    int grade;


    public Student(String name, int grade) {
        this.id= UUID.randomUUID().toString();
        this.name=name;
        this.grade=grade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=%s, id=%s, grade=%d]".formatted(name, id,grade);
}




}
