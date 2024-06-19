package InstanceReferenceInJava8;

import java.util.Arrays;

public class NormalClass {


    public  void printDetails(){
        System.out.println("Calling Instance Method ...");
    }


    public void printingOddNum(){

        for (int i=0;i<=100;i++){
            if (i%2!=0){
                System.out.print(i+" ");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
