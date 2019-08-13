package be.intecbrussel.streaming;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Opdracht2 {
    public static void main(String[] args) {
        int [] intArray = IntStream.rangeClosed(-2, 3).toArray();

        System.out.println(IntStream
                .of(intArray)
                .reduce(0, (acc, el)-> acc+1));
        System.out.println(IntStream
                .of(intArray)
                .reduce(0, (acc, el)-> acc<el?el:acc));
        System.out.println(IntStream
                .of(intArray)
                .reduce(0, (acc, el)-> acc>el?el:acc));
        OptionalDouble averageOD = IntStream
                .of(intArray)
                .average();
        System.out.println(averageOD.isPresent() ? averageOD.getAsDouble() : "no average");
        System.out.println(IntStream
                .of(intArray)
                .reduce(0, (acc, el)-> acc+el));
        System.out.println(IntStream
                .of(intArray)
                .reduce(0, (acc, el)-> acc+el*el));

        String [] strArray = {"Sorry", "I", "am", "not", "really", "into", "Lambda", "Expressions",
                "that", "much"};
        System.out.println(Stream
                .of(strArray)
                .reduce("", (acc, el) -> acc=="" ? el : acc+";"+el));

    }
}
