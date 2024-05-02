package Lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCaseName = (name, age) ->{
            if(name.isBlank()) throw new IllegalArgumentException("Error in validation");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Jack", 25));
    }
}
