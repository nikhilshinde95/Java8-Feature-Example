package InterFaceFeatureInJava8;

@FunctionalInterface
public interface Test1 {

    public void func1();

    //default Methods
    default void m1(){
        System.out.println("Wrting Default Method In Interface");
    }


    default boolean isPalindrome(String str){
        if (str.length()==0){
            return false;
        }
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if (start!=end){
                return false;
            }
        }
        return true;
    }


    //Static Methods
    static void m2(){
        System.out.println("Writing Static Method in Interface");
    }

    static int findMax(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


}
