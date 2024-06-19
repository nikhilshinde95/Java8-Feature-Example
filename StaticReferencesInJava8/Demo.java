package StaticReferencesInJava8;

import java.time.LocalDate;

public class Demo {


    public static int factorial_iterative(int no){
        int result=1;
        for(int i=1;i<=no;i++){
            result=result*i;
        }
        return result;
    }


    public static void printEvenNum(){
        for (int i=0;i<=50;i++){
            if (i%2==0){
                System.out.print(i+" ");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }

    public static void printDate(){
        LocalDate now = LocalDate.now();
        System.out.println("Printing Date Here " + now);
    }

}
