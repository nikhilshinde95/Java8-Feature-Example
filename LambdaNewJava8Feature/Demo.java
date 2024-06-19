package LambdaNewJava8Feature;

public class Demo {
    public static void main(String[] args) {

        int id = 1;
        String name="Nikhil Shinde";
        String city="Sangli";


        Student stud = ()->{
            System.out.println("Id is "+id);
            System.out.println("Student Name is "+name);
            System.out.println("Student City is " +city);

        };
        stud.StudentDetails();

        Runnable ob = ()->{
            for (int i=0;i<=10;i++){
                System.out.print(i+" ");
                try {
                    Thread.sleep(2000);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(ob);
        t1.start();




    }
}
