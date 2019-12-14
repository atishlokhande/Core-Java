package java8_Stream;

import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String []args){

        //int arr1[] = {1,2,3,4,5};
        Stream stream=Stream.of(new Integer[]{1,2,3,4,5});
        stream.forEach(p->System.out.println(p));

    }
}
