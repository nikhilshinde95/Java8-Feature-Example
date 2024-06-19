package InstanceReferenceInJava8;

public class App {

    public static void main(String[] args) {

        //Implementing Instance Method in Method Reference Java 8 New Feature

        NormalClass ob = new NormalClass();

        Demo1 d1 = ob::printDetails;
        d1.printDetails();


        Runnable r1 = ob::printingOddNum;
        Thread t1 = new Thread(r1);
        t1.start();

    }
}
