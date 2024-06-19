package StreamAPIFeatureInJava8;

import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {


        List<Integer> list=List.of(11,22,33,44,55,66,77,88);


        //Using Stream API
        List<Integer> newList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("Printing New List Element" + newList);

        list.stream().forEach((e)->{
            System.out.print(e+" ");
        });


    }

}
