package ConstructorRefereranceJava8Feature;

public class App {

    public static void main(String[] args) {

        //Implementing  Student Class Constructor With Lambda Expression
        Demo1 d1=()->{
            return new Student();
        };

        Student student = d1.getStudent();
        student.stud();

        //Constructor Reference
        Demo1 d2 = Student::new;
        d2.getStudent();

    }
}
