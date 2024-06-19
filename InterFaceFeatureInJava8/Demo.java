package InterFaceFeatureInJava8;

public class Demo implements Test1{


    @Override
    public void func1() {
        System.out.println("Writing Interface Implementing Method");
    }


    //here we need not to implement default and static methods in Interface


    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.func1();

        d1.m1(); //Calling Default Method 1st

        String str = "ababa";
        System.out.println(d1.isPalindrome(str));  //Calling 2nd Default Method

        Test1.m2();  //Calling Static Methods With Class Name


        int[] arr= {88,44,33,55,22,99};
        System.out.println(Test1.findMax(arr)); //Calling Test1 Class Static Method findMax





    }
}
