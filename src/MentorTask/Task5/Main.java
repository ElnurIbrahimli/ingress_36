package MentorTask.Task5;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "Employee Name";
        System.out.println("Employee reference (name in Employee): " + emp.name);


        Person personRef = emp;


        personRef.name = "Person Name";
        System.out.println("Person reference (name in Person): " + personRef.name);


        System.out.println("Employee reference (name in Employee): " + emp.name);
        System.out.println("Person reference (name in Person): " + personRef.name);


    }
}
