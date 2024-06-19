package StaticReferencesInJava8;

public class App {
    public static void main(String[] args) {


        //Implementing Body to abstract method by using static reference

        Test1 t1 = Demo::factorial_iterative;
        System.out.println(t1.factorial(5));


        Runnable ob = Demo::printEvenNum;
        Thread t2 = new Thread(ob);
        t2.start();

        Runnable ob1 = Demo::printDate;
        Thread t3 = new Thread(ob1);
        t3.start();


    }
}
